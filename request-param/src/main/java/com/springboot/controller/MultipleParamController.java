package com.springboot.controller;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.springboot.model.MultipleParam;
import com.springboot.repository.MultipleParamRepository;

@RestController
public class MultipleParamController {
	
	@Autowired
	private MultipleParamRepository repo;
	
	@GetMapping("/param")
	public List<MultipleParam> getAll(){
		return repo.findAll();
	}
	
	@GetMapping("/param/{id}/{firstname}")
	public ResponseEntity<Optional<MultipleParam>> getparam(@PathVariable long id, @PathVariable String firstname) {
		Optional<MultipleParam> param = repo.findById(id);
		return ResponseEntity.ok().body(param);
	}
	
	public static double getRandomNumber(double min, double max) {
		double r = (int)(Math.random()*(max-min+1)+min);
		return r;
	}
	
	@PostMapping("/param")
	public MultipleParam add(@RequestBody MultipleParam multipleParam) 
			throws JsonGenerationException, JsonMappingException, IOException {
		
		ObjectMapper objectMapper = new ObjectMapper();
		
		MultipleParam multiparam = new MultipleParam();
		
		//Java object to json string
		String jsonString = objectMapper.writeValueAsString(multiparam);
		System.out.println("Java object to Json string "+jsonString);
		
	    int d = (int)getRandomNumber(200,400);
	    System.out.println("From random number generater- "+d);
	    
		return repo.save(multipleParam);
	}

	@DeleteMapping("/param/{id}")
	public void delete(@PathVariable long id) {
		repo.deleteById(id);
	}
}
