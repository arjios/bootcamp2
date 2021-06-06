package com.devsuperior.bootcamp2.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.devsuperior.bootcamp2.entities.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {

}