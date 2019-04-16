
package carrinhodecompras;

import java.util.Scanner;

public class GerenciarCompra {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Fornecedor[] fornecedores;
        Produto[] produtos;
        Cesta cesta;

        produtos = new Produto[15];
        fornecedores = new Fornecedor[15];
        cesta = new Cesta();
        int forn = 0;
        int prod = 0;

        while (op != 9) {
            System.out.println("1 - Cadastrar Fornecedor");
            System.out.println("2 - Cadastrar Produto");
            System.out.println("3 - Abrir Carrinho");
            System.out.println("4 - Fechar Carrinho");
            System.out.println("9 - Sair");

            int op = scan.nextInt();

            switch (op) {

                case 1:

                    fornecedores[forn] = new Fornecedor();
                    fornecedores[forn].setIdForn(forn);
                    System.out.println("");
                    System.out.println("Nome:... ");
                    fornecedores[forn].setNome(scan.next());
                    System.out.println("");
                    System.out.println("Contato:... ");
                    fornecedores[forn].setContato(scan.next());
                    System.out.println("");
                    System.out.println("Telefone:... ");
                    fornecedores[forn].setFone(scan.next());
                    System.out.println("");
                    System.out.println("E-mail");
                    fornecedores[forn].setEmail(scan.next());
                    forn++;
                    break;

                case 2:

                    produtos[prod] = new Produto();
                    produtos[prod].setCodProd(prod);
                    System.out.println("Código do Fornecedor:... ");
                    produtos[prod].setFornecedor(fornecedores[scan.nextInt()]);
                    System.out.println("");
                    System.out.println("Descrição produto:... ");
                    produtos[prod].setDescricao(scan.next());
                    System.out.println("");
                    System.out.println("Preço produto:....");
                    produtos[prod].setPreco(scan.nextDouble());
                    p++;
                    break;
                case 3:
                    System.out.println("1 - Adicionar Item");
                    System.out.println("2 - Exibir lista");
                    System.out.println("3 - Calcular total");

                    switch (scan.nextInt()) {

                        case 1:
                            System.out.println("Digite o número do produto:... ");
                            cesta.adicionarItem(produtos[scan.nextInt()]);
                            break;
                        case 2:
                            cesta.exibirLista();
                            break;
                        case 3:
                            cesta.cacularTotal();
                            break;
                    }

                    break;
                case 4:
                    cesta.exibeLista();
                    break;
                case 5:
                    System.out.println("Obrigado volte sempre!! ");
                    System.exit(0);
                    break;

            }
        }

    }
}
