package com.cg.main.fertilizer;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.cg.main.fertilizer.model.Fertilizer;
import com.cg.main.fertilizer.repository.FertilizerRepository;
@SpringBootTest
class FertilizerRepositoryTest {
	
	@Autowired
	FertilizerRepository repo;
	
	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void test() {
		List<Fertilizer> fertilizers = repo.findAllByProductName("Blomer");
		String type =fertilizers.get(0).getProductName();
		assertEquals("Blomer", type);
	}
}
