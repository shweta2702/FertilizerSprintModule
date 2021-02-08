package com.cg.main.fertilizer;
import static org.junit.Assert.assertTrue;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.cg.main.fertilizer.controller.FertilizerController;


@SpringBootTest
class FertilizerModuleApplicationTests {

	@Autowired
	private FertilizerController controller;
	
	@Test
	void contextLoads() {
		boolean result = true;
		if (controller.equals(null))
			result = false;
		assertTrue(result);
	}	
}
