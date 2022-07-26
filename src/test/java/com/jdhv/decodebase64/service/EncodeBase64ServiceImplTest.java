package com.jdhv.decodebase64.service;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;

import com.google.gson.Gson;
import com.jdhv.decodebase64.model.DecodeBase64Response;
import com.jdhv.decodebase64.service.impl.DecodeBase64ServiceImpl;
import com.jdhv.decodebase64.util.TestUtils;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RunWith(MockitoJUnitRunner.class)
public class EncodeBase64ServiceImplTest {
	
	@InjectMocks
	private DecodeBase64ServiceImpl encodeBase64ServiceImpl;

	@Test
	public void encodeInBase64Test() {
		DecodeBase64Response response = encodeBase64ServiceImpl.decodeBase64(TestUtils.getRequestWithBase64Format());
		log.info("response: {}", new Gson().toJson(response));
		assertNotNull(response);
		assertNotNull(response.getTextPlain());
	}
	
	@Test
	public void encodeInBase64URLTest() {
		DecodeBase64Response response = encodeBase64ServiceImpl.decodeBase64(TestUtils.getRequestWithBase64UrlFormat());
		log.info("response: {}", new Gson().toJson(response));
		assertNotNull(response);
		assertNotNull(response.getTextPlain());
	}
	
	@Test
	public void encodeInMimeTest() {
		DecodeBase64Response response = encodeBase64ServiceImpl.decodeBase64(TestUtils.getRequestWithMimeFormat());
		log.info("response: {}", new Gson().toJson(response));
		assertNotNull(response);
		assertNotNull(response.getTextPlain());
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void encodeInDefaultTest() {
		encodeBase64ServiceImpl.decodeBase64(TestUtils.getRequestWithWrongFormat());
	}

}
