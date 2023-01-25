import java.util.Arrays;
import java.util.Scanner;

public class Numeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int contador = 0;
        int[] arr = new int[5];
        while (contador < 5) {
            System.out.print("Ingresa un número: ");
            int num = sc.nextInt();
            arr[contador] = num;
            contador++;
        }
        int suma = Arrays.stream(arr).sum();


        System.out.println("Los numeros ingresados fueron: "+ Arrays.toString(arr) +"\n y la suma entre estos es: "+ suma );

    }
}
