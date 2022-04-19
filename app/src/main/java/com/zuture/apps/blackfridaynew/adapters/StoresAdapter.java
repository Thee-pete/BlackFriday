package com.zuture.apps.blackfridaynew.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.zuture.apps.blackfridaynew.R;
import com.zuture.apps.blackfridaynew.classes.Stores;
import com.zuture.apps.blackfridaynew.popUpAds.PopUpAds;

import java.util.ArrayList;

public class StoresAdapter extends RecyclerView.Adapter<StoresAdapter.ViewHolder> {

    ArrayList<Stores> storesArrayList;
    Context mContext;

    public StoresAdapter(Context mContext, ArrayList<Stores> storesArrayList){
        this.mContext= mContext;
        this.storesArrayList=storesArrayList;
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
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        CardView cardView= (CardView) LayoutInflater.from(parent.getContext()).inflate(R.layout.store_item,parent,false);
        return new ViewHolder(cardView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, final int position) {

        CardView cardView= holder.cardView;


        ImageView imageView = cardView.findViewById(R.id.storeImage);
        imageView.setImageDrawable(storesArrayList.get(position).getImageRsc());

        TextView storeTitle= cardView.findViewById(R.id.storeTitle);
        storeTitle.setText(storesArrayList.get(position).getStoreTitle());

        TextView storeDesc= cardView.findViewById(R.id.storeDesc);
        storeDesc.setText(storesArrayList.get(position).getStoreDesc());


        Button openStore= cardView.findViewById(R.id.visitStoreBtn);
        openStore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               // Intent i = new Intent(Intent.ACTION_VIEW);
                //i.setData(Uri.parse(storesArrayList.get(position).getStoreLink()));
                //mContext.startActivity(i);

                PopUpAds.ShowInterstitialAds(mContext,storesArrayList.get(position).getStoreLink());
            }
        });
    }

    @Override
    public int getItemCount() {
        return storesArrayList.size();
    }


}
