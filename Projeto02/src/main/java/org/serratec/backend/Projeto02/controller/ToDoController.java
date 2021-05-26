package org.serratec.backend.Projeto02.controller;

import java.util.List;

import org.serratec.backend.Projeto02.dominio.ToDoEntity;
import org.serratec.backend.Projeto02.service.ToDoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/todo")
public class ToDoController {
	
	@Autowired
	ToDoService service;
	
	@GetMapping
	public List<ToDoEntity> toDo() {
		return service.create();
	}

}
