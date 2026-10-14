package java_Question1;
class Book{
    private String title;
    private String author;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    private double price;
    private String ISBN;

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    static int bookcount;
    final String libraryName="Sunrise public library";

    Book(String title,String author,double price,String ISBN){
        this.title=title;
        this.price=price;
        this.author=author;
        this.ISBN=ISBN;
        bookcount++;
    }

}
public class Librarytest {
    static void main(String[] args) {
    Book b1 = new Book("Sunrise","Ruskin",335.2,"SUN");
    }
}
