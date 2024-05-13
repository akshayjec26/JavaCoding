package Java8Coding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Practice {
    public static void main(String[] args) {
        ArrayList <Object>  list = new ArrayList<Object>();
        list.add("Ram");
        list.add("Mohan");
        list.add("Aman");
        list.add("Ashutosh");
        list.add("Madan");
        list.add("Gulab");
        list.add("Ram");

        List<String> myList = Stream.of("Ram", "Mohan", "madan", "sohan", "Akshay")
                .filter(s-> s.endsWith("n")).map(s->s.toUpperCase()).collect(Collectors.toList());

        //  System.out.println(myList);

       // list.stream().filter(s -> s.equals("Ram")).map(s -> s.)

        //List <String> list1 = Arrays.asList("100" ,"200","300" ,"100");

        ArrayList<Integer> list2 = new ArrayList<Integer>();

        list2.add(100);
        list2.add(200);
        list2.add(300);
        list2.add(400);
        list2.add(100);
       // System.out.println(list2);

       // List<Integer> values = list2.stream().distinct().sorted().collect(Collectors.toList());

     //   System.out.println(values);


     // List<Integer> number = Stream.of(100, 200, 100, 50, 400, 300).sorted().anyMatch(s->s.equals(100));
      //  System.out.println(number);

    }
}
