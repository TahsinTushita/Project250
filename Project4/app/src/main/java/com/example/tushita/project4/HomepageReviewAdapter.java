package com.example.tushita.project4;

import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class HomepageReviewAdapter extends RecyclerView.Adapter<HomepageReviewAdapter.ViewHolder>{

    private String[] reviews;
    private int[] imageIds;

    public HomepageReviewAdapter(String[] reviews,int[] imageIds){
        this.reviews = reviews;
        this.imageIds = imageIds;
    }



    @NonNull
    @Override
    public HomepageReviewAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        CardView cv1 = (CardView) LayoutInflater.from(parent.getContext()).inflate(R.layout.homepage_card_review,parent,false);

        return new ViewHolder(cv1);
    }

    @Override
    public void onBindViewHolder(@NonNull HomepageReviewAdapter.ViewHolder holder, int position) {
        CardView cardView = holder.reviewcardview;
        ImageView imageView = (ImageView) cardView.findViewById(R.id.guest_home_cardReviewImage_id);
        Drawable drawable = ContextCompat.getDrawable(cardView.getContext(),imageIds[position]);
        imageView.setImageDrawable(drawable);
        imageView.setContentDescription(reviews[position]);
        TextView textView = (TextView) cardView.findViewById(R.id.guest_home_cardReviewText_id);
        textView.setText(reviews[position]);
    }

    @Override
    public int getItemCount() {
        return reviews.length;
    }


    public static class ViewHolder extends RecyclerView.ViewHolder{

        private CardView reviewcardview;

        public ViewHolder(CardView v) {
            super(v);
            reviewcardview = v;
        }
    }

}
