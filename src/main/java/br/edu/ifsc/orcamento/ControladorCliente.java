/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifsc.orcamento;

import java.util.ArrayList;

/**
 * @author Aluno
 */
public class ControladorCliente {
    private ArrayList<Cliente> clientes = new ArrayList<>();

    public ArrayList<Cliente> getClientes() {

        return clientes;
    }

    public void salvar(Cliente c) {

        this.clientes.add(c);
    }

    public Cliente buscarPorCPF(String cpf) {
        for(Cliente cliente: clientes){
            if(cliente.getCpf().equals(cpf)){
                return cliente;
            }
        }
        return null;
    }

    public void removerPorCpf(String cpf) {
        Cliente clienteRemover = buscarPorCPF(cpf);
        if(clienteRemover!=null){
            this.clientes.remove(clienteRemover);
        }else{
            System.out.println("Cliente " + cpf + " não encontrado!");
        }
    }
}
