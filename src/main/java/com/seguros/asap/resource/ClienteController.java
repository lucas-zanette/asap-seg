package com.seguros.asap.resource;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.seguros.asap.entity.Cliente;
import com.seguros.asap.repository.ClienteRepository;


@Validated
@RestController
public class ClienteController {

	@Autowired
	ClienteRepository repository;
	
	@RequestMapping(value = "/addCliente", method = RequestMethod.POST)
    public Cliente save(@RequestBody @Valid Cliente cliente) {
        return repository.save(cliente);
    } 	
	
    @RequestMapping(value = "/addCliente", method = RequestMethod.PUT)
    public Cliente edit(@RequestBody Cliente cliente) {
        return repository.save(cliente);
    } 	
	
	@GetMapping("/findAllClientes")
	public List<Cliente> findAllCliente(){
		return repository.findAll();
	}
	
	@GetMapping("/findAllClientes/{id}")
	public Optional<Cliente> findAllCliente(@PathVariable String id){
		return repository.findById(id);
	}

    @RequestMapping(value = "/deleteCliente/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable String id) {
    	repository.deleteById(id);
    }
	
}
