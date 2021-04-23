package com.seguros.asap.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.seguros.asap.entity.Apolice;
import com.seguros.asap.entity.Cliente;

public interface ApoliceRepository extends MongoRepository<Apolice, String> {

	List<Apolice> findByCliente(Cliente cliente);
}
