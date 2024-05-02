import java.util.Arrays;

public class SecondLargestInString {
    public static void main(String[] args) {
        String name = "i am enough good encapsulation for prioritylist";

        String[] nameArray = name.split(" ");

        System.out.println(Arrays.toString(nameArray));

        for (int i =0;i<nameArray.length;i++){
            for (int j=i+1;j<nameArray.length;j++){
                if(nameArray[i].length()>nameArray[j].length()){
                                 String temp = nameArray[j];
                                 nameArray[j]  = nameArray[i];
                                 nameArray[i]  = temp ;
                }
            }
        }

        System.out.println(Arrays.toString(nameArray));



    }
}
