package com.apple.book;

public class Dictrionary extends book {
    private int bushouPages;

    public Dictrionary(String bookId, String bookname, int pages, int bushouPages) {
        super(bookId, bookname, pages);
        this.bushouPages = bushouPages;
    }

    //id=D001+INB001
    @Override
    public String getBookId() {
        return "D001"+super.getBookId();
    }

    public int getBushouPages() {
        return bushouPages;
    }

    public void setBushouPages(int bushouPages) {
        this.bushouPages = bushouPages;
    }
    public String toString(){
        return super.toString() +this.bushouPages.
    }
}
