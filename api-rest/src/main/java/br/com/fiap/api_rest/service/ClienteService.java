package br.com.fiap.api_rest.service;

import br.com.fiap.api_rest.dto.ClienteRequest;
import br.com.fiap.api_rest.dto.ClienteResponse;
import br.com.fiap.api_rest.model.Cliente;
import org.springframework.stereotype.Service;

@Service
public class ClienteService {

    public Cliente requestToCliente(ClienteRequest clienteRequest) {
        return new Cliente(null, clienteRequest.getNome(), clienteRequest.getIdade());

    }

    public ClienteResponse clienteToResponse(Cliente cliente) {
        return new ClienteResponse(cliente.getId(), cliente.getNome());
    }



}
