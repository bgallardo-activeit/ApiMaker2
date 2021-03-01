package com.byrohchiproyect.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.byrohchiproyect.persona.model.Usuario;

@Repository("gestorUsuario")
public interface GestorUsuario extends JpaRepository<Usuario, Serializable>{
	
	public abstract Usuario findByUsuario(String usuario);

}
