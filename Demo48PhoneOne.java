public class Demo48PhoneOne {
    public static void main(String[] args) {
        Phone phone = new Phone();
        System.out.println(phone.brand);
        System.out.println(phone.price);
        System.out.println(phone.color);
        System.out.println("=========");
        phone.brand = "iphone";
        phone.color = "black";
        phone.price = 8823.2;
        System.out.println(phone.brand);
        System.out.println(phone.price);
        System.out.println(phone.color);
        phone.call("trump");
        phone.sendMessage();
    }
}
