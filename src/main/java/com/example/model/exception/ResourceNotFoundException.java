package com.example.model.exception;

import lombok.Getter;

@Getter
public class ResourceNotFoundException extends RuntimeException {

	private static final long serialVersionUID = -7090904037089846270L;
	
	private String msg;
	
	public ResourceNotFoundException(String msg)
	{
		super(msg);
		
		this.msg = msg;
	}
}
