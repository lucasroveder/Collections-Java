import java.util.List;
import java.util.ArrayList;

public class CarrinhoCompras {
    //atributo
    private List<Item> compras;

    public CarrinhoCompras(){
        this.compras = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade){
        compras.add(new Item(nome, preco, quantidade));
    }

    public void removerItem (String nome){
        List<Item> remove = new ArrayList<>();

        for (Item aux : compras){
            if (aux.getNome().equals(nome)){
                remove.add(aux);
            }
        }
        compras.removeAll(remove);
    }

    public double calcularValorTotal(){
        double valorTotal = 0;
        for (Item e : compras){
            valorTotal = valorTotal + (e.getPreco()*e.getQuantidade());
        }
        return valorTotal;
    }

    public void exibirItens(){
        System.out.println(compras);

    }

    public static void main(String[] args) {
        CarrinhoCompras teste = new CarrinhoCompras();

        teste.adicionarItem("bala 7 belo", 0.50, 10);
        teste.adicionarItem("chocolate", 5.10, 1);
        teste.adicionarItem("pao", 3.20, 2);
        teste.adicionarItem("OMO", 18.50, 1);
        teste.exibirItens();
        teste.removerItem("bala 7 belo");
        teste.exibirItens();
        System.out.println(teste.calcularValorTotal());
    }


}
