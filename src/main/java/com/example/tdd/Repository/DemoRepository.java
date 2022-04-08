package com.example.tdd.Repository;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public class DemoRepository {

	public String getText() {
		return "Repo";
	}
	
	public List<String> getArray() {
		List<String> items = Arrays.asList("A", "B");
		return items;
	}
}
