import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    private Estoque estoque = new Estoque();
    private ControleVendas controleVendas = new ControleVendas();

    @Override
    public void start(Stage primaryStage) {
        VBox root = new VBox();
        Scene scene = new Scene(root, 400, 400);
        
        // Adicionando um produto
        TextField txtNome = new TextField();
        txtNome.setPromptText("Nome do Produto");
        TextField txtPreco = new TextField();
        txtPreco.setPromptText("Preço do Produto");
        TextField txtQuantidade = new TextField();
        txtQuantidade.setPromptText("Quantidade");

        Button btnAdicionar = new Button("Adicionar Produto");
        btnAdicionar.setOnAction(e -> {
            String nome = txtNome.getText();
            double preco = Double.parseDouble(txtPreco.getText());
            int quantidade = Integer.parseInt(txtQuantidade.getText());
            estoque.adicionarProduto(new Produto(nome, preco, quantidade));
            txtNome.clear();
            txtPreco.clear();
            txtQuantidade.clear();
            Alert alert = new Alert(Alert.AlertType.INFORMATION, "Produto Adicionado!");
            alert.show();
        });

        root.getChildren().addAll(txtNome, txtPreco, txtQuantidade, btnAdicionar);

        primaryStage.setTitle("Controle de Estoque e Vendas");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
