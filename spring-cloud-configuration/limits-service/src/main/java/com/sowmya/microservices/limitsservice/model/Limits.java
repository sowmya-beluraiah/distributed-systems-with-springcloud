package com.sowmya.microservices.limitsservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Limits {
	private int minimum;
	private int maximum;
}
