package com.example.tushita.project4;

import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class ReadingListAdapter extends RecyclerView.Adapter<ReadingListAdapter.ViewHolder>{



    private String[] captions;
    private int[] imageIDs;

    public ReadingListAdapter(String[] captions, int[] imageIDs){
        this.captions = captions;
        this.imageIDs = imageIDs;
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int position) {

        CardView cv = (CardView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.reading_list,viewGroup,false);

        return new ViewHolder(cv);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int position) {
        CardView cardView = viewHolder.readinglist;
        ImageView imageView = (ImageView) cardView.findViewById(R.id.readinglist_cardimage_id);
        Drawable drawable = ContextCompat.getDrawable(cardView.getContext(),imageIDs[position]);
        imageView.setImageDrawable(drawable);
        imageView.setContentDescription(captions[position]);
        TextView textView = (TextView) cardView.findViewById(R.id.readinglist_cardtext_id);
        textView.setText(captions[position]);
    }

    @Override
    public int getItemCount() {
        return captions.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private CardView readinglist;
        public ViewHolder(CardView v){
            super(v);
            readinglist = v;
        }
    }
}
