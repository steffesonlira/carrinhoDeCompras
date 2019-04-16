
package carrinhodecompras;

public class Produto {

    private int codProd;
    private String descricao;
    private Double preco;
    private Fornecedor fornecedor;


    public int getCodProd() {
        return codProd;
    }

    public void setCodProd(int codProd) {
        this.codProd = codProd;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    public void imprimirEtiqueta() {
     
     System.out.println("Codigo peoduto:..."+ getCodProd());
     System.out.println("Descrição:..."+getDescricao());
     System.out.println("Preço:..." +getPreco());
   } 
}
