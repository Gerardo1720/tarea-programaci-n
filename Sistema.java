

import java.util.Scanner;

public class Sistema {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("========== Sistema de Calificaciones ==========");
        System.out.print("Ingrese su nombre: ");
        String nombre = teclado.nextLine();

        System.out.print("Ingrese su nota: ");
        double nota = teclado.nextDouble();

        String resultado = "";
        String clasificacion = "";

        if (nota >= 70) {
            resultado = "Aprobo";
        } else {
            resultado = "Reprobo";
        }
        
        if (nota >= 90) {
            clasificacion = "Excelente";
        } else if (nota >= 80) {
            clasificacion = "Bueno";
        } else if (nota >= 70) {
            clasificacion = "Regular";
        } else {
            clasificacion = "Reprobado";
        }

        System.out.println(" ========== Resultado Final ========== ");
        System.out.println("Estudiante:    " + nombre);
        System.out.println("Nota:          " + nota);
        System.out.println("Resultado:     " + resultado);
        System.out.println("Clasificacion: " + clasificacion);
        teclado.close();
    }
}