public class Luxo extends Veiculos {

    private int airbag;
    private double portamala;
    private boolean gps;

    public Luxo(String marca, String modelo, String placa, int ano, double valorLocacao, int airbag, double portamala, boolean gps) {
        super(marca, modelo, placa, ano, valorLocacao);
        this.airbag = airbag;
        this.portamala = portamala;
        this.gps = gps;
    }
    @Override
    public double valorMulta(){
        double valorTotalMulta = 0 ;
        if(getRenovacoes()>5){
            valorTotalMulta = getMulta()*getRenovacoes()-5;
            return valorTotalMulta;
        }else
            return valorTotalMulta;
    }

    public int getAirbag() {
        return airbag;
    }

    public void setAirbag(int airbag) {
        this.airbag = airbag;
    }

    public double getPortamala() {
        return portamala;
    }

    public void setPortamala(double portamala) {
        this.portamala = portamala;
    }

    public boolean isGps() {
        return gps;
    }

    public void setGps(boolean gps) {
        this.gps = gps;
    }
}
