import java.util.Scanner;

public class usuario {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String nombre1 = "";
        String nombre2 = "";
        String nombre3 = "";  

        int edad1 = 0;
        int edad2 = 0;
        int edad3 = 0;

        int calificacion1 = 0;
        int calificacion2 = 0;
        int calificacion3 = 0;

        String clasificacionEdad1 = "";
        String clasificacionEdad2 = "";
        String clasificacionEdad3 = "";

        String resultadoCalificacion1 = "";
        String resultadoCalificacion2 = "";
        String resultadoCalificacion3 = "";

        int usuario = 1;

        while (usuario <= 3) {

            if (usuario == 1) {

                System.out.println("--- Usuario 1 ---");

                System.out.print("Ingrese el nombre: ");
                nombre1 = scanner.nextLine();

                System.out.print("Ingrese la edad: ");
                edad1 = Integer.parseInt(scanner.nextLine());

                System.out.print("Ingrese la calificacion (0-100): ");
                calificacion1 = Integer.parseInt(scanner.nextLine());

                while (calificacion1 < 0 || calificacion1 > 100) {
                    System.out.println("Calificacion invalida, debe estar entre 0 y 100");
                    System.out.print("Ingrese la calificacion (0-100): ");
                    calificacion1 = Integer.parseInt(scanner.nextLine());
                }

                if (edad1 >= 18) {
                    clasificacionEdad1 = "Mayor de edad";
                } else {
                    clasificacionEdad1 = "Menor de edad";
                }

                if (calificacion1 >= 90 && calificacion1 <= 100) {
                    resultadoCalificacion1 = "Excelente";
                } else if (calificacion1 >= 80 && calificacion1 <= 89) {
                    resultadoCalificacion1 = "Muy bueno";
                } else if (calificacion1 >= 70 && calificacion1 <= 79) {
                    resultadoCalificacion1 = "Bueno";
                } else if (calificacion1 >= 60 && calificacion1 <= 69) {
                    resultadoCalificacion1 = "Regular";
                } else {
                    resultadoCalificacion1 = "Reprobado";
                }

                System.out.println("Nombre: " + nombre1);
                System.out.println("Edad: " + edad1 + " - " + clasificacionEdad1);
                System.out.println("Calificacion: " + calificacion1 + " - " + resultadoCalificacion1);

            } else if (usuario == 2) {

                System.out.println("--- Usuario 2 ---");

                System.out.print("Ingrese el nombre: ");
                nombre2 = scanner.nextLine();

                System.out.print("Ingrese la edad: ");
                edad2 = Integer.parseInt(scanner.nextLine());

                System.out.print("Ingrese la calificacion (0-100): ");
                calificacion2 = Integer.parseInt(scanner.nextLine());

                while (calificacion2 < 0 || calificacion2 > 100) {
                    System.out.println("Calificacion invalida, debe estar entre 0 y 100");
                    System.out.print("Ingrese la calificacion (0-100): ");
                    calificacion2 = Integer.parseInt(scanner.nextLine());
                }

                if (edad2 >= 18) {
                    clasificacionEdad2 = "Mayor de edad";
                } else {
                    clasificacionEdad2 = "Menor de edad";
                }

                if (calificacion2 >= 90 && calificacion2 <= 100) {
                    resultadoCalificacion2 = "Excelente";
                } else if (calificacion2 >= 80 && calificacion2 <= 89) {
                    resultadoCalificacion2 = "Muy bueno";
                } else if (calificacion2 >= 70 && calificacion2 <= 79) {
                    resultadoCalificacion2 = "Bueno";
                } else if (calificacion2 >= 60 && calificacion2 <= 69) {
                    resultadoCalificacion2 = "Regular";
                } else {
                    resultadoCalificacion2 = "Reprobado";
                }

                System.out.println("Nombre: " + nombre2);
                System.out.println("Edad: " + edad2 + " - " + clasificacionEdad2);
                System.out.println("Calificacion: " + calificacion2 + " - " + resultadoCalificacion2);

            } else if (usuario == 3) {

                System.out.println("--- Usuario 3 ---");

                System.out.print("Ingrese el nombre: ");
                nombre3 = scanner.nextLine();

                System.out.print("Ingrese la edad: ");
                edad3 = Integer.parseInt(scanner.nextLine());

                System.out.print("Ingrese la calificacion (0-100): ");
                calificacion3 = Integer.parseInt(scanner.nextLine());

                while (calificacion3 < 0 || calificacion3 > 100) {
                    System.out.println("Calificacion invalida, debe estar entre 0 y 100");
                    System.out.print("Ingrese la calificacion (0-100): ");
                    calificacion3 = Integer.parseInt(scanner.nextLine());
                }

                if (edad3 >= 18) {
                    clasificacionEdad3 = "Mayor de edad";
                } else {
                    clasificacionEdad3 = "Menor de edad";
                }

                if (calificacion3 >= 90 && calificacion3 <= 100) {
                    resultadoCalificacion3 = "Excelente";
                } else if (calificacion3 >= 80 && calificacion3 <= 89) {
                    resultadoCalificacion3 = "Muy bueno";
                } else if (calificacion3 >= 70 && calificacion3 <= 79) {
                    resultadoCalificacion3 = "Bueno";
                } else if (calificacion3 >= 60 && calificacion3 <= 69) {
                    resultadoCalificacion3 = "Regular";
                } else {
                    resultadoCalificacion3 = "Reprobado";
                }

                System.out.println("Nombre: " + nombre3);
                System.out.println("Edad: " + edad3 + " - " + clasificacionEdad3);
                System.out.println("Calificacion: " + calificacion3 + " - " + resultadoCalificacion3);

            }

            usuario = usuario + 1;
        }

        System.out.println("");
        System.out.println("--- RESUMEN FINAL ---");

        System.out.println("");
        System.out.println("Usuario 1:");
        System.out.println("Nombre: " + nombre1);
        System.out.println("Edad: " + edad1 + " - " + clasificacionEdad1);
        System.out.println("Calificacion: " + calificacion1 + " - " + resultadoCalificacion1);

        System.out.println("");
        System.out.println("Usuario 2:");
        System.out.println("Nombre: " + nombre2);
        System.out.println("Edad: " + edad2 + " - " + clasificacionEdad2);
        System.out.println("Calificacion: " + calificacion2 + " - " + resultadoCalificacion2);

        System.out.println("");
        System.out.println("Usuario 3:");
        System.out.println("Nombre: " + nombre3);
        System.out.println("Edad: " + edad3 + " - " + clasificacionEdad3);
        System.out.println("Calificacion: " + calificacion3 + " - " + resultadoCalificacion3);

        scanner.close();
    }
}