package service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GeradorService {
    public static String geraPlaca(){
        List<String> placas = new ArrayList<>();

        placas.add("JLQ-0477");
        placas.add("JVY-6927");
        placas.add("GWQ-5686");
        placas.add("KAP-9945");
        placas.add("MNW-4993");
        placas.add("GQK-3146");
        placas.add("HSV-5819");
        placas.add("HPG-7213");
        placas.add("HTH-5030");
        placas.add("HZP-3848");
        Collections.shuffle(placas);

        return placas.get(0);
    }

    public static String geraVeiculos(){
        List<String> veiculos = new ArrayList<>();

        veiculos.add("Carro");
        veiculos.add("Moto");
        veiculos.add("Caminhão");
        veiculos.add("Carreta");
        veiculos.add("Carroça?");
        veiculos.add("Jetski?");

        Collections.shuffle(veiculos);

        return veiculos.get(0);
    }

    public static String geraVelocidade(){
        List<Integer> velocidades = new ArrayList<>();
        for(int i = 80; i<= 100 ;i++){
            velocidades.add(i);
        }
        Collections.shuffle(velocidades);

        return velocidades.get(0)+" km/h";
    }
}
