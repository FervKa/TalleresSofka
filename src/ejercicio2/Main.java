package ejercicio2;

public class Main {

    public static void main(int i) {
        System.out.println("Esta salida se muestra desde el main 1: " + i);
    }

    public static void main(String f) {
        System.out.println(f);
    }

    public static void main(String[] args) {
        main(1);
        main("Esta salida se muestra desde el main 2: ");
    }

}
