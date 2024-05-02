public class Capital_First_In_String {

    public static void main(String[] args) {
        String name1 = "i am akshay raj";
        char[] name = name1.toCharArray();
        int len = name.length;
        for(int i=0;i<len;i++){

            if(i==0 && name[i]!=' ' ||name[i]!=' ' && name[i-1] == ' '){
                   if(name[i]>='a' && name[i]<='z'){
                    name[i]  = (char)  (name[i]-32);
                }
            }
    }
        System.out.println("first letter capital: "+String.valueOf(name));

        for(int i=0;i<len;i++){
            if(i==len-1 && name[i]!=' ' || name[i]!=' ' && name[i+1]==' '){
                if(name[i]>='a' && name[i]<='z')
                      name[i]  =  (char) (name[i]-32);
            }
        }

        System.out.println("last letter capital: " +String.valueOf(name));

}
}