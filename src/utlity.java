import java.util.Scanner;

public class utlity {


    public static int[] arrayElement(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter arary size");

       int number  =sc.nextInt();

       int[] array = new int[number];
       for(int i = 0; i<array.length;i++){
           System.out.println("Enter " + (i+1)+" Element : ");
                     array[i]=sc.nextInt();

       }
        return array;

    }
}
