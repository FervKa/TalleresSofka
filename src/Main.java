import javax.swing.*;
import java.util.Scanner;

class Main {

    public static void main(String[] args) {

        Shuttle shuttle = new Shuttle();

        int numCase;

        do {
            String stringCase = JOptionPane.showInputDialog("Ingresa un número del 1 al 4 para crear una Nave.\n" +
                    "0. Para salir del programa.\n" +
                    "1. Para una nave de Lanzadera."+
                    "2. Para una nave no tripulada."+
                    "3. Para una nave tripulada.");

            numCase = Integer.parseInt(stringCase);

            switch (numCase) {

                case 0:
                    JOptionPane.showMessageDialog(null,"Gracias");
                    break;

                case 1:
                    shuttle.printShip();
                    break;

                default:
                    System.out.println("Entrada inválida.");
                    break;
            }
        }while (numCase != 0);


    }
}
