package com.cloud.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cloud.entity.Hospital;

/**
 * 醫院DAO
 * @author oscar51011
 *
 */
@Repository
public interface HospitalRepository extends JpaRepository<Hospital, Long>{

}
