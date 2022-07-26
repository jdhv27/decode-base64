package com.jdhv.decodebase64.service.impl;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

import org.springframework.stereotype.Service;

import com.jdhv.decodebase64.model.DecodeBase64Request;
import com.jdhv.decodebase64.model.DecodeBase64Response;
import com.jdhv.decodebase64.service.DecodeBase64Service;

@Service
public class DecodeBase64ServiceImpl implements DecodeBase64Service {

	@Override
	public DecodeBase64Response decodeBase64(DecodeBase64Request request) {

		String decodedString = switch (request.getDecodeType()) {
		case "base64" ->
			new String(Base64.getDecoder().decode(request.getEncodedText().getBytes()), StandardCharsets.ISO_8859_1);
		case "base64url" ->
			new String(Base64.getUrlDecoder().decode(request.getEncodedText().getBytes()), StandardCharsets.ISO_8859_1);
		case "mime" -> new String(Base64.getMimeDecoder().decode(request.getEncodedText().getBytes()),
				StandardCharsets.ISO_8859_1);
		default -> throw new IllegalArgumentException("Unexpected value: " + request.getDecodeType());
		};

		return new DecodeBase64Response(decodedString);

	}

}
