package com.devsuperior.bootcamp2.services;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devsuperior.bootcamp2.dto.ClientDTO;
import com.devsuperior.bootcamp2.entities.Client;
import com.devsuperior.bootcamp2.repositories.ClientRepository;
import com.devsuperior.bootcamp2.services.exceptions.ResourceNotFoundException;

@Service
public class ClientService {
	
	@Autowired
	private ClientRepository clientRepository;
	
	@Transactional(readOnly = true)
	public List<ClientDTO> findAll() {
		List<Client> list =  clientRepository.findAll();
		return list.stream().map(x -> new ClientDTO(x)).collect(Collectors.toList());
	}
	
	@Transactional(readOnly = true)
	public ClientDTO findById(Long id) {
		Optional<Client> cli =  clientRepository.findById(id);
		Client entity = cli.orElseThrow(() -> new ResourceNotFoundException("ClientService: Entity not found"));
		return new ClientDTO(entity);
	}

}
