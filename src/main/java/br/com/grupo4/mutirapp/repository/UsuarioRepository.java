package br.com.grupo4.mutirapp.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import br.com.grupo4.mutirapp.model.Usuario;

public interface UsuarioRepository extends CrudRepository<Usuario, Integer> {
	Usuario findByEmail(String email);
	List<Usuario> findByName(String name);
	
}
