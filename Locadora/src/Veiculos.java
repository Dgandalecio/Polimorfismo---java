public abstract class Veiculos {

    private String marca;
    private String modelo;
    private String placa;
    private int ano;
    private double valorLocacao;
    private boolean disponivel;
    private int renovacoes;
    private double multa;

    public Veiculos(String marca, String modelo, String placa, int ano, double valorLocacao) {
        this.marca = marca;
        this.modelo = modelo;
        this.placa = placa;
        this.ano = ano;
        this.valorLocacao = valorLocacao;
        this.disponivel= true;
        this.renovacoes = 0;
        this.multa = 0;

    }

    public void renovarAluguel(){
      this.renovacoes++;
    }

    public double valorMulta(){
        return this.multa * this.renovacoes;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public double getValorl() {
        return valorLocacao;
    }

    public void setValorl(double valorLocacao) {
        this.valorLocacao = valorLocacao;
    }

    public double getValorLocacao() {
        return valorLocacao;
    }

    public void setValorLocacao(double valorLocacao) {
        this.valorLocacao = valorLocacao;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    public int getRenovacoes() {
        return renovacoes;
    }

    public void setRenovacoes(int renovacoes) {
        this.renovacoes = renovacoes;
    }

    public double getMulta() {
        return multa;
    }

    public void setMulta(double multa) {
        this.multa = multa;
    }
}
