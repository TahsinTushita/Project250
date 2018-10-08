package com.example.tushita.project4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.LinearLayout;

public class Friends extends AppCompatActivity {

    private RecyclerView friendsList;
    private FriendsListAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_friends);

        friendsList = (RecyclerView) findViewById(R.id.friends_recyclerview);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
        friendsList.setLayoutManager(layoutManager);

        String[] names=new String[CardviewFriends.cardViews.length];
        for(int i=0;i<names.length;i++){
            names[i]=CardviewFriends.cardViews[i].getName();
        }

        int[] images=new int[CardviewFriends.cardViews.length];
        for(int i=0;i<images.length;i++){
            images[i]=CardviewFriends.cardViews[i].getImageResourceId();
        }

        adapter = new FriendsListAdapter(names,images);
        friendsList.setAdapter(adapter);
    }
}
