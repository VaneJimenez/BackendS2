package com.apirests2.backends2.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.apirests2.backends2.models.Usuario;

public interface UsuarioRepo extends JpaRepository<Usuario, Long>{
 
}
