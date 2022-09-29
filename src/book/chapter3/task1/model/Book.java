package book.chapter3.task1.model;

public class Book {
    // id, Название, Автор(ы), Издательство, Год издания, Количество страниц, Цена, Тип переплета

    private long id;
    private String bookTitle;
    private String author;
    private String publisher;
    private Integer yearBookPublished;
    private long pageVolume;
    private long price;
    private String bindingType;         // could it be char - only type 5, 6, 7, 8, 9, 10 exist

    public Book(long id, String bookTitle, String author, String publisher, Integer yearBookPublished, long pageVolume, long price, String bindingType) {
        this.id = id;
        this.bookTitle = bookTitle;
        this.author = author;
        this.publisher = publisher;
        this.yearBookPublished = yearBookPublished;
        this.pageVolume = pageVolume;
        this.price = price;
        this.bindingType = bindingType;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public Integer getYearBookPublished() {
        return yearBookPublished;
    }

    public void setYearBookPublished(Integer yearBookPublished) {
        this.yearBookPublished = yearBookPublished;
    }

    public long getPageVolume() {
        return pageVolume;
    }

    public void setPageVolume(long pageVolume) {
        this.pageVolume = pageVolume;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public String getBindingType() {
        return bindingType;
    }

    public void setBindingType(String bindingType) {
        this.bindingType = bindingType;
    }

    public String toString() {
        StringBuilder bookList = new StringBuilder("Book { ");
        bookList.append("ID: ").append(this.id);
        bookList.append(" Book Title: ").append(this.bookTitle);
        bookList.append(" Author: ").append(this.author);
        bookList.append(" Publisher: ").append(this.publisher);
        bookList.append(" Year of Publication: ").append(this.yearBookPublished);
        bookList.append(" Number of Pages: ").append(this.pageVolume);
        bookList.append(" Price: ").append(this.price);
        bookList.append(" Binding Type: ").append(this.bindingType);
        bookList.append(" \n");
        return bookList.toString();
    }
}
