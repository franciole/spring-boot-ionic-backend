package com.nelioalves.cursomc.domain.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nelioalves.cursomc.domain.Categoria;
import com.nelioalves.cursomc.domain.repositories.CategoriaRepository;

@Service
public class CategoriaService {

	@Autowired
	private CategoriaRepository catRep;

	public Categoria buscar(Integer id) {
		Optional<Categoria> obj = catRep.findById(id);
		return obj.orElse(null);

	}
}
