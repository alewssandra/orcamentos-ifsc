package br.edu.ifsc.orcamento;

import java.util.*;

public class Cliente {

    private int codigo;
    private String nome;
    private String telefone;
    private String cpf;
    private ArrayList<Orcamento> orcamentos = new ArrayList<>();

    public int getCodigo() {

        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public ArrayList<Orcamento> getOrcamentos() {
        return orcamentos;
    }

    public void addOrcamento(Orcamento... orcamento) {
        this.orcamentos.addAll(Arrays.asList(orcamento));
    }

    public Orcamento buscarPorCodigo(int codigoOrcamento) {
        for (Orcamento orcamento : orcamentos) {
            if (orcamento.getCodigo() == codigoOrcamento) {
                return orcamento;
            }
        }
        return null;
    }

    public void removerOrcamento(int codigoOrcamento) {
        Orcamento orcamentoRemover = buscarPorCodigo(codigoOrcamento);
        if (orcamentoRemover != null) {
            this.orcamentos.remove(orcamentoRemover);
        }else{
            System.out.println("Orçamento " + codigoOrcamento + " não encontrado!");
        }

    }

    public void mostrarTodosOrcamentos() {
        ArrayList<Orcamento> orcamentosOrdenados = new ArrayList<>(orcamentos);
        Collections.sort(orcamentosOrdenados, new Comparator<Orcamento>() {
            @Override
            public int compare(Orcamento o1, Orcamento o2) {
                return o2.getData().compareTo(o1.getData());
            }
        });

        for(Orcamento orcamento: orcamentosOrdenados){
            System.out.println(orcamento.toString());
            System.out.println("-------------------");
        }
    }

}
