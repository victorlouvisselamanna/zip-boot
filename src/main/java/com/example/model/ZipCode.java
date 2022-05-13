package com.example.model;

import java.util.Date;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Document(collection = "zip_codes")
public class ZipCode {

	@Id
	private String id;
	
	@CreatedDate
	private Date createdAt;
	
	@LastModifiedDate
	private Date lastModifiedAt;
	
	private String stateCountyCode;
	
	private String zip;
	
	private String county;
	
	private String shortCounty;
	
	private Boolean isMulti;
}
