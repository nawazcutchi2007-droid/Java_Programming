class Person{
    private String name;
    private int age;
    private double weight;

    public Person() {
        System.out.println("Constructor is Invoked");
        name = "Unnown";
        age = 0;
        weight = 0;
    }

    public Person(String n, int a, double w){
        name = n;
        age = a;
        weight = w;
    }

    public void display(){
        System.out.println("Name is " + name);
        System.out.println("Age is " + age);
        System.out.println("Weight is " + weight);
    }
}
public class Constructor{
    public static void main(String[] args) {
        Person p1 = new Person("Nawaz", 18, 56.00);
        p1.display();
    }
}