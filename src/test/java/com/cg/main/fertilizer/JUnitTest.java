package com.cg.main.fertilizer;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.cg.main.fertilizer.model.Fertilizer;
import com.cg.main.fertilizer.service.IFertilizerService;

@SpringBootTest
class JUnitTest {

	@Autowired
	private IFertilizerService service;

	/*
	 * @BeforeEach is used to signal that the annotated method should be executed
	 * before each @Test
	 */
	@BeforeEach
	void setUp() throws Exception {
		System.out.println(".........******TEST STARTED******.......");
	}

	/*
	 * @AfterEach is used to signal that the annotated method should be executed
	 * after each @Test
	 */
	@AfterEach
	void tearDown() throws Exception {
		System.out.println("......******TEST FINISHED******.........");
	}

	/*
	 * test to add list
	 */

	@Test
	void test() {
		Fertilizer fertilizer = service
				.addFertilizer(new Fertilizer("Threesholder", 180.0, 4, "Sticks", "farm product", "threess months"));
		assertEquals("Threesholder", fertilizer.getProductName());
	}
	/*
	 * test to get fertilizer using Id
	 */

	@Test
	void test2() {
		Fertilizer fertilizer = service.getFertilizer(1);
		assertEquals(1, fertilizer.getProductId());
	}

	/*
	 * test to delete fertilizer using id
	 */
	@Test
	void test3() {
		List<Fertilizer> fertilizer = service.deleteFertilizer(21);
		assertNotNull(fertilizer);
	}

	/*
	 * test to update the list
	 */
	@Test
	void test4() {
		Fertilizer fertilizer = service
				.updateFertilizer(new Fertilizer("Threesholder", 180.0, 4, "Sticks", "farm product", "threess months"));
		assertEquals("Threesholder", fertilizer.getProductName());
	}

	/*
	 * test to get all fertilizer list
	 */
	@Test
	void test5() {
		List<Fertilizer> fertilizer = service.getAllFertilizer();
		boolean result = true;
		if (fertilizer.equals(null)) {
			result = false;
		}
		assertTrue(result);
	}

	/*
	 * test to get all list by using product name
	 */
	@Test
	void test6() {
		List<Fertilizer> fertilizer = service.getAllFertilizer("Evana");
		boolean result = true;
		if (fertilizer.equals(null)) {
			result = false;
		}
		assertTrue(result);
	}
}
