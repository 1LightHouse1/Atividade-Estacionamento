public class Veiculo {

    private String placa;
    private String modelo; 
    private String fabricante;
    private int anoFabricacao;
    private String cor;
    private boolean estaEstacionado;

    public Veiculo(String placa, String modelo, String fabricante, int anoFabricacao, String cor){
        this.placa = placa;
        this.modelo = modelo;
        this.fabricante = fabricante;
        this.anoFabricacao = anoFabricacao;
        this.cor = cor;
    }

    public String getPlaca(){
        return placa;
    }

    public void setPlaca(String placa){
        this.placa = placa;
    }

    public String getModelo(){
        return modelo;
    }

    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public String getFabricante(){
        return fabricante;
    }

    public void setFabricante(String fabricante){
        this.fabricante = fabricante;
    }

    public int getAnoFabricacao(){
        return anoFabricacao;
    }

    public void setAnoFabricacao(int anoFabricacao){
        this.anoFabricacao = anoFabricacao;
    }

    public String getCor(){
        return cor;
    }

    public void setCor(String cor){
        this.cor = cor;
    }

    public boolean isEstaEstacionado(){
        return estaEstacionado;
    }

    public boolean registraEntrada(){
        if(isEstaEstacionado() == false){
            estaEstacionado = true;
            return true;
        }
        return false;
    }

    public boolean registraSaida(){
        if(isEstaEstacionado() == true){
            estaEstacionado = false;
            return true;
        }
        return false;
    }

    public String toString(){
        return "\nPlaca: " + placa +
               " Modelo: " + modelo +
               " Fabricante: " + fabricante +
               " Cor: " + cor +
               " Ano de fabricacao: " + anoFabricacao;
    }
}


