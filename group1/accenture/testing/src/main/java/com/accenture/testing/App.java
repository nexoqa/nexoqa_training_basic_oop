package com.accenture.testing;

import com.accenture.testing.electrodomestico.Electrodomestico;
import com.accenture.testing.electrodomestico.Estufa;
import com.accenture.testing.electrodomestico.Lavadora;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        try {
            Electrodomestico electrodomestico = new Electrodomestico("Lavadora", "LG",
                    600.00);
            // System.out.println(electrodomestico);
            electrodomestico.setType("Estufa");
            // System.out.println(electrodomestico);
            System.out.println("Electrodomestico");
            System.out.println(electrodomestico);
            System.out.println("Consumo=" + electrodomestico.getConsumo(100));
            System.out.println("Coste=" + electrodomestico.getCosteConsumo(100, 30));

            System.out.println("***Lavadora***");
            Lavadora lavadora = new Lavadora("Samsung", 200.00, 400.00, false);
            System.out.println(lavadora);
            System.out.println("Consumo=" + lavadora.getConsumo(100));
            System.out.println("Coste=" + lavadora.getCosteConsumo(100, 30));

            System.out.println("***Lavadora2***");
            Lavadora lavadora2 = new Lavadora("AEG", 200.00, 400.00, true);
            System.out.println(lavadora2);
            System.out.println("Consumo=" + lavadora2.getConsumo(100));
            System.out.println("Coste=" + lavadora2.getCosteConsumo(100, 30));

            System.out.println("***Estufa***");
            Estufa estufa = new Estufa("ACC", 300.00, false);
            System.out.println(estufa);
            System.out.println("Consumo=" + estufa.getConsumo(100));
            System.out.println("Coste=" + estufa.getCosteConsumo(100, 30));

            System.out.println("***Estufa Electrica***");
            Estufa estufaElectrica = new Estufa("ACC2", 100.00, true);
            System.out.println(estufaElectrica);
            System.out.println("Consumo=" + estufaElectrica.getConsumo(100));
            System.out.println("Coste=" + estufaElectrica.getCosteConsumo(100, 30));

            // Poliformismo

            Electrodomestico[] electrodomesticos = new Electrodomestico[5];

            electrodomesticos[0] = new Lavadora("SM", 350.00);
            electrodomesticos[1] = new Lavadora("ABC", 150.00, 400.00, true);
            electrodomesticos[2] = new Estufa("LG2", 50.00, false);
            electrodomesticos[3] = new Estufa("QWE", 1150.00, true);
            electrodomesticos[4] = new Electrodomestico("Secadora", "LNHG", 2000.00);

            for (int index = 0; index < 5; index++) {

                Electrodomestico electrodomestic = electrodomesticos[index];

                System.out.println(electrodomestic);
                System.out.println(electrodomestic.getClass().getName());
                System.out.println("Consumo=" + electrodomestic.getConsumo(5));
                System.out.println("Coste=" + electrodomestic.getCosteConsumo(5, 10));
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
