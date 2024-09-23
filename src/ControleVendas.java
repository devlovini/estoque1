import java.util.ArrayList;
import java.util.List;

public class ControleVendas {
    private List<Venda> vendas;

    public ControleVendas() {
        vendas = new ArrayList<>();
    }

    public void registrarVenda(Venda venda) {
        vendas.add(venda);
    }

    public double totalVendas() {
        return vendas.stream().mapToDouble(Venda::calcularTotal).sum();
    }

    public List<Venda> listarVendas() {
        return vendas;
    }
}
