package org.example;

import org.example.FormaPagamento;
import org.example.Pagamento;

public class Cliente {

    private float totalPagamento;

    public float getTotalPagamento() {
        return totalPagamento;
    }

    public void pagar(float valor, FormaPagamento formaPagamento) {
        Pagamento pagamento = new Pagamento(valor);
        this.totalPagamento = pagamento.realizar(formaPagamento);
    }
}