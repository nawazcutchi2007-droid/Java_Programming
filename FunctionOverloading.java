class Shape{
    private double area;
    public void Calculate(int side){
        area = side * side;
        System.out.println("Arae of Square is "+ area);
    }
    public void Calculate(double length, double breadth){
        area = length * breadth;
        System.out.println("Area of Reactangle is "+ area);
    }
    public void Calculate(int radius, float pi){
        area = pi * radius * radius;
        System.out.println("Area of Circle is "+ area);
    }
}

public class FunctionOverloading {
    public static void main(String[] args) {
        Shape sq = new Shape();
        sq.Calculate(5);

        Shape react = new Shape();
        react.Calculate(10.99, 12.99);

        Shape cir = new Shape();
        cir.Calculate(5, 3.14f);
    }
}
