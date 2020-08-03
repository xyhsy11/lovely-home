public class Demo54Person {
    public static void main(String[] args) {
        Person person = new Person();
        person.show();
        //person.name = "sda";
        //person.age  = -13;
        person.setAge(-20);
        person.setName("ads");
        System.out.println(person.getName());
        person.show();
    }
}
