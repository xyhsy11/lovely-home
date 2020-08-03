public class Person {
    private String name;
    private int age;
    public void show() {
        System.out.println(name + age);
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public void setAge(int num){
        if(num < 100 && num >= 0){
            age = num;
        } else {
            System.out.println("wrong");
        }
    }
    public int getAge() {
        return age;
    }


}
