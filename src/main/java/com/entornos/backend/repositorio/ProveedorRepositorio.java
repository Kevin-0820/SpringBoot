package com.entornos.backend.repositorio;

import com.entornos.backend.modelo.Cliente;
import com.entornos.backend.modelo.Proveedor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProveedorRepositorio  extends JpaRepository<Proveedor, Integer> {
}
