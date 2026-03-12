/* Ejercicio 3: Leer números hasta que se introduzca un 0.
*   Para cada uno indicar si es par o impar.
*/
package learning;

import java.util.Scanner;

public class Ejercicios3B {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;

        System.out.println("Digite un numero: ");
        numero = entrada.nextInt();


        while(numero !=0){ //mientras el numero sea distinto de 0
            if(numero %2 == 0){
                System.out.println("El numero " + numero + " es PAR");
            }else{
                System.out.println("El numero " + numero + " es IMPAR");
            }

            System.out.println("Digite otro numero: ");
            numero = entrada.nextInt();

        }




    }
}
