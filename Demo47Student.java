
public class Demo47Student {


    public static void main(String[] args) {
        Demo46StudentSimulation stu = new Demo46StudentSimulation();
        System.out.println(stu.name);
        System.out.println(stu.age);
        stu.name = "Thomas";
        stu.age = 16;
        System.out.println(stu.name);
        System.out.println(stu.age);
        stu.eat();
        System.out.println("===================");
        Demo46StudentSimulation stu2 = new Demo46StudentSimulation();
        System.out.println(stu2.name);
        System.out.println(stu2.age);
        stu2.name = "Thomas123";
        stu2.age = 18;
        System.out.println(stu2.name);
        System.out.println(stu2.age);
        stu2.eat();


    }
}
