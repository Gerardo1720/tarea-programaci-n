package Examen;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("===== Examen De Progrmación =====");
        System.out.print("¿Cuántos estudiantes? ");
        int n = sc.nextInt();
        sc.nextLine();

        Estudiante[] grupo = new Estudiante[n];

        for (int i = 0; i < n; i++) {
            System.out.println("-- Estudiante " + (i + 1) + " --");

            System.out.print("Nombre: ");
            String nombre = sc.nextLine();

            double nota1;
            do {
                System.out.print("Nota parcial 1 (0-100): ");
                nota1 = sc.nextDouble();
                if (nota1 < 0 || nota1 > 100)
                    System.out.println("Error: la nota debe estar entre 0 y 100.");
            } while (nota1 < 0 || nota1 > 100);

            double nota2;
            do {
                System.out.print("Nota parcial 2 (0-100): ");
                nota2 = sc.nextDouble();
                if (nota2 < 0 || nota2 > 100)
                    System.out.println("Error: la nota debe estar entre 0 y 100.");
            } while (nota2 < 0 || nota2 > 100);

            double nota3;
            do {
                System.out.print("Nota parcial 3 (0-100): ");
                nota3 = sc.nextDouble();
                if (nota3 < 0 || nota3 > 100)
                    System.out.println("Error: la nota debe estar entre 0 y 100.");
            } while (nota3 < 0 || nota3 > 100);

            double notaProyecto;
            do {
                System.out.print("Nota proyecto  (0-100): ");
                notaProyecto = sc.nextDouble();
                if (notaProyecto < 0 || notaProyecto > 100)
                    System.out.println("Error: la nota debe estar entre 0 y 100.");
            } while (notaProyecto < 0 || notaProyecto > 100);

            sc.nextLine();

            
        }

        System.out.println("\n======= Reporte Personal =======");
        for (int i = 0; i < n; i++) {
            System.out.println(grupo[i]);
        }

        double suma = 0;
        double notaMayor = grupo[0].calculorNotaFinal();
        double notaMenor = grupo[0].calculorNotaFinal();
        String nombreMayor = grupo[0].getNombre();
        String nombreMenor = grupo[0].getNombre();
        int aprobados = 0;

        for (int i = 0; i < n; i++) {
            double notaFinal = grupo[i].calculorNotaFinal();
            suma += notaFinal;

            if (notaFinal > notaMayor) {
                notaMayor = notaFinal;
                nombreMayor = grupo[i].getNombre();
            }

            if (notaFinal < notaMenor) {
                notaMenor = notaFinal;
                nombreMenor = grupo[i].getNombre();
            }

            if (notaFinal >= 70) {
                aprobados++;
            }
        }

        double promedio = suma / n;

        System.out.println("\n======= Estadisticas Grupales =======");
        System.out.printf("Promedio del grupo    : %.2f%n", promedio);
        System.out.printf("Nota más alta         : %.2f  (%s)%n", notaMayor, nombreMayor);
        System.out.printf("Nota más baja         : %.2f  (%s)%n", notaMenor, nombreMenor);
        System.out.println("Estudiantes aprobados : " + aprobados + " de " + n);

        sc.close();
    }
}