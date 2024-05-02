import java.util.Scanner;

public class DigitSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Digit sum");
        System.out.println("Please, Enter the number : ");
        int num = sc.nextInt();
           int result = digitSum(num);
        System.out.println(result);
    }


    public static int digitSum(int num){

         if(num<9){
             return num;
         }
        int sum = 0;

        while(num != 0){
            sum  = sum +num%10;
                  num =num/10;

        }

        return sum;

    }
}
