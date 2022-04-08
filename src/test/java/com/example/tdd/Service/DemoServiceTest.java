package com.example.tdd.Service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.when;

//import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.Arrays;
import com.example.tdd.Repository.DemoRepository;
 

public class DemoServiceTest {

	@Mock
	private DemoRepository repo;
	
	@InjectMocks
	private DemoService svc;

	@BeforeEach
	void setUp() {
		MockitoAnnotations.initMocks(this);
	}
	
	@AfterEach
    void tearDown(){
        
    }
	
	@Test
	public void getExampleShouldReturnStringIfCallGetText() {
		
	//	List<String> mockList = Arrays.asList("A");
	//	when(repo.getArray()).thenReturn(mockList);
		
		when(repo.getText()).thenReturn("repo");
		assertEquals("repoexample01",svc.example01());
 
//		Mockito.when(repo.getText()).thenReturn(new ArrayList<E>());
//		
//		
//		Assert.assertEquals(123L, userCount);
//        Mockito.verify(mockRepository).count();
	}
}
