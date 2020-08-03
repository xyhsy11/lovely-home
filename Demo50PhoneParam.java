public class Demo50PhoneParam {
    public static void main(String[] args) {
      /*  Phone one =new Phone();
        one.brand = "苹果";
        one.price = 8388.0;
        one.color = "土豪金";
        System.out.println(one);
        method(one);*/

      Phone two = new Phone();
      two.color = "black";
      two.brand = "iphone";
      two.price = 100;
      method(two);


    }

    public static void method(Phone param) {
        System.out.println(param);
        System.out.println(param.price);
        System.out.println(param.color);
        System.out.println(param.brand);
    }
}
