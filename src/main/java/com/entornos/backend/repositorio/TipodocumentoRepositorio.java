package com.entornos.backend.repositorio;


import com.entornos.backend.modelo.Tipodocumento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TipodocumentoRepositorio  extends JpaRepository<Tipodocumento,Long> {
}
