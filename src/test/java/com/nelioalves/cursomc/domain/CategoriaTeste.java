package com.nelioalves.cursomc.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.persistence.ManyToMany;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import com.nelioalves.cursomc.repositories.ProdutoRepository;

class CategoriaTeste implements Serializable {

	private static final long serialVersionUID = 1L;

	@Mock
	private ProdutoRepository produtoRepository;

	@Mock
	private Categoria cat;

	@Mock
	@ManyToMany(mappedBy = "categorias")
	private List<Produto> produtos = new ArrayList<>();

	@Test
	void categoriaAtributos() {
		Categoria cat = new Categoria();
		Integer num1 = 1;
		cat.setId(num1);
		cat.setNome("Teste");

		Assert.assertEquals(num1, cat.getId());
		Assert.assertEquals("Teste", cat.getNome());
	}

	@Test
	public void categoriaConstructor() {
		Integer num2 = 1;
		String nome2 = "TesteCat";
		cat = new Categoria(num2, nome2);
		Assert.assertEquals(num2, cat.getId());
		Assert.assertEquals(nome2, cat.getNome());
	}

	@Test
	public void testandoUmaLista() {
		Produto p1 = new Produto(null, "Computador", 2000.00);
		Produto p2 = new Produto(null, "Impressora", 800.00);
		Produto p3 = new Produto(null, "Mouse", 80.00);

		@SuppressWarnings("unused")
		List<Produto> lista = new ArrayList<>();
		lista = Arrays.asList(p1, p2, p3);

		Assert.assertEquals("Computador",p1.getNome());
		Assert.assertEquals("Impressora",p2.getNome());
		Assert.assertEquals("Mouse",p3.getNome());

	}

}
