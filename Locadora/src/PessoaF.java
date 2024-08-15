public class PessoaF extends Pessoa{

    private String cpf;


    public PessoaF(String nome, String telefone, String endereço, String cpf) {
        super(nome, telefone, endereço);
        this.cpf = cpf;

    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public void setLimite(boolean limite) {
        super.setLimite(limite);
    }
}
