public class PessoaJ extends Pessoa {

    private String cnpj;
    private String representante;

    public PessoaJ(String nome, String telefone, String endereço, String cnpj, String representante) {
        super(nome, telefone, endereço);
        this.cnpj = cnpj;
        this.representante = representante;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getRepresentante() {
        return representante;
    }

    public void setRepresentante(String representante) {
        this.representante = representante;
    }
    @Override
    public void setLimite(boolean limite) {

    }
}
