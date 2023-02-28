package com.cloud.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cloud.dao.HospitalRepository;
import com.cloud.entity.Hospital;
import com.cloud.service.HospitalSetService;

/**
 * 實作醫院配置
 * 
 * @author oscar51011
 *
 */
@Service
public class HospitalSetServiceImpl implements HospitalSetService {
	
	@Autowired
	private HospitalRepository hospitalRepository;

	@Override
	public List<Hospital> findAllHospitalInfo() {
		return hospitalRepository.findAll();
	}

}
