public class Max_Min {

    public static void main(String[] args) {
            int[] number    = utlity.arrayElement();

       int len    = max(number);
        System.out.println("max value: "+len);

        System.out.println("min value: "+min(number));

    }

      int nu= 12345;



    public static int max(int[] num){
        int max= num[0];
        for(int i =0;i<num.length;i++){
            if(max < num[i]){
             max  = num[i];
            }

        }


        return max;
    }

    public static int min(int[] ram){

        int min = ram[0];
        for(int i=0;i<ram.length;i++){
            if(min>ram[i]){
              min = ram[i];
            }
        }
        return min;
    }

}
