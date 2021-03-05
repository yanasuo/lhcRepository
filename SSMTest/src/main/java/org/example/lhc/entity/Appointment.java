package org.example.lhc.entity;

import java.util.Date;

public class Appointment {
    /**
     * 预约图书实体
     */

    private long bookId;// 图书ID

    private long studentId;// 学号

    private Date appointTime;// 预约时间

    public Appointment() {
    }

    public Appointment(long bookId, long studentId, Date appointTime, Book book) {
        this.bookId = bookId;
        this.studentId = studentId;
        this.appointTime = appointTime;
        this.book = book;
    }

    @Override
    public String toString() {
        return "Appointment{" +
                "bookId=" + bookId +
                ", studentId=" + studentId +
                ", appointTime=" + appointTime +
                ", book=" + book +
                '}';
    }

    public long getBookId() {
        return bookId;
    }

    public void setBookId(long bookId) {
        this.bookId = bookId;
    }

    public long getStudentId() {
        return studentId;
    }

    public void setStudentId(long studentId) {
        this.studentId = studentId;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    // 多对一的复合属性
    private Book book;// 图书实体

}
