package com.practise.junit;

public class MyMath {

	public int calculateSum(int[] a) {

		int sum = 0;

		for (int i : a) {
			sum +=i;
		}
		return sum;
	}
}
