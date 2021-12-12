package com.sowmya.microservices.limitsservice.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@ConfigurationProperties("limits-service")
@Data
@Component
public class Configuration {

	private int minimum;
	private int maximum;
}
