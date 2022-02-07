/**
 * Clase principal para correr el código.
 * @autor Stiven Suárez Marín
 */

/**
 * Importaciones para mostrar datos por ventana.
 */
import javax.swing.JOptionPane;

class Main {
    public static void main(String[] args) {

        /**
         * Este apartado se hace la creación de los objetos de naves de diferentes clases.
         */
        Shuttle shuttle = new Shuttle();
        Unmanned unmanned = new Unmanned();
        Manned manned = new Manned();
        Turism turism = new Turism();


        /**
         * Variable para obtener el dato ingresado por el usuario y conocer a qué caso hará referencia.
         */
        int numCase;


        /**
         * Bucle de control del código, se está usando para crear de manera repetitiva objetos hasta que el usuario
         * solicite salir del programa.
         */
        do {
            String stringCase = JOptionPane.showInputDialog("Ingresa un número del 1 al 4 para crear una Nave.\n" +
                    "0. Para salir del programa.\n" +
                    "1. Para una nave de Lanzadera.\n"+
                    "2. Para una nave no tripulada.\n"+
                    "3. Para una nave tripulada.\n" +
                    "4. Para una nave de turismo.\n");

            /**
             * Parsea el dato ingresado por el usuario y lo convierte en un entero para su reconocimiento por el Switch,
             * que se encarga de mostrar la información del objeto creado.
             */
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
