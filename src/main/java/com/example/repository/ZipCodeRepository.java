package com.example.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.model.ZipCode;

public interface ZipCodeRepository extends MongoRepository<ZipCode, String> {
	
}
