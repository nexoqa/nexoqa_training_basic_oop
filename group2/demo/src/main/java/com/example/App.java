package com.example;

import com.example.accenture.Electrodomestico;
import com.example.accenture.Lavadora;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) throws Exception {
        Electrodomestico electrodomestico = new Electrodomestico("Lavadora", "LG", 100.5);
        System.out.println(electrodomestico);

        Lavadora lavadora = new Lavadora("LG", 200, 50.5, true);

        System.out.println(lavadora);

        Electrodomestico lavadora2 = new Lavadora("LG", 200, 100, false);

        System.out.println(lavadora2);

        System.out.println("++++++++++++++++++++++++++++++++++++++++++");

        Electrodomestico[] artifats = new Electrodomestico[5];
        artifats[0] = new Lavadora("LG", 100.5, 50.5, true);
        artifats[1] = new Lavadora("LG", 100.5, 50.5, false);
        artifats[2] = new Electrodomestico("Secadora", "LG", 2000);
        artifats[3] = new Electrodomestico("Tostadora", "Samsung", 1000);
        artifats[4] = new Lavadora("Samsung", 100.5, 60.5, false);

        for (int index = 0; index < 5; index++) {
            Electrodomestico artefact = artifats[index];
            System.out.println(artefact);
            System.out.println(artefact.getClass().getName());
            System.out.println("GetConsume: " + artefact.getConsume(10));
            System.out.println("Cost by Consume: " + artefact.getCostByConsume(10, 2));
        }

    }
}
