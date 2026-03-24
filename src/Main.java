import java.util.Scanner;
import java.util.Vector;
public class Main {
    public static void main(String[] args) {
        System.out.println("Escriba la cantidad de estudiantes");
        Scanner lector = new Scanner(System.in);

        int ce = 0, ap = 0, re = 0;
        double suma = 0, mayor, menor, promedio, n = 0;
        ce = lector.nextInt();
        double [] vector = new double[ce];
        for (int i=0; i < ce; i++){
            System.out.print("Ingrese la nota del estudiante " + (i + 1) + " (0 a 5): ");
             n = lector.nextDouble();
            while ( n < 0 || n > 5){
                System.out.println("Nota no valida, intente de nuevo");
                System.out.print("Ingrese la nota del estudiante " + (i + 1) + " (0 a 5): ");
                n = lector.nextDouble();
            }
            vector[i] = n;
        }
        mayor = vector[0];
        menor = vector[0];
        for (int i = 0; i <ce; i++){
            suma = suma + vector[i];
            if (vector[i] > mayor) {
                mayor = vector[i];
            }

            if (vector[i] < menor) {
                menor = vector[i];
            }

            if (vector[i] >= 3.0) {
                ap++;
            } else {
                re++;
            }
        }
        promedio = suma/ce;
        System.out.println("Notas ingresadas:");
        for (int i = 0; i < ce; i++) {
            System.out.println("Estudiante " + (i + 1) + ": " + vector[i]);
        }


        System.out.println("Resultados:");
        System.out.println("Promedio: " + promedio);
        System.out.println("Nota mayor: " + mayor);
        System.out.println("Nota menor: " + menor);
        System.out.println("Aprobados: " + ap);
        System.out.println("Reprobados: " + re);


        }

            }
