import java.util.Scanner;

public class ReverseNumber {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number which you want to reverse\n");
    int number = sc.nextInt();
    int reverse=0;

    int temp= number;

    while(number !=0){
         int num = number%10;

                  reverse   = reverse*10+ num;

              number= number/10;
    }
        System.out.println(reverse);
    if (temp==reverse){
        System.out.println("number is palindrome");
    }else{
        System.out.println("not palindrome");
    }
    }
}
