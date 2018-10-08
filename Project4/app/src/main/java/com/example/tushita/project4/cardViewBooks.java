package com.example.tushita.project4;

public class cardViewBooks {
    private String bookName;
    private int imageResourceId;



    protected cardViewBooks(String bookName, int imageResourceId){
        this.bookName = bookName;
        this.imageResourceId = imageResourceId;
    }

    public static final cardViewBooks[] cardViews = {new cardViewBooks("Book 1",R.drawable.ic_library_books_black_24dp),
            new cardViewBooks("Book 2",R.drawable.ic_library_books_black_24dp),new cardViewBooks("Book 3",
            R.drawable.ic_library_books_black_24dp),new cardViewBooks("Book 4",R.drawable.ic_library_books_black_24dp),
            new cardViewBooks("Book 5",R.drawable.ic_library_books_black_24dp)};



    public String getName(){
        return bookName;
    }

    public int getImageResourceId(){
        return imageResourceId;
    }
}
