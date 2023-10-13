package br.com.atividade.models;

public class Moto extends Veiculo {

    private String cor;

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    @Override
    public String tipoDeVeiculo() {
        return "Moto";
    }
    public void ligar() {
        this.status = true;
    }

    public void desligar() {
        this.status = false;
    }

    public String status() {
        if (this.status == true) return "Moto ligada";
        else return "Moto desligada";
    }

}
