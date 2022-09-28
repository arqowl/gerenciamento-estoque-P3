package Estoque;
public abstract class Produto  implements Comparable <Produto>{
    protected String codigoProduto;
    protected String descricao;
    protected Double valorUnitario;
    protected int qtd;

    
    public Produto(String codigoProduto, String descricao, Double valorUnitario, int qtd) {
        this.codigoProduto = codigoProduto;
        this.descricao = descricao;
        this.valorUnitario = valorUnitario;
        this.qtd = qtd;
    }
    
    public String getCodigoProduto() {
        return codigoProduto;
    }
    public void setCodigoProduto(String codigoProduto) {
        this.codigoProduto = codigoProduto;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public Double getValorUnitario() {
        return valorUnitario;
    }
    public void setValorUnitario(Double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }
    public int getQtd() {
        return qtd;
    }
    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

    @Override
    public String toString() {
        return "Produto [codigoProduto=" + codigoProduto + ", descricao=" + descricao + ", qtd=" + qtd
                + ", valorUnitario=" + valorUnitario + "]";
    }
    
    // Método para comparar dois alunos pela matrícula    
    @Override
    public int compareTo (Produto produto) {
        int result;
        result = this.getCodigoProduto().compareTo(produto.getCodigoProduto());
        return result;
    }
    

    
}
