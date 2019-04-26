package com.formation.SpringTest;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.formation.service.MessageComponent;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class SpringTestApplicationTests {
	
	@Autowired
	public MessageComponent messageProvider;

	@Test
	public void test1() {
		assertEquals("Hello World!", messageProvider.getMessage());
	}

}
