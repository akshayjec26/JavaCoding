public class SwapString {
    public static void main(String[] args) {
        String first = "Akshay";
        String sec = "Raj";
        System.out.println("before swap: "+first);
        System.out.println("before swap: "+sec);
        System.out.println("*************************");

        first = first+sec;
        System.out.println(first);



        sec = first.substring(0,first.length()-sec.length()); //0,(9-3)(0,6)
        first = first.substring(sec.length());
        System.out.println(sec.length());
        System.out.println("After swap first value:"+first);
        System.out.println("After swap sec value: "+sec);

    }
}
