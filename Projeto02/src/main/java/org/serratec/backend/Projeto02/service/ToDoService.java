package org.serratec.backend.Projeto02.service;

import java.util.Arrays;
import java.util.List;

import org.serratec.backend.Projeto02.dominio.ToDoEntity;
import org.springframework.stereotype.Service;


@Service
public class ToDoService {
	
	
	public List<ToDoEntity> create() {
		return Arrays.asList(
				new ToDoEntity(1, "Ir ao mercado", "Ir ao mercado para comprar o meu jantar"),
				new ToDoEntity(2, "Reunião às 16 horas", "Reunião com fulano de tal as 16 horas"));
	}

}
