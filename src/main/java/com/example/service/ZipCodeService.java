package com.example.service;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.ZipCode;
import com.example.model.dto.ZipCodeDTO;
import com.example.model.exception.ResourceNotFoundException;
import com.example.repository.ZipCodeRepository;

@Service
public class ZipCodeService {

	@Autowired
	private ZipCodeRepository zipCodeRepository;
	
	@Autowired
	private ModelMapper modelMapper;
	
	public List<ZipCode> findAll()
	{
		return zipCodeRepository.findAll();
	}
	
	public ZipCode findById(String id)
	{
		return zipCodeRepository.findById(id)
				                .orElseThrow(() -> new ResourceNotFoundException("No zip code was found with the given id"));
	}
	
	public ZipCodeDTO create(ZipCodeDTO dto)
	{
		ZipCode newZipCode = zipCodeRepository.save(modelMapper.map(dto, ZipCode.class));
		
		return modelMapper.map(newZipCode, ZipCodeDTO.class);
	}
	
	public ZipCodeDTO update(ZipCodeDTO dto)
	{
		ZipCode zipCode = findById(dto.getId());
		
		modelMapper.map(dto, zipCode);
		
		zipCodeRepository.save(zipCode);
		
		return dto;
	}
	
	public void deleteById(String id)
	{
		ZipCode zipCode = findById(id);
		
		zipCodeRepository.delete(zipCode);
	}
}
