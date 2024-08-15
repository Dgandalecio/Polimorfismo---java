public class Emprestimo {
    private Veiculos veiculos;
    private Pessoa pessoa;

    public Emprestimo(Veiculos veiculos, Pessoa pessoa) {
        this.veiculos = veiculos;
        this.pessoa = pessoa;
    }

    public double devolucao(){
        double valorTotal = veiculos.getValorLocacao()+veiculos.valorMulta();
        veiculos.setDisponivel(true);
        pessoa.setLimite(true);
        return valorTotal;
    }

public boolean alugar(){
        if(veiculos.isDisponivel() && pessoa.isLimite()) {
            veiculos.setDisponivel(false);
            pessoa.setLimite(false);
            return true;
        } else
            return false;
}

    public Veiculos getVeiculos() {
        return veiculos;
    }

    public void setVeiculos(Veiculos veiculos) {
        this.veiculos = veiculos;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }
}
