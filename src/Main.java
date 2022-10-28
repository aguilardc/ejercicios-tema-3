public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int suma = suma(1, 2, 3);
        System.out.println(suma);
        Coche objCoche = new Coche();
        int doors = objCoche.addDoors(1);
        System.out.println(doors);

    }

    public static int suma(int number1, int number2, int number3) {
        return number1 + number2 + number3;
    }


}

