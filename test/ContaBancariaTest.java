import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ContaBancariaTest {
    @Test
    public void testCreditoEDebitoContaNormal() {
        ContaNormal conta = new ContaNormal("BancoX", 1, 123, 100.0, "2025-04-29");
        conta.creditar(50.0);
        conta.debitar(30.0);
        assertEquals(120.0, conta.getSaldo(), 0.01);
    }

    @Test
    public void testLimiteContaEspecial() {
        ContaEspecial conta = new ContaEspecial("BancoY", 1, 456, 100.0, "2025-04-29");
        conta.debitar(1000.0);
        assertTrue(conta.getSaldo() < 0);
    }
}
