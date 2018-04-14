package br.emprestimo.testeUnitario;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import br.emprestimo.modelo.Usuario;

public class UC03CadastrarUsuario {
	static private Usuario usuario;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		usuario = new Usuario();
		usuario.setRa("11111");
		usuario.setNome("Jose da Silva");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}
	
	@Test(expected = RuntimeException.class)
	public void UC03CT01CadastrarUsuario_RA_EmBranco(){
		usuario.setRa("");
	}
	@Test(expected = RuntimeException.class)
	public void UC03CT02CadastrarUsuario_Nome_EmBranco(){
		usuario.setNome("");
	}
	@Test(expected = RuntimeException.class)
	public void UC03CT03CadastrarUsuario_RA_Nulo(){
		usuario.setRa(null);
	}
	@Test(expected = RuntimeException.class)
	public void UC03CT04CadastrarUsuario_Nome_Nulo(){
		usuario.setNome(null);
	}
	@Test
	public void UC03CT05CadastrarUsuario_RA_Valido(){
		assertEquals("11111", usuario.getRa());
	}
	@Test
	public void UC03CT06CadastrarUsuario_Nome_Valido(){
		assertEquals("Jose da Silva", usuario.getNome());
	}
}
