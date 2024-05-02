import java.util.Scanner;

public class GuessingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to guessing game");

        int number ;

        do{
            System.out.println("Enter the number");
                  number= sc.nextInt();

        }while(!isRight(number));{
            System.out.println("congrt your guess is right");
        }
    }
    public static boolean isRight(int num){
         if(num==4){
             return true;
         }
         return false;
    }
}
