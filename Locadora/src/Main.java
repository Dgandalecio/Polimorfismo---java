
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        Locadora locadora = new Locadora("louca doura","rua das paranoias 1307","69696969");


            //cadastrar veiculo popular
            System.out.println("Cadastro Popular");
            System.out.println("Marca: ");
            String marca = leitor.nextLine();
            System.out.println("Modelo: ");
           String  modelo = leitor.nextLine();
            System.out.println("Placa: ");
            String placa = leitor.nextLine();
            System.out.println("Ano: ");
            int ano = leitor.nextInt();
            System.out.println("Valor Locacao: ");
            double valorLocacao = leitor.nextDouble();
            System.out.println("Arcondicinado, True ou False: ");
           boolean arcondicionado = leitor.hasNextBoolean();

            Popular popular = new Popular(marca,modelo,placa,ano,valorLocacao,arcondicionado);
            locadora.getCarros().add(popular);

        //Cadastrar Veiculos SUV
        System.out.println("Cadastro SUV");
        System.out.println("Marca: ");
        leitor.nextLine();
        leitor.nextLine();
         marca = leitor.nextLine();
        System.out.println("Modelo: ");
         modelo = leitor.nextLine();
        System.out.println("Placa: ");
         placa = leitor.nextLine();
        System.out.println("Ano: ");
         ano = leitor.nextInt();
        System.out.println("Valor Locacao: ");
         valorLocacao = leitor.nextDouble();
        System.out.println("Porta Mala: ");
         double portamala = leitor.nextDouble();
        System.out.println("Tração: ");
        leitor.nextLine();
         String tracao = leitor.nextLine();
        System.out.println("Combustivel: ");
         String combustivel = leitor.nextLine();

        Suv suv = new Suv(marca,modelo,placa,ano,valorLocacao,portamala,tracao,combustivel);
        locadora.getCarros().add(suv);

        //Cadastrar Veiculos LUXO
        System.out.println("Cadastro Luxo");
        System.out.println("Marca: ");
        marca = leitor.nextLine();
        System.out.println("Modelo: ");
        modelo = leitor.nextLine();
        System.out.println("Placa: ");
        placa = leitor.nextLine();
        System.out.println("Ano: ");
        ano = leitor.nextInt();
        System.out.println("Valor Locacao: ");
        valorLocacao = leitor.nextDouble();
        System.out.println("AirBag: ");
        int airbag = leitor.nextInt();
        System.out.println("Porta Mala: ");
        portamala = leitor.nextDouble();
        System.out.println("GPS, True ou False: ");
        boolean gps = leitor.hasNextBoolean();

        Luxo luxo = new Luxo(marca,modelo,placa,ano,valorLocacao,airbag,portamala,gps);
        locadora.getCarros().add(luxo);

            //cadastrar pessoa f
        System.out.println("Nome");
        leitor.nextLine();
        leitor.nextLine();
        String nome = leitor.nextLine();
        System.out.println("Telefone: ");
        String telefone = leitor.nextLine();
        System.out.println("Endereco: ");
        String endereco = leitor.nextLine();
        System.out.println("cpf: ");
        String cpf = leitor.nextLine();
        PessoaF pessoaF = new PessoaF(nome,telefone,endereco,cpf);
        locadora.getClientes().add(pessoaF);

        //cadastrar pessoa j
        System.out.println("Nome");
         nome = leitor.nextLine();
        System.out.println("Telefone: ");
         telefone = leitor.nextLine();
        System.out.println("Endereco: ");
         endereco = leitor.nextLine();
        System.out.println("CNPJ: ");
        String cnpj = leitor.nextLine();
        System.out.println("Representante: ");
        String representante = leitor.nextLine();

        PessoaJ pessoaJ = new PessoaJ(nome,telefone,endereco,cnpj,representante);
        locadora.getClientes().add(pessoaJ);


        //Instanciando um objeto emprestimo e chamando o metodo alugar.
        Emprestimo emprestimo = new Emprestimo(popular,pessoaF);
        System.out.println("Alugar Veiculo: "+emprestimo.alugar());

        //Adicionando na lista de emprestimos
        System.out.println(locadora.getEmprestimosRealizados().add(emprestimo));

        //Emprestimos Realizados
        for(int i = 0;i<locadora.getEmprestimosRealizados().size();i++){
            System.out.println("Emprestimos Realizado");
            System.out.println("Cliente nome: "+locadora.getEmprestimosRealizados().get(i).getPessoa().getNome());
            System.out.println("Placa Veiculo: "+locadora.getEmprestimosRealizados().get(i).getVeiculos().getPlaca());
            System.out.println("----------------------");
        }

        //Veiculos Disponiveis
        for(int i = 0;i <locadora.veiculosVisponiveis().size();i++ ){
            System.out.println("Veiculos Disponiveis");
            System.out.println("Modelo: "+locadora.veiculosVisponiveis().get(i).getModelo());
            System.out.println("Marca: "+locadora.veiculosVisponiveis().get(i).getMarca());
            System.out.println("Ano: "+locadora.veiculosVisponiveis().get(i).getAno());
            System.out.println("Valor Locacao: "+locadora.veiculosVisponiveis().get(i).getValorLocacao());
            System.out.println("Valor Multa: "+locadora.veiculosVisponiveis().get(i).getMulta());
            System.out.println("----------------------");
        }

        //Devolução emprestimo 
        System.out.println("Valor Devolução emprestimo: "+emprestimo.devolucao());

    }


}
