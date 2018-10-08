package com.example.tushita.project4;

import android.content.Intent;
import android.media.MediaMetadata;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.SearchView;

public class Member_activity_homepage extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener{

    private SearchView memberSearchview;
    private RecyclerView memberRecyclerView,memberRecyclerView2;
    private LayoutInflater inflater;
    private CaptionedImagesAdapter adapter;
    private HomepageReviewAdapter adapter2;
    private DrawerLayout drawer;
    private ActionBarDrawerToggle drawerToggle;
    private NavigationView navigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_member_homepage);

        memberSearchview = (SearchView) findViewById(R.id.memberSearchview_id);
        memberRecyclerView = (RecyclerView) findViewById(R.id.member_recyclerview_id);
        memberRecyclerView2 = (RecyclerView) findViewById(R.id.member_recyclerview2_id);
        drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        navigationView = (NavigationView) findViewById(R.id.navigation_drawer_id);
        drawerToggle = new ActionBarDrawerToggle(this,drawer,R.string.nav_open,R.string.nav_close);

        drawer.addDrawerListener(drawerToggle);
        drawerToggle.syncState();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        navigationView.setNavigationItemSelectedListener(this);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
        memberRecyclerView.setLayoutManager(layoutManager);

        LinearLayoutManager layoutManager2 = new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
        memberRecyclerView2.setLayoutManager(layoutManager2);

        String[] names = new String[cardViewBooks.cardViews.length];
        for(int i=0;i<names.length;i++){
            names[i] = cardViewBooks.cardViews[i].getName();
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

        adapter = new CaptionedImagesAdapter(names,images);
        memberRecyclerView.setAdapter(adapter);

        adapter2 = new HomepageReviewAdapter(reviews,reviewImages);
        memberRecyclerView2.setAdapter(adapter2);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if(drawerToggle.onOptionsItemSelected(item)){
            return true;
        }

        else if(item.getItemId()==R.id.member_sign_out){
            Intent intent = new Intent(Member_activity_homepage.this,Member_sign_in.class);
            startActivity(intent);
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.member_homepage_menu_layout,menu);

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

        int id = menuItem.getItemId();
        Intent intent = null;

        switch (id){
            case R.id.add_books:
                intent = new Intent(Member_activity_homepage.this,Add_a_book.class);
                drawer.closeDrawer(GravityCompat.START);
                break;

            case R.id.profile_id:
                intent = new Intent(Member_activity_homepage.this,Profile.class);
                drawer.closeDrawer(GravityCompat.START);
                break;

            case R.id.friends_option:
                intent = new Intent(Member_activity_homepage.this,Friends.class);
                drawer.closeDrawer(GravityCompat.START);
                break;

            case R.id.reading_list_id:
                intent = new Intent(Member_activity_homepage.this,ReadingList.class);
                drawer.closeDrawer(GravityCompat.START);
                break;

            case R.id.book_list_id:
                intent = new Intent(Member_activity_homepage.this,BookList.class);
                drawer.closeDrawer(GravityCompat.START);
                break;
        }

        startActivity(intent);


        return true;
    }

    @Override
    public void onBackPressed() {

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if(drawer.isDrawerOpen(GravityCompat.START)){
            drawer.closeDrawer(GravityCompat.START);
        }
        else
            super.onBackPressed();
    }
}
