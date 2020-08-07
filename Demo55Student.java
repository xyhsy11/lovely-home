public class Demo55Student {
    public static void main(String[] args) {
        Student stu = new Student();
        Student stu1 = new Student("Tom", 10);
        stu.setAge(10);
        stu.setName("tom");
        //System.out.println(stu.toString());
        System.out.println(stu);
        System.out.println(stu1);
    }
}
