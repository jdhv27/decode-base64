package com.jdhv.decodebase64.model;

import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class DecodeBase64Request {
	
	@NotBlank(message = "decodeType is mandatory")
	@JsonProperty(value = "decodeType")
	private String decodeType;
	
	@NotBlank(message = "encodedText is mandatory")
	@JsonProperty(value = "encodedText")
	private String encodedText;

}
