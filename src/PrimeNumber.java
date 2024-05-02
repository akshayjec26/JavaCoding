import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number to check which is prime or not");

        int number= sc.nextInt();

        int temp=0;

        for (int i = 2; i < number/2; i++) {
            if(number%i==0){
                temp++;
            }

        }
        if(temp==1){
            System.out.println("number is not prime number");
        }
        else{
            System.out.println("number is prime number");
        }

    }
}
