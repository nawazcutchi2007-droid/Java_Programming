import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<>(5, 3);

        v.add(10);
        v.add(21);
        v.add(30);
        v.add(41);

        for (int e : v) {
            if (e % 2 == 1) {
                System.out.println(e + " is Odd");
            }
        }

        System.out.println("Elements in Vector are: " + v);
        System.out.println("Size of Vector is: " + v.size());
        System.out.println("Capacity of Vector is: " + v.capacity());
        System.out.println("First Element of Vector is: " + v.firstElement());
        System.out.println("Last Element of Vector is: " + v.lastElement());

        v.clear();

        System.out.println("Elements in Vector after clear are: " + v);
        System.out.println("Is Vector empty? " + v.isEmpty());
    }
}