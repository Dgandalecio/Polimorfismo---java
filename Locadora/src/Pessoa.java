public abstract class Pessoa {

    private String nome;
    private String telefone;
    private String endereço;
    private boolean limite;

    public Pessoa(String nome, String telefone, String endereço ) {
        this.nome = nome;
        this.telefone = telefone;
        this.endereço = endereço;
        this.limite = true;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereço() {
        return endereço;
    }

    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }

    public boolean isLimite() {
        return limite;
    }

    public void setLimite(boolean limite) {
        this.limite = limite;
    }
}
