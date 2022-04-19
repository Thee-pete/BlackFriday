package com.zuture.apps.blackfridaynew.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.zuture.apps.blackfridaynew.R;
import com.zuture.apps.blackfridaynew.classes.Tips;

import java.util.ArrayList;

public class TipsAdapter extends RecyclerView.Adapter<TipsAdapter.ViewHolder> {


    ArrayList<Tips> tipsArrayList;


    public TipsAdapter(ArrayList<Tips> tipsArrayList){
        this.tipsArrayList= tipsArrayList;

    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        CardView cardView;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            this.cardView= (CardView) itemView;
        }
    }

    @NonNull
    @Override
    public TipsAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        CardView cardView= (CardView) LayoutInflater.from(parent.getContext()).inflate(R.layout.tip_item,parent,false);
        return new ViewHolder(cardView);
    }

    @Override
    public void onBindViewHolder(@NonNull TipsAdapter.ViewHolder holder, int position) {
        CardView cardView= holder.cardView;
        TextView title= cardView.findViewById(R.id.tiptitle);
        title.setText(tipsArrayList.get(position).getTipTitle());
        TextView desc= cardView.findViewById(R.id.tipdesc);
        desc.setText(tipsArrayList.get(position).getTipDesc());
    }

    @Override
    public int getItemCount() {
        return tipsArrayList.size();
    }


}
