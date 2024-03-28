package com.educandoweb.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educandoweb.course.entities.user;
import com.educandoweb.course.repositories.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository repository;
	
	public List<user> findAll(){
		return repository.findAll();
		
	}
	
	public user findById(Long id) {
		Optional<user> obj = repository.findById(id);
		return obj.get();
		
	}
	
}
