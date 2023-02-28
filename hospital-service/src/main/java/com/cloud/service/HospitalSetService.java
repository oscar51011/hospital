package com.cloud.service;

import java.util.List;

import com.cloud.entity.Hospital;

/**
 * 定義醫院配置介面
 * @author oscar51011
 *
 */
public interface HospitalSetService {

	public List<Hospital> findAllHospitalInfo();
}
