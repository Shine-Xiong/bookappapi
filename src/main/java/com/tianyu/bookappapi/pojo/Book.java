package com.tianyu.bookappapi.pojo;

public class Book {
    //书的id
    private int books_id;
    //书的名称
    private String books_name;
    //书的作者
    private String books_author;
    //书的介绍
    private String books_introduce;
    //书的图片
    private String books_img;
    //书的类型
    private String books_type;
    //书创建的时间
    private String books_creationtime;
    //书的状态 0:正常 1:待审核 2:下架
    private String books_state;
    //书是否删除 0:正常 1:删除
    private String books_delete;

    public Book() {
    }

    public Book(int books_id, String books_name, String books_author, String books_introduce, String books_img, String books_type, String books_creationtime, String books_state, String books_delete) {
        this.books_id = books_id;
        this.books_name = books_name;
        this.books_author = books_author;
        this.books_introduce = books_introduce;
        this.books_img = books_img;
        this.books_type = books_type;
        this.books_creationtime = books_creationtime;
        this.books_state = books_state;
        this.books_delete = books_delete;
    }

    public int getBooks_id() {
        return books_id;
    }

    public void setBooks_id(int books_id) {
        this.books_id = books_id;
    }

    public String getBooks_name() {
        return books_name;
    }

    public void setBooks_name(String books_name) {
        this.books_name = books_name;
    }

    public String getBooks_author() {
        return books_author;
    }

    public void setBooks_author(String books_author) {
        this.books_author = books_author;
    }

    public String getBooks_introduce() {
        return books_introduce;
    }

    public void setBooks_introduce(String books_introduce) {
        this.books_introduce = books_introduce;
    }

    public String getBooks_img() {
        return books_img;
    }

    public void setBooks_img(String books_img) {
        this.books_img = books_img;
    }

    public String getBooks_type() {
        return books_type;
    }

    public void setBooks_type(String books_type) {
        this.books_type = books_type;
    }

    public String getBooks_creationtime() {
        return books_creationtime;
    }

    public void setBooks_creationtime(String books_creationtime) {
        this.books_creationtime = books_creationtime;
    }

    public String getBooks_state() {
        return books_state;
    }

    public void setBooks_state(String books_state) {
        this.books_state = books_state;
    }

    public String getBooks_delete() {
        return books_delete;
    }

    public void setBooks_delete(String books_delete) {
        this.books_delete = books_delete;
    }

    @Override
    public String toString() {
        return "Book{" +
                "books_id=" + books_id +
                ", books_name='" + books_name + '\'' +
                ", books_author='" + books_author + '\'' +
                ", books_introduce='" + books_introduce + '\'' +
                ", books_img='" + books_img + '\'' +
                ", books_type='" + books_type + '\'' +
                ", books_creationtime='" + books_creationtime + '\'' +
                ", books_state='" + books_state + '\'' +
                ", books_delete='" + books_delete + '\'' +
                '}';
    }
}
