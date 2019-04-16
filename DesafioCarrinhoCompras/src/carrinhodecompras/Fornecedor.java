
package carrinhodecompras;

public class Fornecedor {

    private int idForn;
    private String nome;
    private String contato;
    private String fone;
    private String email;


    public int getIdForn() {
        return idForn;
    }

    public void setIdForn(int idForn) {
        this.idForn = idForn;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void imprimirFornecedor(){

    System.out.println("IdForn:..." + getIdForn());
    System.out.println("Nome:..." + getNome());
    System.out.println("Contato:..." + getContato());
    System.out.println("Fone:..." + getFone());    
    System.out.println("E-mail:..." + getEmail());
   } 

}
