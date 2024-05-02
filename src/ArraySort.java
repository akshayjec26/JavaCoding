import java.util.Scanner;

public class ArraySort {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter array size \n");

        int len = sc.nextInt();

        int[] ArrayNum = new int[len];

        for(int i=0;i<ArrayNum.length;i++){
            System.out.print(" Enter Array "+ (i+1)+" Element\n");
            ArrayNum[i] = sc.nextInt();
        }

       boolean  book = isSort(ArrayNum);
        System.out.println(book);

    }


    public static boolean isSort(int[] number){
        for(int i =0;i<number.length;i++){
            for(int j =i+1;j<number.length;j++){
                if(number[i]>number[j]){;
                    return false;
                }
            }

        }
        return true;
    }

}
