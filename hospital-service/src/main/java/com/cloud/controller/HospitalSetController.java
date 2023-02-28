package com.cloud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cloud.entity.Hospital;
import com.cloud.service.HospitalSetService;
import io.swagger.v3.oas.annotations.tags.Tag;

/**
 * 實現醫院配置API
 * 
 * @author oscar51011
 *
 */
@RestController
@RequestMapping("/hospital")
@Tag(name = "醫院服務")
public class HospitalSetController {

	@Autowired
	private HospitalSetService hospitalSetService;

	@GetMapping
	public Boolean findAllHostipalInfo() {

		List<Hospital> list = hospitalSetService.findAllHospitalInfo();
		if (list.size() > 0)
			return true;

		return false;
	}
}
