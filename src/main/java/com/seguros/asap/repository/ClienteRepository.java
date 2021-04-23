package com.seguros.asap.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.seguros.asap.entity.Cliente;

public interface ClienteRepository extends MongoRepository<Cliente, String>{




}
