import java.util.List;
import java.util.ArrayList;

public class Locadora {

    private String nome;
    private String endereco;
    private String telefone;

    private List<Veiculos> carros = new ArrayList<>();
    private List<Pessoa> clientes = new ArrayList<>();
    private List<Emprestimo> emprestimosRealizados = new ArrayList<>();



    public Locadora(String nome, String endereco, String telefone) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    public List<Veiculos> veiculosVisponiveis(){
        List<Veiculos> carrosDisponiveis = new ArrayList<>();
        for(int i =0;i <carros.size();i++){
            if(carros.get(i).isDisponivel()){
                Veiculos carro = carros.get(i);
                carrosDisponiveis.add(carro);
            }
        }
        return carrosDisponiveis;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public List<Veiculos> getCarros() {
        return carros;
    }

    public void setCarros(List<Veiculos> carros) {
        this.carros = carros;
    }

    public List<Pessoa> getClientes() {
        return clientes;
    }

    public void setClientes(List<Pessoa> clientes) {
        this.clientes = clientes;
    }

    public List<Emprestimo> getEmprestimosRealizados() {
        return emprestimosRealizados;
    }

    public void setEmprestimosRealizados(List<Emprestimo> emprestimosRealizados) {
        this.emprestimosRealizados = emprestimosRealizados;
    }

}