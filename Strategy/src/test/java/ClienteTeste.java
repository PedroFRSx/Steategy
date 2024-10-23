import org.example.CartaoCredito;
import org.example.Cliente;
import org.example.Dinheiro;
import org.example.Pix;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ClienteTeste {

    @Test
    public void devePagarComDinheiro() {
        Cliente cliente = new Cliente();
        cliente.pagar(100.0f, new Dinheiro());
        assertEquals(100.0f, cliente.getTotalPagamento(), 0.001); // Adicionado delta
    }

    @Test
    public void devePagarComPix() {
        Cliente cliente = new Cliente();
        cliente.pagar(100.0f, new Pix());
        assertEquals(100.0f, cliente.getTotalPagamento(), 0.001); // Adicionado delta
    }

    @Test
    public void devePagarComCartaoCredito() {
        Cliente cliente = new Cliente();
        cliente.pagar(100.0f, new CartaoCredito());
        assertEquals(105.0f, cliente.getTotalPagamento(), 0.001); // Adicionado delta
    }
}