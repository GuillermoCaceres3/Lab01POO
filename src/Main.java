import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner guardar = new Scanner(System.in);
        int opcion;
        double num1, num2, resultado;

        do {
            System.out.println("Elije la opcion que desees: ");
            System.out.println("1. para sumar");
            System.out.println("2. para restar");
            System.out.println("3. para multiplicar");
            System.out.println("4. para dividir");
            System.out.println("5. para salir");
            opcion = guardar.nextInt();
            switch (opcion){

                case 1:

                    System.out.println("Ingresa tu num1");
                    num1 = guardar.nextDouble();
                    System.out.println("Ingresa tu num2");
                    num2 = guardar.nextDouble();
                    resultado = suma(num1,num2);
                    System.out.println("Su resultado es : " + resultado);

                    break;
                case 2:

                    System.out.println("Ingresa tu num1");
                    num1 = guardar.nextDouble();
                    System.out.println("Ingresa tu num2");
                    num2 = guardar.nextDouble();
                    resultado = resta(num1,num2);
                    System.out.println("Su resultado es : " + resultado);
                    break;
                case 3:
                    System.out.println("Ingresa tu num1");
                    num1 = guardar.nextDouble();
                    System.out.println("Ingresa tu num2");
                    num2 = guardar.nextDouble();
                    resultado = multi(num1,num2);
                    System.out.println("Su resultado es : " + resultado);
                    break;
                case 4:
                    System.out.println("Ingresa tu num1");
                    num1 = guardar.nextDouble();
                    System.out.println("Ingresa tu num2");
                    num2 = guardar.nextDouble();
                    resultado = division(num1,num2);
                    System.out.println("Su resultado es : " + resultado);
                    break;

            }

        } while(opcion != 5);

    }

        public static double suma(double num1, double num2) {
            return num1 + num2;

        }

    public static double resta(double num1, double num2) {
        return num1 - num2;

    }

        public static double multi(double num1, double num2) {

            return num1 * num2;

        }

        public static double division(double num1, double num2) {
            return num1 / num2;

        }


    }





