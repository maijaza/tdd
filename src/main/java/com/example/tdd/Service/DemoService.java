package com.example.tdd.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.tdd.Repository.DemoRepository;

@Service
public class DemoService {

	@Autowired
	private DemoRepository repo;
	
	public String example() {
		return "xx";
	}
	
	public String example01() {
		return repo.getText() + "example01";
	}
}
