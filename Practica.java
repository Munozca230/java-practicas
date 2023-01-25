import java.util.Scanner;

public class Practica {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Programa de notas");

        int cantNotas = 0;
        float notasTotales = 0;

        System.out.println("Ingrese su nombre:");
        String nombre = sc.nextLine();

        System.out.println("Cuantas notas desea ingresar?");
        int usuarioNotas = sc.nextInt();

        while (usuarioNotas!=0) {
            cantNotas++;
            System.out.println("Ingrese su nota nro"+cantNotas);
            usuarioNotas--;
            float nota = sc.nextFloat();
            notasTotales+= nota;
        }

        float promedio = (float) notasTotales/cantNotas;
        System.out.println("Estudiante "+nombre+"su promedio es de: "+promedio);

    }
}
