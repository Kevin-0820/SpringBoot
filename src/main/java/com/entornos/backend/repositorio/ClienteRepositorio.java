package com.entornos.backend.repositorio;

import com.entornos.backend.modelo.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepositorio extends JpaRepository<Cliente,Long>{
}
