
package carrinhodecompras;


public class Cesta {

    private Produto[] itens;
    public int contP = 0;
    public double valorTotal = 0;

    public Cesta() {
        itens = new Produto[15];
    }

    public void adicionarItem(Produto produto) {

        itens[contP] = new Produto();
        itens[contP] = produto;
        contP++;
    }

    public void exibirLista() {
       
        if (itens[0] == null) {
            System.out.println("Você não possui nenhum produto no carrinho.");

        } else {
            for (int i = 0; i < contP; i++) {
                System.out.println("Descrição do produto:
                System.out.println("Produto " + i + "..." + itens[i].getDescricao());
                System.out.println("Preço..." + itens[i] + itens[i].getPreco());
            }
        }
    }

    public void cacularTotal() {
        Total = 0;
        for (int i = 0; i < contP; i++) {
            Total += itens[i].getPreco();
        }
        System.out.println("Valor total com a soma é:... " + Total);

    }
}
