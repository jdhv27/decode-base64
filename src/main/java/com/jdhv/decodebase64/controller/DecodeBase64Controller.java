package com.jdhv.decodebase64.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;
import com.jdhv.decodebase64.model.DecodeBase64Request;
import com.jdhv.decodebase64.model.DecodeBase64Response;
import com.jdhv.decodebase64.service.DecodeBase64Service;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Validated
@RestController
public class DecodeBase64Controller {

	@Autowired
	private DecodeBase64Service decodeBase64Service;

	@ResponseBody
	@PostMapping(value = "${decode-base64.api.decode.path}")
	public ResponseEntity<DecodeBase64Response> decode(@Valid @RequestBody DecodeBase64Request request) {
		log.info("***** Starting decode API *****");
		log.debug("request data: {}", new Gson().toJson(request));
		return new ResponseEntity<>(decodeBase64Service.decodeBase64(request), HttpStatus.OK);
	}

}
