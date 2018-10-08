package com.example.tushita.project4;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.ImageView;
import android.graphics.drawable.Drawable;
import android.support.v4.content.ContextCompat;

import org.w3c.dom.Text;

public class CaptionedImagesAdapter extends RecyclerView.Adapter<CaptionedImagesAdapter.ViewHolder>{

    private String[] captions;
    private int[] imageIDs;

    public CaptionedImagesAdapter(String[] captions, int[] imageIDs){
        this.captions = captions;
        this.imageIDs = imageIDs;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        CardView cv = (CardView) LayoutInflater.from(parent.getContext()).inflate(R.layout.card_captioned_image,parent,false);

        return new ViewHolder(cv);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        CardView cardView = holder.cardView;
        ImageView imageView = (ImageView) cardView.findViewById(R.id.guest_home_cardimage_id);
        Drawable drawable = ContextCompat.getDrawable(cardView.getContext(),imageIDs[position]);
        imageView.setImageDrawable(drawable);
        imageView.setContentDescription(captions[position]);
        TextView textView = (TextView) cardView.findViewById(R.id.guest_home_cardtext_id);
        textView.setText(captions[position]);
    }

    @Override
    public int getItemCount() {
        return captions.length;
    }


    public static class ViewHolder extends RecyclerView.ViewHolder{

        private CardView cardView;

        public ViewHolder(CardView v){
            super(v);
            cardView = v;
        }

    }
}
