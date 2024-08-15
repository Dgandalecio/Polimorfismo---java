public class Popular extends Veiculos {

    private boolean arcondicionado;

    public Popular(String marca, String modelo, String placa, int ano, double valorLocacao, boolean arcondicionado) {
        super(marca, modelo, placa, ano, valorLocacao);
        this.arcondicionado = arcondicionado;
    }

    @Override
    public double valorMulta(){
        double valorTotalMulta = 0 ;
    if(getRenovacoes()>1){
        valorTotalMulta = getMulta()*getRenovacoes()-1;
        return valorTotalMulta;
        }else
        return valorTotalMulta;
    }



    public boolean isArcondicionado() {
        return arcondicionado;
    }

    public void setArcondicionado(boolean arcondicionado) {
        this.arcondicionado = arcondicionado;
    }

}
