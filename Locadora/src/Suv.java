public class Suv extends Veiculos {

    private double portamala;
    private String tracao;
    private String combustivel;


    public Suv(String marca, String modelo, String placa, int ano, double valorLocacao, double portamala, String tracao, String combustivel) {
        super(marca, modelo, placa, ano, valorLocacao);
        this.portamala = portamala;
        this.tracao = tracao;
        this.combustivel = combustivel;

    }
    @Override
    public double valorMulta(){
        double valorTotalMulta = 0 ;
        if(getRenovacoes()>3){
            valorTotalMulta = getMulta()*getRenovacoes()-3;
            return valorTotalMulta;
        }else
            return valorTotalMulta;
    }

    public double getPortamala() {
        return portamala;
    }

    public void setPortamala(double portamala) {
        this.portamala = portamala;
    }

    public String getTracao() {
        return tracao;
    }

    public void setTracao(String tracao) {
        this.tracao = tracao;
    }

    public String getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(String combustivel) {
        this.combustivel = combustivel;
    }
}
