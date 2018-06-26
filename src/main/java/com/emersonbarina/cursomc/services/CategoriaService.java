package com.emersonbarina.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.emersonbarina.cursomc.Repositories.CategoriaRepository;
import com.emersonbarina.cursomc.domain.Categoria;

@Service
public class CategoriaService {

	@Autowired
	private CategoriaRepository repo;
	
	//public Categoria buscar(Integer id) {
	//	Categoria Obj = repo.findOne(id);
	//	return obj;
	//	}

	public Categoria buscar(Integer id) {
		Optional<Categoria> obj = repo.findById(id);
		return obj.orElse(null);
		}
}
