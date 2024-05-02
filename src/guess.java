import java.util.Scanner;

public class guess {
    public static void main(String[] args) {
        System.out.println("Enter the guess number");
        Scanner sc = new Scanner(System.in);
          double number =  Math.ceil(Math.random()*100);
             int num  = (int) number ;



        System.out.println("Enter you number");
            int output = sc.nextInt();

       // System.out.println(p);
         //int result = guessNum( num ,output);
      //  System.out.println(result);

    }

//    public static int guessNum(int num , int input ){
//
//        if(num>input){
//            System.out.println("give higher number");
//        }else if(num<input){
//            System.out.println("give lower number");
//        }else{
//            System.out.println("congrt, you are genious");
//        }
//
//    }
//    return 0;
}
