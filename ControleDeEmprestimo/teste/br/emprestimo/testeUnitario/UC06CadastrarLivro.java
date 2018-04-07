package br.emprestimo.testeUnitario;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import br.emprestimo.modelo.Livro;

public class UC06CadastrarLivro {
	static private Livro livro;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
			livro = new Livro();
			livro.setIsbn("121212");
			livro.setTitulo("Engenharia de Software");
			livro.setAutor("Pressman");
	
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}
	@Test
	public void CT07UC06CadastrarLivro_Com_Isbn_Valido(){
		assertEquals("121212", livro.getIsbn());
	}
	@Test
	public void CT08UC06CadastrarLivro_Com_Titulo_Valido(){
		assertEquals("Engenharia de Software", livro.getTitulo());
	}
	@Test
	public void CT09UC06CadastrarLivro_Com_Autor_Valido(){
		assertEquals("Pressman", livro.getAutor());
	}
	@Test(expected = RuntimeException.class)
	public void CT01UC06CadastrarLivro_Com_Isbn_EmBranco(){
		livro.setIsbn("");
	}
	@Test(expected = RuntimeException.class)
	public void CT02UC06CadastrarLivro_Com_Isbn_Nulo(){
		livro.setIsbn(null);
	}
	@Test(expected = RuntimeException.class)
	public void CT03UC06CadastrarLivro_Com_titulo_EmBranco(){
		livro.setTitulo("");
	}
	@Test(expected = RuntimeException.class)
	public void CT04UC06CadastrarLivro_Com_titulo_Nulo(){
		livro.setTitulo(null);
	}
	@Test(expected = RuntimeException.class)
	public void CT05UC06CadastrarLivro_Com_Autor_EmBranco(){
		livro.setAutor("");
	}
	@Test(expected = RuntimeException.class)
	public void CT06UC06CadastrarLivro_Com_Autor_Nulo(){
		livro.setAutor(null);
	}
}
