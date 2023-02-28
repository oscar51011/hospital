package com.cloud.entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

/**
 * 醫院實體類
 * @author oscar51011
 *
 */
@Entity
@Data
@Table(name = "HOSPITAL")
public class Hospital {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	@Column(name="HOSPITAL_NAME")
	private String hospitalName;
	
	@Column(name="HOSPITAL_CODE")
	private String hospitalCode;
	
	@Column(name="API_URL")
	private String apiUrl;
	
	@Column(name="SIGN_KEY")
	private String signKey;
	
	@Column(name="CONTACTS_NAME")
	private String contactsName;
	
	@Column(name="CONTACTS_PHONE")
	private String contactsPhone;
	
	@Column(name="STATUS")
	private String status;
	
	@Column(name="CREATE_TIME")
	private Date createTime;
	
	@Column(name="UPDATE_TIME")
	private Date updateTime;
	
}
