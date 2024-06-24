package com.ecommerce.servico;

import com.ecommerce.dominio.Cliente;

import java.util.ArrayList;
import java.util.List;

public class AuthService {
    private List<Cliente> clientes = new ArrayList<>();

    public void registrar(Cliente cliente) {
        clientes.add(cliente);
    }

    public Cliente login(String email, String senha) {
        for (Cliente cliente : clientes) {
            if (cliente.getEmail().equals(email) && cliente.getSenha().equals(senha)) {
                return cliente;
            }
        }
        return null;
    }
}

