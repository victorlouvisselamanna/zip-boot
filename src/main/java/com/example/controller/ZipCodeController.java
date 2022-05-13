package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.ZipCode;
import com.example.model.dto.ZipCodeDTO;
import com.example.service.ZipCodeService;

@RestController
@RequestMapping("/zipCode")
public class ZipCodeController {

	@Autowired
	private ZipCodeService zipCodeService;
	
	@GetMapping
	public List<ZipCode> findAll()
	{
		return zipCodeService.findAll();
	}
	
	@GetMapping(path = "/{id}")
	public ZipCode findById(@PathVariable String id)
	{
		return zipCodeService.findById(id);
	}
	
	@PostMapping
	public ZipCodeDTO create(@RequestBody ZipCodeDTO dto)
	{
		return zipCodeService.create(dto);
	}
	
	@PutMapping
	public ZipCodeDTO update(@RequestBody ZipCodeDTO dto)
	{
		return zipCodeService.update(dto);
	}
	
	@DeleteMapping(path = "/{id}")
	public void deleteById(@PathVariable String id)
	{
		zipCodeService.deleteById(id);
	}
}
