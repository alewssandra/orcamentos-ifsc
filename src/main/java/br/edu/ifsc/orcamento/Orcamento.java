/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifsc.orcamento;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

/**
 *
 * @author Aluno
 */
public class Orcamento {
    private int codigo;
    private ArrayList<Procedimento> procedimentos;
    private Date data;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public ArrayList<Procedimento> getProcedimentos() {
        return procedimentos;
    }

    public void setProcedimentos(Procedimento... procedimentos) {
        this.procedimentos = new ArrayList<>(Arrays.asList(procedimentos));
    }
    
    public void addProcedimento(Procedimento procedimento) {
        this.procedimentos.add(procedimento);
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }
    
    public double getValor() {
        double soma = 0;
        
        for (Procedimento procedimento : this.procedimentos) {
            soma += procedimento.getValor();
        }
        
        return soma;
    }

    @Override
    public String toString() {
        String res = "";
        res += "Orçamento = " + codigo + "\n";
        res += "Data = " + data + "\n";
        res += "Procedimentos\n";
        for (Procedimento procedimento: procedimentos){
            res+="\t\t"+ procedimento+ "\t"+procedimento.getValor()+"\n";
        }
        res+= "Valor total " + getValor();

        return res;
    }
    
    
}
