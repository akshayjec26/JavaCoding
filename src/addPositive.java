import java.util.Scanner;

public class addPositive {
    public static void main(String[] args) {


        System.out.println("enter the number");

        Scanner sc =new Scanner(System.in);
         int size = sc.nextInt();
        int sum=0;

         for(int i =0;i<size;i++){

             int num=sc.nextInt();
             if(num>0 || num<0){
                 if(num<0){
                     continue;
                 }
               sum=sum+num;
             }
         }

        System.out.println(sum);
    }
}
