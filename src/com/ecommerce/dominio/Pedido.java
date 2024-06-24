package com.ecommerce.dominio;

import java.time.LocalDate;

public class Pedido {
    private Cliente cliente;
    private Carrinho carrinho;
    private LocalDate data;

    public Pedido(Cliente cliente, Carrinho carrinho) {
        this.cliente = cliente;
        this.carrinho = carrinho;
        this.data = LocalDate.now();
    }

    // Getters
    public Cliente getCliente() {
        return cliente;
    }

    public Carrinho getCarrinho() {
        return carrinho;
    }

    public LocalDate getData() {
        return data;
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "cliente=" + cliente +
                ", carrinho=" + carrinho +
                ", data=" + data +
                '}';
    }
}

