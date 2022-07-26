package com.jdhv.decodebase64.service;

import com.jdhv.decodebase64.model.DecodeBase64Request;
import com.jdhv.decodebase64.model.DecodeBase64Response;

public interface DecodeBase64Service {
	
	public DecodeBase64Response decodeBase64(DecodeBase64Request request);

}
