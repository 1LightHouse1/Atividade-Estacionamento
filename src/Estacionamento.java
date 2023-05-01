import java.util.*;

public class Estacionamento{
    private String nome;
    private String telefone;
    private ArrayList<Veiculo> veiculos;

    public Estacionamento(String nome, String telefone){
        this.nome = nome;
        this.telefone = telefone;
        this.veiculos = new ArrayList<>();
    }

    public boolean cadastraVeiculo(String placa, String modelo, String fabricante, int anoFabricacao, String cor){
        for(Veiculo aux:veiculos){
            if(aux.getPlaca().equals(placa)){
                return false;
            }
        }

        Veiculo veiculo = new Veiculo(placa, modelo, fabricante, anoFabricacao, cor);
        veiculos.add(veiculo);

        return true;
    }

    public ArrayList<Veiculo> listaTodosVeiculos(){
        return veiculos;
    }

    public ArrayList<Veiculo> listaVeiculosEstacionados(){
        
        ArrayList<Veiculo> estacionados = new ArrayList<>();

        for(Veiculo aux : veiculos){
            if(aux.isEstaEstacionado() == true){
                estacionados.add(aux);
            }
        }
    
        return estacionados;

    }

    public Veiculo buscarVeiculo(String placa){
        for(Veiculo aux:veiculos){
            if(aux.getPlaca().equals(placa)){
                return aux;
            }
        }
        return null;
    }

    public boolean registraEntrada(String placa){
        for(Veiculo aux:veiculos){
            if(aux.getPlaca().equals(placa) && aux.isEstaEstacionado() == false){
                aux.registraEntrada();
                return true;
            }
        }
        return false;
    }

    public boolean registraSaida(String placa){
        for(Veiculo aux:veiculos){
            if(aux.getPlaca().equals(placa) && aux.isEstaEstacionado() == true){
                aux.registraSaida();
                return true;
            }
        }
        return false;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getTelefone(){
        return telefone;
    }

    public void setTelefone(String telefone){
        this.telefone = telefone;
    }

    
}
