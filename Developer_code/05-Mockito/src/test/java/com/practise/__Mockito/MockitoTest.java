package com.practise.__Mockito;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.practise.__Mockito.business.BusinessImpl;
import com.practise.__Mockito.business.DataService;

@ExtendWith(MockitoExtension.class)
class MockitoTest {

	@Mock
	private DataService service;
	
	@InjectMocks
	private BusinessImpl data;

	@Test
	void test() {
		when(service.retrieveData()).thenReturn(new int[] {25,2,3});
		assertEquals(25, data.findTheGreatesNumber());
	}

}
