package com.jdhv.decodebase64.util;

import com.jdhv.decodebase64.model.DecodeBase64Request;
import com.jdhv.decodebase64.model.DecodeBase64Response;

public class TestUtils {
	
	public static DecodeBase64Response getResponse () {
		DecodeBase64Response response = new DecodeBase64Response("plainText");
		return response;
	}
	
	public static DecodeBase64Request getRequestWithBase64Format () {
		return new DecodeBase64Request("base64", "dGV4dFBsYWlu");
	}
	
	public static DecodeBase64Request getRequestWithBase64UrlFormat () {
		return new DecodeBase64Request("base64url", "dGV4dFBsYWlu");
	}
	
	public static DecodeBase64Request getRequestWithMimeFormat () {
		return new DecodeBase64Request("mime", "dGV4dFBsYWlu");
	}
	
	public static DecodeBase64Request getRequestWithWrongFormat () {
		return new DecodeBase64Request("any", "plainText");
	}

}
