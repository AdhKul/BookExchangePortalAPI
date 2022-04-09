package com.example.BookPortalApi.Books;

import javax.persistence.*;

@Entity
@Table
public class Books {
    @Id
    @SequenceGenerator(name = "mySeqGen", sequenceName = "mySeq", allocationSize = 1)
    @GeneratedValue(generator = "mySeqGen")
    private int id;
    private String name;
    private String author;
    private String publisher;
    private String lender_name;
    private String lender_address;
    private String book_status;

    public Books() {
    }

    public Books(int id, String name, String author, String publisher, String lender_name, String lender_address, String book_status) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.lender_name = lender_name;
        this.lender_address = lender_address;
        this.book_status = book_status;
    }

    public Books( String name, String author, String publisher, String lender_name, String lender_address, String book_status) {
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.lender_name = lender_name;
        this.lender_address = lender_address;
        this.book_status = book_status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public String getLender_name() {
        return lender_name;
    }

    public void setLender_name(String lender_name) {
        this.lender_name = lender_name;
    }

    public String getLender_address() {
        return lender_address;
    }

    public void setLender_address(String lender_address) {
        this.lender_address = lender_address;
    }

    public String getBook_status() {
        return book_status;
    }

    public void setBook_status(String book_status) {
        this.book_status = book_status;
    }
    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", publisher=" + publisher + '\'' +
                ", lender_name=" + lender_name + '\'' +
                ", lender_address=" + lender_address + '\'' +
                ", book_status =" + book_status +
                '}';
    }
}
