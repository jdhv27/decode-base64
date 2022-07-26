package com.jdhv.decodebase64.controller;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.http.ResponseEntity;

import com.google.gson.Gson;
import com.jdhv.decodebase64.model.DecodeBase64Response;
import com.jdhv.decodebase64.service.DecodeBase64Service;
import com.jdhv.decodebase64.util.TestUtils;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RunWith(MockitoJUnitRunner.class)
public class DecodeBase64ControllerTest {

	@Mock
	private DecodeBase64Service decodeBase64Service;

	@InjectMocks
	private DecodeBase64Controller decodeBase64Controller;

	@Test
	public void encodeTest() {
		when(decodeBase64Service.decodeBase64(Mockito.any())).thenReturn(TestUtils.getResponse());
		ResponseEntity<DecodeBase64Response> response = decodeBase64Controller
				.decode(TestUtils.getRequestWithBase64Format());
		log.info("response: {}", new Gson().toJson(response));
		assertNotNull(response);
		assertNotNull(response.getBody());
		assertEquals(200, response.getStatusCodeValue());
	}

}
