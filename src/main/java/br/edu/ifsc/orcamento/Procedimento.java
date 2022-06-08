package br.edu.ifsc.orcamento;

public enum Procedimento {
    HEMOGRAMA(30.0),
    BETA_HCG(80.0),
    TGO(10.0),
    TGP(10.0),
    GLICOSE(10.0),
    TSH(10.0),
    T4_LIVRE(10.0),
    SARS_COV_2_PCR(250.0),
    SARS_COV_2_ANTIGENO(150.0),;
    
    private Procedimento(double valor) {
        this.valor = valor;
    }
    
    private double valor;

    public double getValor() {
        return valor;
    }
}
