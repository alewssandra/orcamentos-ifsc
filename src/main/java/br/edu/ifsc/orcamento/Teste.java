/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifsc.orcamento;

import java.time.Instant;
import java.util.Date;

public class Teste {
    public static void main(String[] args) {
        ControladorCliente clientes = new ControladorCliente();
        
        Cliente cliente1 = new Cliente();
        cliente1.setNome("Pedro");
        cliente1.setCpf("123.123.123-22");
        cliente1.setTelefone("9999999999");
        
        Orcamento o1 = new Orcamento();
        o1.setCodigo(1);
        o1.setData(new Date());
        o1.setProcedimentos(Procedimento.TSH,
                Procedimento.SARS_COV_2_ANTIGENO,
                Procedimento.TGO, Procedimento.BETA_HCG, Procedimento.TGP);
        
        Orcamento o2 = new Orcamento();
        o2.setCodigo(2);
        o2.setData(Date.from(Instant.now().plusSeconds(50000)));
        o2.setProcedimentos(Procedimento.TSH, 
                Procedimento.BETA_HCG,
                Procedimento.T4_LIVRE);
        
        cliente1.addOrcamento(o1, o2);
        
        clientes.salvar(cliente1);
        
        System.out.println("Cliente 1: " + cliente1.getNome());
        clientes.buscarPorCPF("123.123.123-22").mostrarTodosOrcamentos();
        
        Cliente cliente2 = new Cliente();
        cliente2.setNome("Julio");
        cliente2.setCpf("000.000.000-00");
        cliente2.setTelefone("88888888888");
        
        Orcamento o3 = new Orcamento();
        o3.setCodigo(3);
        o3.setData(new Date());
        o3.setProcedimentos(Procedimento.T4_LIVRE,
                Procedimento.BETA_HCG,
                Procedimento.HEMOGRAMA);
        
        Orcamento o4 = new Orcamento();
        o4.setCodigo(4);
        o4.setData(new Date());
        o4.setProcedimentos(
                Procedimento.SARS_COV_2_PCR);
        
        cliente2.addOrcamento(
                o3, o4
        );
        
        cliente2.removerOrcamento(4);
        clientes.salvar(cliente2);
        
        System.out.println("\n\nCliente 2: " + cliente2.getNome());
        clientes.buscarPorCPF("000.000.000-00").mostrarTodosOrcamentos();
    }
}
