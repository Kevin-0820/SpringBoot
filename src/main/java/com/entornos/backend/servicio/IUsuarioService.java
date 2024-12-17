package com.entornos.backend.servicio;


import java.util.List;

import com.entornos.backend.modelo.LoginDto;
import com.entornos.backend.modelo.Usuario;
import com.entornos.backend.modelo.UsuarioDto;
import org.springframework.http.ResponseEntity;

public interface IUsuarioService {

    List<Usuario> getUsuarios();

    Usuario nuevoUsuario(UsuarioDto usuarioDto);

    Usuario buscarUsuario(Long id);

    int borrarUsuario(Long id);

    int login(LoginDto usuarioDto);

    ResponseEntity<?> ingresar(LoginDto usuarioDto);

}
