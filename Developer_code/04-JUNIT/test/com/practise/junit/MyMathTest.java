package com.practise.junit;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.practise.junit.MyMath;

class MyMathTest {

	MyMath math=new MyMath();
	
	
	
	@Test
	void calculateSumTest() {
		int number[]={1,2,3};
		assertEquals(6, math.calculateSum(number));
	}

	
	@Test
	void calculateSumTest_ZeroMember() {
		int number[]={};
		assertEquals(0, math.calculateSum(number));
	}
}
