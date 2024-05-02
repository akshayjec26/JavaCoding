public class OrderId {

    public  void veryfyId(int number){
        if(number==100){
            throw new OrderNotFound("order id is not present");
        }else{
            System.out.println("order id is present");
        }
    }


    public static void main(String[] args) {
        OrderId id = new OrderId();
       id.veryfyId(100);
    }
}
