package br.com.atividade.models;

public class Carro extends Veiculo {
    private int quantidadePortas;

    public int getQuantidadePortas() {
        return quantidadePortas;
    }

    public void setQuantidadePortas(int quantidadePortas) {
        this.quantidadePortas = quantidadePortas;
    }

    @Override
    public String tipoDeVeiculo() {
        return "Carro";
    }

    public void ligar() {
        this.status = true;
    }

    public void desligar() {
        this.status = false;
    }

    public String status() {
        if (this.status == true) return "Carro ligado";
        else return "Carro desligado";
    }

}
