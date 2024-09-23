import java.util.ArrayList;
import java.util.List;

public class Estoque {
    private List<Produto> produtos;

    public Estoque() {
        produtos = new ArrayList<>();
    }

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }

    public void removerProduto(String nome) {
        produtos.removeIf(p -> p.getNome().equals(nome));
    }

    public Produto buscarProduto(String nome) {
        return produtos.stream().filter(p -> p.getNome().equals(nome)).findFirst().orElse(null);
    }

    public List<Produto> listarProdutos() {
        return produtos;
    }
}
