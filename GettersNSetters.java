class Book{
    private String title;
    private String author;
    private double price;

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    
}

public class GettersNSetters {
    public static void main(String[] args) {
        Book b1 = new Book();
        b1.setTitle("The GOAT");
        b1.setAuthor("Virat Kohli");
        b1.setPrice(9230);

        System.out.println("Title" + b1.getTitle());
        System.out.println("Author" + b1.getAuthor());
        System.out.println("Price" + b1.getPrice());
    }
}