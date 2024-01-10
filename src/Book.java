import java.io.Serializable;

public class Book implements Serializable {

    String title;
    String authors;
    double price;
    String isbn;
    String genre;
    int year;

    public Book(){
        title = null;
        authors = null;
        price = 0;
        isbn = null;
        genre = null;
        year = 0;
    }

    public Book(String title, String authors, double price, String isbn, String genre, int year) {
        this.title = title;
        this.authors = authors;
        this.price = price;
        this.isbn = isbn;
        this.genre = genre;
        this.year = year;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public String getTitle() {
        return title;
    }


    public void setAuthors(String authors) {
        this.authors = authors;
    }
    public String getAuthors() {
        return authors;
    }


    public void setPrice(double price) {
        this.price = price;
    }
    public double getPrice() {
        return price;
    }


    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    public String getIsbn() {
        return isbn;
    }


    public void setGenre(String genre) {
        this.genre = genre;
    }
    public String getGenre() {
        return genre;
    }


    public void setYear(int year) {
        this.year = year;
    }
    public int getYear() {
        return year;
    }


    @Override
    public boolean equals(Object obj) {
        if ( obj == null || this.getClass() != obj.getClass()){
            return false;
        }else{
            Book x = (Book) obj;
            return x.title == this.title && x.authors == this.authors
                    && x.price == this.price && x.isbn == this.isbn
                    && x.genre == this.genre && x.year == this.year;
        }
    }

    @Override
    public String toString() {
        return "The Title is: " + title + "\n" +
               "The Author/s is/are: " + authors + "\n" +
               "The Price is: " + price + "\n" +
               "The ISBN is: " + isbn + "\n" +
               "The Genre is: " + genre + "\n" +
               "The Year is: " + year + "\n";
    }
}
