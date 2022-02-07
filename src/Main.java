import javax.swing.*;


class Main {

    public static void main(String[] args) {

        Shuttle shuttle = new Shuttle();
        Unmanned unmanned = new Unmanned();
        Manned manned = new Manned();
        Turism turism = new Turism();

        int numCase;

        do {
            String stringCase = JOptionPane.showInputDialog("Ingresa un número del 1 al 4 para crear una Nave.\n" +
                    "0. Para salir del programa.\n" +
                    "1. Para una nave de Lanzadera.\n"+
                    "2. Para una nave no tripulada.\n"+
                    "3. Para una nave tripulada.\n" +
                    "4. Para una nave de turismo.\n");

            numCase = Integer.parseInt(stringCase);

            switch (numCase) {

                case 0:
                    JOptionPane.showMessageDialog(null,"Gracias");
                    break;

                case 1:
                    shuttle.printShip();
                    break;

                case 2:
                    unmanned.printShip();
                    break;
                case 3:
                    manned.printShip();
                    break;
                case 4:
                    turism.printShip();
                    break;
                default:
                    System.out.println("Entrada inválida.");
                    break;
            }
        }while (numCase != 0);


    }
}
