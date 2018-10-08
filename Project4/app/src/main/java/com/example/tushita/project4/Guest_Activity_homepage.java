package com.example.tushita.project4;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.SearchView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;

import java.util.ArrayList;
import java.util.List;

public class Guest_Activity_homepage extends AppCompatActivity implements View.OnClickListener{

    private SearchView guestSearchView;
    private RecyclerView guestRecyclerView,guestRecyclerView2;
    private CaptionedImagesAdapter adapter;
    private HomepageReviewAdapter adapter2;
    public static List<cardViewBooks> bookList;
    private LayoutInflater inflater;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guest__homepage);

        guestSearchView = (SearchView) findViewById(R.id.guestsearchview_id);
        guestRecyclerView = (RecyclerView) findViewById(R.id.guest_recyclerview_id);
        guestRecyclerView2 = (RecyclerView) findViewById(R.id.guest_recyclerview2_id);

        guestRecyclerView.setHasFixedSize(true);
        //guestRecyclerView2.setHasFixedSize(true);
//        LinearLayoutManager layoutManager = new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
        guestRecyclerView.setLayoutManager(layoutManager);

        LinearLayoutManager layoutManager2 = new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
        guestRecyclerView2.setLayoutManager(layoutManager2);


        String[] names = new String[cardViewBooks.cardViews.length];
        for(int i=0;i<names.length;i++){
            names[i]=cardViewBooks.cardViews[i].getName();
        }

        int[] images=new int[cardViewBooks.cardViews.length];
        for(int i=0;i<images.length;i++){
            images[i]=cardViewBooks.cardViews[i].getImageResourceId();
        }

        String[] reviews = new String[cardViewReviews.cardReviews.length];
        for(int i=0;i<reviews.length;i++){
            reviews[i]=cardViewReviews.cardReviews[i].getReviewText();
        }

        int[] reviewImages = new int[cardViewReviews.cardReviews.length];
        for(int i=0;i<reviewImages.length;i++){
            reviewImages[i] = cardViewReviews.cardReviews[i].getReviewImageId();
        }
//       guestRecyclerView = (RecyclerView) inflater.inflate(R.layout.card_captioned_image,null);


        adapter=new CaptionedImagesAdapter(names,images);
        guestRecyclerView.setAdapter(adapter);
        adapter2=new HomepageReviewAdapter(reviews,reviewImages);
        guestRecyclerView2.setAdapter(adapter2);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.guest_homepage_menu_layout,menu);

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if(item.getItemId()==R.id.Guest_signup){
            Intent intent = new Intent(Guest_Activity_homepage.this,MainActivity.class);
            startActivity(intent);
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {

    }
}
