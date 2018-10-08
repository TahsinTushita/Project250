package com.example.tushita.project4;

public class cardviewReadinglist {


    private String bookName;
    private int imageResourceId;

    protected cardviewReadinglist(String bookName, int imageResourceId){
        this.bookName = bookName;
        this.imageResourceId = imageResourceId;
    }

    public static final cardviewReadinglist[] cardViews = {new cardviewReadinglist("Book 1",R.drawable.ic_library_books_black_24dp),
            new cardviewReadinglist("Book 2",R.drawable.ic_library_books_black_24dp),new cardviewReadinglist("book 3",
            R.drawable.ic_library_books_black_24dp),new cardviewReadinglist("Book 4",R.drawable.ic_library_books_black_24dp),
            new cardviewReadinglist("Book 5",R.drawable.ic_library_books_black_24dp)};



    public String getName(){
        return bookName;
    }

    public int getImageResourceId(){
        return imageResourceId;
    }

}
