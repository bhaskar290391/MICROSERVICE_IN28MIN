package com.practise.junit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

public class AssertionTest {

	@Test
	public void assertionTest() {
		
		List<String> data=Arrays.asList("bhaskar","mudaliyar","maddy");
		
		assertEquals(3, data.size());
		assertTrue(data.contains("bhaskar"));
		assertFalse(data.contains("bhaskar2"));
	}
}
