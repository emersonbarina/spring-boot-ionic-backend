package com.emersonbarina.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.emersonbarina.cursomc.domain.Pedido;
import com.emersonbarina.cursomc.repositories.PedidoRepository;
import com.emersonbarina.cursomc.services.exceptions.ObjectNotFoundException;

@Service
public class PedidoService {

	@Autowired
	private PedidoRepository repo;
	
	//public Pedido buscar(Integer id) {
	//	Pedido Obj = repo.findOne(id);
	//	return obj;
	//	}

	public Pedido find(Integer id) {
		Optional<Pedido> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: " + id + ", Tipo: " + Pedido.class.getName()));
		}
}
