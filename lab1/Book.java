package lab1;

public class Book{
    private String title;
    private String author;
    private Double price;

    public Book(String title, String author, Double price){
        this.title = title;
        this.author = author;
        this.price = price;
        
    }
    public void setTitle(String title){
        this.title = title;
    }
    public void setAuthor(String author){
        this.author = author;
    }
    public void setPrice(Double price){
        this.price = price;
    }
    public String getTitle(){
        return title;
    }
    public String getAuthor(){
        return author;
    }
}
