package com.example.tushita.project4;

public class CardviewFriends {

    private String FriendName;
    private int imageResourceId;

    protected CardviewFriends(String FriendName, int imageResourceId){
        this.FriendName = FriendName;
        this.imageResourceId = imageResourceId;
    }

    public static final CardviewFriends[] cardViews = {new CardviewFriends("Friend 1",R.drawable.ic_supervisor_account_black_24dp),
            new CardviewFriends("Friend 2",R.drawable.ic_supervisor_account_black_24dp),new CardviewFriends("Friend 3",
            R.drawable.ic_supervisor_account_black_24dp),new CardviewFriends("Friend 4",R.drawable.ic_supervisor_account_black_24dp),
            new CardviewFriends("Friend 5",R.drawable.ic_supervisor_account_black_24dp)};



    public String getName(){
        return FriendName;
    }

    public int getImageResourceId(){
        return imageResourceId;
    }


}
