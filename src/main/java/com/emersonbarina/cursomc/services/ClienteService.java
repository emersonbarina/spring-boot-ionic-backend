package com.emersonbarina.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.emersonbarina.cursomc.domain.Cliente;
import com.emersonbarina.cursomc.repositories.ClienteRepository;
import com.emersonbarina.cursomc.services.exceptions.ObjectNotFoundException;

@Service
public class ClienteService {

	@Autowired
	private ClienteRepository repo;
	
	//public Cliente buscar(Integer id) {
	//	Cliente Obj = repo.findOne(id);
	//	return obj;
	//	}

	public Cliente find(Integer id) {
		Optional<Cliente> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: " + id + ", Tipo: " + Cliente.class.getName()));
		}
}
