package com.nttdata.bootcamp.microserviciocloudreto.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class RetoController {
	
	@Value("${some.description}") private String description;
	
	@Value("${some.author}") private String author;
	
	@Value("${some.sota}") private String sota;
	
	@Value("${some.caballo}") private String caballo;
	
	@Value("${some.rey}") private String rey;
	
	@GetMapping(path = "/description")
	public String getDescription() {
		return this.description;
	}
	
	@GetMapping(path = "/author")
	public String getAuthor() {
		return this.author;
	}
	
	@GetMapping(path = "/sota")
	public String getSota() {
		return this.sota;
	}
	
	@GetMapping(path = "/caballo")
	public String getCaballo() {
		return this.caballo;
	}
	
	@GetMapping(path = "/rey")
	public String getRey() {
		return this.rey;
	}
	
}
