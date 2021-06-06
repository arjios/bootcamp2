package com.devsuperior.bootcamp2.resources;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.bootcamp2.entities.Client;

@RestController
@RequestMapping(value = "/clients")
public class ClientResource {

	@GetMapping
	public ResponseEntity<List<Client>> findAllClients() {
		List<Client> list = new ArrayList<>();
		list.add(new Client(1L, "Antonio Alves", "88546136815", 10000.00, Instant.now(), 1));
		list.add(new Client(2L, "Antonio Alves", "88546136816", 10000.00, Instant.now(), 1));
		list.add(new Client(3L, "Antonio Alves", "88546136817", 10000.00, Instant.now(), 1));
		list.add(new Client(4L, "Antonio Alves", "88546136818", 10000.00, Instant.now(), 1));
		list.add(new Client(5L, "Antonio Alves", "88546136819", 10000.00, Instant.now(), 1));
		list.add(new Client(6L, "Antonio Alves", "88546136810", 10000.00, Instant.now(), 1));
		list.add(new Client(7L, "Antonio Alves", "88546136811", 10000.00, Instant.now(), 1));
		list.add(new Client(8L, "Antonio Alves", "88546136812", 10000.00, Instant.now(), 1));
		list.add(new Client(9L, "Antonio Alves", "88546136813", 10000.00, Instant.now(), 1));
		list.add(new Client(10L, "Antonio Alves", "88546136814", 10000.00, Instant.now(), 1));
		list.add(new Client(11L, "Antonio Alves", "88546136801", 10000.00, Instant.now(), 1));
		return ResponseEntity.ok().body(list);
	}
}
