package com.practise.__Mockito.business;

public class BusinessImpl {

	private DataService service;

	public BusinessImpl(DataService service) {
		super();
		this.service = service;
	}

	public int findTheGreatesNumber() {

		int[] datas = service.retrieveData();
		int temp = Integer.MIN_VALUE;
		for (int data : datas) {
			if (data > temp) {
				temp = data;
			}
		}

		return temp;
	}
}
