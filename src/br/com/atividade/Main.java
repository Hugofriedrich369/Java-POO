package br.com.atividade;

import br.com.atividade.models.Carro;
import br.com.atividade.models.Moto;
import br.com.atividade.models.Veiculo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        Carro carro1 = new Carro();
        carro1.setMarca("Mitsubishi");
        carro1.setModelo("Lancer");
        carro1.setQuantidadePortas(4);
        carro1.desligar();

        Carro carro2 = new Carro();
        carro2.setMarca("Ford");
        carro2.setModelo("Focus");
        carro2.setQuantidadePortas(4);
        carro2.ligar();

        Moto moto1 = new Moto();
        moto1.setMarca("Honda");
        moto1.setModelo("CBR");
        moto1.setCor("Azul");
        moto1.desligar();

        Moto moto2 = new Moto();
        moto2.setMarca("Suzuki");
        moto2.setModelo("GSX-R");
        moto2.setCor("Prata");
        moto2.ligar();
        List<Veiculo> veiculos = new ArrayList<>();
        veiculos.add(carro1);
        veiculos.add(carro2);
        veiculos.add(moto1);
        veiculos.add(moto2);

        List<String> carros = veiculos.stream()
                .filter(veiculo -> veiculo instanceof Carro)
                .map(veiculo -> "Marca: " + veiculo.getMarca() + "\nModelo: " + veiculo.getModelo() + "\nStatus: " + veiculo.status() + "\n")
                .collect(Collectors.toList());
        System.out.println("Carros na lista:");
        carros.forEach(System.out::println);

        List<String> motos = veiculos.stream()
                .filter(veiculo -> veiculo instanceof Moto)
                .map(veiculo -> "Marca: " + veiculo.getMarca() + "\nModelo: " + veiculo.getModelo() + "\nStatus: " + veiculo.status() + "\n")
                .collect(Collectors.toList());
        System.out.println("Motos na lista:");
        motos.forEach(System.out::println);

    }
}
