package KodlamaVakti;

public class Book {

    public String name, author, publisher;
    private int numberOfPage;

    public Book(String name, int numberOfPage, String author, String publisher) {
        this.name = name;

        this.author = author;
        this.publisher = publisher;
        if (numberOfPage < 1) {
            this.numberOfPage = 10;
        } else {
            this.numberOfPage = numberOfPage;
        }
    }

    public int getirPageSize(){
        return this.numberOfPage;
    }


}
