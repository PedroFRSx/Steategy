package org.example;

public class Pagamento {

    private float valor;

    public Pagamento(float valor) {
        this.valor = valor;
    }

    public float realizar(FormaPagamento formaPagamento) {
        return formaPagamento.processar(valor);
    }
}
