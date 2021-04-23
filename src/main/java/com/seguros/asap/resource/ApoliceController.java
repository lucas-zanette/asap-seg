package com.seguros.asap.resource;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.seguros.asap.entity.Apolice;
import com.seguros.asap.repository.ApoliceRepository;

@RestController
public class ApoliceController {

	@Autowired
	private ApoliceRepository repository;
	
	@PostMapping("/addApolice")
	public String saveApolice(@Valid @RequestBody Apolice apolice) {
		repository.save(apolice);
		return "Apolice number: " + apolice.getNumeroApolice() + " added  !!";
	}
		
	@GetMapping("/findAllApolices")
	public List<Apolice> findAllApolices(){
		return repository.findAll();
	}	
	
	@GetMapping("/findAllApolices/{id}")
	public Optional<Apolice> findAllApolices(@PathVariable String id){
		return repository.findById(id);
	}
	
    @RequestMapping(value = "/deleteApolice/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable String id) {
    	repository.deleteById(id);
    }
	
}
