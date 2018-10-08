package com.example.tushita.project4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class BookList extends AppCompatActivity {

    private RecyclerView booklist;
    private ReadingListAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_list);

        booklist = (RecyclerView) findViewById(R.id.book_list_recyclerview);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
        booklist.setLayoutManager(layoutManager);

        String[] names=new String[cardviewReadinglist.cardViews.length];
        for(int i=0;i<names.length;i++){
            names[i]=cardviewReadinglist.cardViews[i].getName();
        }

        int[] images=new int[cardviewReadinglist.cardViews.length];
        for(int i=0;i<images.length;i++){
            images[i]=cardviewReadinglist.cardViews[i].getImageResourceId();
        }

        adapter = new ReadingListAdapter(names,images);
        booklist.setAdapter(adapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.book_list_menu,menu);

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if(item.getItemId()==R.id.book_list_addbutton){
            Intent intent = new Intent(BookList.this,Add_a_book.class);
            startActivity(intent);
        }

        return super.onOptionsItemSelected(item);
    }
}
