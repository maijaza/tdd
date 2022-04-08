package com.example.tdd.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;

import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultMatcher;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
 

import com.example.tdd.Service.DemoService;

@ExtendWith(SpringExtension.class)
@WebMvcTest
public class DemoControllerTest {
	@Autowired
    MockMvc mockMvc;
	
	@MockBean
    private DemoService svc;
	
	@Test
    void getExample01ShouldReturnString() throws Exception {
		
        when(svc.example01()).thenReturn("AAA");
        mockMvc.perform(MockMvcRequestBuilders.get("/ex01")
                .contentType(MediaType.APPLICATION_JSON)
        ).andExpect(content().string("AAA")); //.andDo(print());
    }
}
