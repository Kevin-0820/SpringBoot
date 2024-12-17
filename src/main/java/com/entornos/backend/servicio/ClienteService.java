package com.entornos.backend.servicio;



import java.util.List;

import com.entornos.backend.modelo.Cliente;
import com.entornos.backend.repositorio.ClienteRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Usuario
 */
@Service
@Transactional
public class ClienteService implements IClienteService{

    @Autowired
    private ClienteRepositorio clienteRepo;

    @Override
    public List<Cliente> getClientes() {
        return clienteRepo.findAll();
    }

    @Override
    public Cliente getCliente(Long id) {
        return clienteRepo.findById(id).orElse(null);
    }

    @Override
    public Cliente grabarCliente(Cliente cliente) {
        return clienteRepo.save(cliente);
    }

    @Override
    public void delete(Long id) {
        clienteRepo.deleteById(id);
    }

}