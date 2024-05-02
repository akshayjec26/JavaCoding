import java.util.Scanner;

public class SumAndAveg {


   // public static void main(String[] args) {
//      Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the array size");
//        int[] num = new int[sc.nextInt()];
//
//        for(int i=0;i<num.length;i++){
//            System.out.println("enter  element "+ (i+1)+":");
//              num[i]=sc.nextInt();
//        }
//
//      int sum = sum(num);
//        System.out.println(sum);

//               int[] nums  = arrayElement();
//                 int  addE=add(nums);
//        System.out.println(addE);
//
//
//        System.out.println(aveg(nums));
//
//    }


    public static int[] arrayElement() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size");
        int[] num = new int[sc.nextInt()];

        for (int i = 0; i < num.length; i++) {
            System.out.println("enter  element " + (i + 1) + ":");
            num[i] = sc.nextInt();
        }

        return num;
    }


    public static int add(int[] num){
        int sum=0;
        for(int i =0;i< num.length;i++){
             sum  =sum + num[i];
        }
        return sum;
    }


    public static double aveg(int [] ram){
        int size = ram.length;
     double add1  = add(ram);

      double avg  =  add1/size;

        return  avg;
    }
}

