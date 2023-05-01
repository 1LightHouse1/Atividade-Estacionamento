import java.util.*;

public class App 
{
    static Scanner teclado = new Scanner(System.in);
    static Estacionamento estacionamento = new Estacionamento("TADS ESTACIONAMENTO", "41900112233");

    static String menuApp(){
        String menu = "";

        menu += "|||||TADS ESTACIONAMENTO|||||\n\n";
        menu += "1 - Cadastrar Veiculo\n";
        menu += "2 - Registrar entrada veículo\n";
        menu += "3 - Registrar saida veículo\n";
        menu += "4 - Buscar veículo\n";
        menu += "5 - Listar todos veículos\n";
        menu += "6 - Listar veículos estacionado\n";
        menu += "0 - Sair\n\n";
        menu += "Digite uma opcao:";

        return menu;
    }
                                                                 
    static void cadastrarVeiculo(){
        String placa;
        String modelo;
        String fabricante;
        int anoFabricacao;
        String cor;
        teclado.nextLine();

        System.out.println("Digite a placa do carro:");
        placa = teclado.nextLine();

        System.out.println("Digite o modelo do carro:");
        modelo = teclado.nextLine();

        System.out.println("Digite a fabricante do carro:");
        fabricante = teclado.nextLine();

        System.out.println("Digite a cor do carro:");
        cor = teclado.nextLine();

        System.out.println("Digite o ano de fabricacao do carro:");
        anoFabricacao = teclado.nextInt();

        estacionamento.cadastraVeiculo(placa, modelo, fabricante, anoFabricacao, cor);

        System.out.println("Cadastro Concluido.\n");        
    }      
    
    static void registraEntrada(){
        String placa;
        teclado.nextLine();

        System.out.println("Digite a placa do veiculo que irá entrar:");
        placa = teclado.nextLine();

        System.out.println(estacionamento.registraEntrada(placa));
    }

    static void registraSaida(){
        String placa;
        teclado.nextLine();

        System.out.println("Digite a placa do veiculo estacionado:");
        placa = teclado.nextLine();

        System.out.println(estacionamento.registraSaida(placa));        
    }

    static void buscarVeiculo(){
        String placa;
        teclado.nextLine();

        System.out.println("Digite a placa do veiculo:");
        placa = teclado.nextLine();

        System.out.println(estacionamento.buscarVeiculo(placa));
        
    }

    static void listarTodosVeiculos(){
        System.out.println(estacionamento.listaTodosVeiculos());
    }

    static void listarVeiculosEstacionados(){
        System.out.println(estacionamento.listaVeiculosEstacionados());
    }

    
    public static void main( String[] args )
    {
        int opcao=0;

        do{
            System.out.println(menuApp());
            opcao = teclado.nextInt();

            switch(opcao){
                case 1:
                    cadastrarVeiculo();
                break;
                case 2:
                    registraEntrada();
                break;
                case 3:
                    registraSaida();
                break;
                case 4:
                    buscarVeiculo();
                break;
                case 5:
                    listarTodosVeiculos();
                break;
                case 6:
                    listarVeiculosEstacionados();
                break;
                default:
                    if(opcao != 0){
                        System.out.println("Opção inválida!!");
                    }
                    
            }
        }while(opcao != 0);

    }
}