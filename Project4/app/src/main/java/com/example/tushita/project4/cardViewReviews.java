package com.example.tushita.project4;

public class cardViewReviews {

    private String reviewText;
    private int reviewImageId;

    protected cardViewReviews(String reviewText,int reviewImageId){
        this.reviewText = reviewText;
        this.reviewImageId = reviewImageId;
    }


    public static final cardViewReviews[] cardReviews = {new cardViewReviews("Review 1",R.drawable.ic_library_books_black_24dp),
            new cardViewReviews("Review 2",R.drawable.ic_library_books_black_24dp),
            new cardViewReviews("Review 3",R.drawable.ic_library_books_black_24dp),
            new cardViewReviews("Review 4",R.drawable.ic_library_books_black_24dp),
            new cardViewReviews("Review 5",R.drawable.ic_library_books_black_24dp)};


    public String getReviewText(){
        return reviewText;
    }

    public int getReviewImageId(){
        return reviewImageId;
    }

}
