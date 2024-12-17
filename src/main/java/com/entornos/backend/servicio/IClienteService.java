package com.entornos.backend.servicio;



import com.entornos.backend.modelo.Cliente;

import java.util.List;


/**
 *
 * @author Usuario
 */
public interface IClienteService {

    //Listar todos los Clientes
    List<Cliente> getClientes();

    // Buscar cliente por id
    public Cliente getCliente(Long id);

    // Guardar un cliente
    public Cliente grabarCliente(Cliente cliente);

    // Eliminar un cliente
    public void delete(Long id);


}