package com.example.model.dto;

import lombok.Data;

@Data
public class ZipCodeDTO {

	private String id;
	
	private String stateCountyCode;
	
	private String zip;
	
	private String county;
	
	private String shortCounty;
	
	private Boolean isMulti;
}
