package com.helloworld.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class helloController {
@GetMapping("/atividade1")
public String hello() {
	return "A mentalidade que eu utilizei foi a de crescimento, persistencia. Além disso, as habilidades que eu utilizei"
			+ "foram as de programação";
}

@GetMapping("/atividade2")
public String hello2() {
	return "Meus objetivos para essa semana serão aprender mais sobre Spring e revisar alguns assuntos já vistos";
}
}
