package com.practise.__Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.practise.__Mockito.business.BusinessImpl;
import com.practise.__Mockito.business.DataService;
import com.practise.__Mockito.business.DataServiceIMPL;

@ExtendWith(MockitoExtension.class)
class StubTest {

	@Test
	void test() {

		DataServiceIMPL service=new DataServiceIMPL();
		BusinessImpl business=new BusinessImpl(service);
		assertEquals(26, business.findTheGreatesNumber());
	}

}
