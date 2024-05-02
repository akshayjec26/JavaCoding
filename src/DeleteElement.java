import java.util.Arrays;
import java.util.Scanner;

public class DeleteElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter array size \n");

        int len = sc.nextInt();

        int[] arrayNum = new int[len];

        for(int i=0;i<arrayNum.length;i++){
            System.out.print(" Enter Array "+ (i+1)+" Element\n");
            arrayNum[i] = sc.nextInt();
        }
        System.out.println("Enter that number you want to delete");
        int nums = sc.nextInt();

        int [] q =newArray(arrayNum,nums);
        System.out.println(Arrays.toString(q));


    }

    public static int[] newArray(int[] array, int console){
        int count=0;

        int j =0;
        for(int i=0;i< array.length;i++){
            if(array[i]==console){
                count++;
            }
        }
        if(count==0){
         return array;
        }
        int[] p = new int[array.length-count];

        for(int q : array){
            if(q != console){
                    p[j]=q;
                    j++;
            }
        }


        return p;
    }
}
