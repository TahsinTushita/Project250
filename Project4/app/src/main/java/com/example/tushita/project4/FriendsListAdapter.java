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

public class FriendsListAdapter extends RecyclerView.Adapter<FriendsListAdapter.ViewHolder>{

    private String[] names;
    private int[] imageIds;

    public FriendsListAdapter(String[] names,int[] imageIds){
        this.names = names;
        this.imageIds = imageIds;
    }



    @NonNull
    @Override
    public FriendsListAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        CardView cv1 = (CardView) LayoutInflater.from(parent.getContext()).inflate(R.layout.friendslist,parent,false);

        return new FriendsListAdapter.ViewHolder(cv1);
    }

    @Override
    public void onBindViewHolder(@NonNull FriendsListAdapter.ViewHolder holder, int position) {
        CardView cardView = holder.friendsList;
        ImageView imageView = (ImageView) cardView.findViewById(R.id.friends_list_imgae_id);
        Drawable drawable = ContextCompat.getDrawable(cardView.getContext(),imageIds[position]);
        imageView.setImageDrawable(drawable);
        imageView.setContentDescription(names[position]);
        TextView textView = (TextView) cardView.findViewById(R.id.friends_list_name_id);
        textView.setText(names[position]);
    }

    @Override
    public int getItemCount() {
        return names.length;
    }


    public static class ViewHolder extends RecyclerView.ViewHolder{

        private CardView friendsList;

        public ViewHolder(CardView v) {
            super(v);
            friendsList = v;
        }
    }


}
