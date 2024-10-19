package Q1;


import java.lang.module.FindException;
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {

        int num = 0;
        Scanner scan = new Scanner(System.in);

        System.out.println("infome um número: ");
        num = scan.nextInt();
        if(containFibonacci(num) == true){
            System.out.println("O número pertece a sequência de Fibonacci");
        }else {
            System.out.println("O número não pertece a sequência de Fibonacci");
        }

    }
    public static int[] fibonacci(int num){
        int[] arrayFibonacci = new int[num + 1];
        if(num <= 0){
            return new int[]{0};
        } else if (num == 1) {
            return new int[]{1};
        }
        arrayFibonacci[0] = 0; // F(0)
        arrayFibonacci[1] = 1; // F(1)

        // Preenche o array com a sequência de Fibonacci
        for (int i = 2; i < arrayFibonacci.length; i++) {
            arrayFibonacci[i] = arrayFibonacci[i - 1] + arrayFibonacci[i - 2];
        }
        return arrayFibonacci;
    }

    public static boolean containFibonacci( int num){
        int[] array = fibonacci(num);
        for(int i = 0; i < array.length; i++){
            if( num == array[i]){
                return true;
            }
        }

        return false;
    }

}


