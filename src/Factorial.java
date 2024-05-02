import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner  sc =new Scanner(System.in);
        System.out.println("Welcome to Factorial code");
        System.out.println("Please, provide number");

        int num = sc.nextInt();
        int  result = factorial(num);
        System.out.println(result);


    }

  public static int factorial(int num){
        int i =1;
        int fact=1;

        while(i<=num) {
            fact = fact * i;
            i++;

        }
    return fact;
  }
}
