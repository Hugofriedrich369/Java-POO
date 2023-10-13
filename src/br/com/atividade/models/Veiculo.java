package br.com.atividade.models;

public abstract class Veiculo {
    protected String marca;
    protected String modelo;

    protected Boolean status;
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public abstract String tipoDeVeiculo();
    public abstract void ligar();
    public abstract void desligar();
    public abstract String status();
}
