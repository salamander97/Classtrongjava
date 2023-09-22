public class Main {
    public static void main(String[] args) {
        Person a = new Person();
        a.name= "Hieu";
        a.age=19;
        a.height= 1.78f;
        a.eat("Rice");
        int age=a.getAge();
        System.out.println("Age: "+age);


    }
}