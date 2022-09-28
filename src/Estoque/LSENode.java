package Estoque;

public class LSENode {
    // Atributos
    private Produto info;
    private LSENode prox;
// Método construtor      
    public LSENode(Produto valor) {
        this.info = valor;
    }
// Métodos SET
    public void setInfo(Produto valor) {
        this.info = valor;
    }
    public void setProx(LSENode novoProx) {
        this.prox = novoProx;
    }
// Métodos GET
    public Produto getInfo() {
        return this.info;
    }
    public LSENode getProx() {
        return this.prox;
    }
}

