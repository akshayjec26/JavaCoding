import java.util.Scanner;

public class ArrayOcc {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter lent of an array");

        int len = sc.nextInt();

        int [] array = new int[len];

        for(int i=0;i< array.length;i++){
            System.out.print("Enter "+(i+1)+" Element: \n");
            array[i] = sc.nextInt();
        }

        System.out.println(" enter the number which you get ");
        int number = sc.nextInt();


        int count = countOcc(array, number);
        System.out.println(count);
       // System.out.println(countOcc(array,num));
    }




    public static int countOcc(int [] nums,int ram){
        int count =0;
        for(int len : nums){
            if(len==ram){
                count++;
            }
        }

        return count;
    }

}
