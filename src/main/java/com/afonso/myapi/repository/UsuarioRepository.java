package com.afonso.myapi.repository;

import com.afonso.myapi.domain.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.yaml.snakeyaml.events.Event;

@Repository
public interface UsuarioRepository extends JpaRepository <Usuario, Integer>{
}
