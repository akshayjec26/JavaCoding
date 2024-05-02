public class Tomorrow {
    public static void main(String[] args) {
        String name = "tomorrow";
       int count = 1;
       String result=" ";
        for (char c : name.toCharArray()) {
            if (c == 'o') {
                for (int i = 0; i < count; i++) {

                   result = result+"$" ;
                }
                count++;
            } else {
                result = result+String.valueOf(c);
            }
        }
        System.out.println(result);

    }
}