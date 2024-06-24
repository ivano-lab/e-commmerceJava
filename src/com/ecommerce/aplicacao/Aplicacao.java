package com.ecommerce.aplicacao;

import com.ecommerce.dominio.*;
import com.ecommerce.servico.*;

public class Aplicacao {
    public static void main(String[] args) {
        ProdutoService produtoService = new ProdutoService();
        ClienteService clienteService = new ClienteService();
        PedidoService pedidoService = new PedidoService();

        Produto produto1 = new Produto("Produto 1", 100.0, 2);
        Produto produto2 = new Produto("Produto 2", 50.0, 1);
        produtoService.adicionarProduto(produto1);
        produtoService.adicionarProduto(produto2);

        Cliente cliente = new Cliente("Cliente 1", "cliente1@example.com");
        clienteService.adicionarCliente(cliente);

        Carrinho carrinho = new Carrinho();
        carrinho.adicionarProduto(produto1);
        carrinho.adicionarProduto(produto2);

        Pedido pedido = new Pedido(cliente, carrinho);
        pedidoService.adicionarPedido(pedido);

        System.out.println("Produtos cadastrados: ");
        for (Produto p : produtoService.listarProdutos()) {
            System.out.println(p);
        }

        System.out.println("\nClientes cadastrados: ");
        for (Cliente c : clienteService.listarClientes()) {
            System.out.println(c);
        }

        System.out.println("\nPedidos realizados: ");
        for (Pedido p : pedidoService.listarPedidos()) {
            System.out.println(p);
        }
    }
}

