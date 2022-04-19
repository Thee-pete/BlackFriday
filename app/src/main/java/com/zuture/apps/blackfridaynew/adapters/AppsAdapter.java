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
import com.zuture.apps.blackfridaynew.classes.Apps;
import com.zuture.apps.blackfridaynew.popUpAds.PopUpAdsApps;

import java.util.ArrayList;

public class AppsAdapter extends RecyclerView.Adapter<AppsAdapter.ViewHolder> {

    private Context mContext;
    private ArrayList<Apps> appsArrayList;

    public AppsAdapter(Context mContext, ArrayList<Apps> appsArrayList){
        this.mContext=mContext;
        this.appsArrayList=appsArrayList;

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
    public AppsAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        CardView cardView= (CardView) LayoutInflater.from(mContext).inflate(R.layout.app_item,parent,false);
        return new ViewHolder(cardView);
    }

    @Override
    public void onBindViewHolder(@NonNull AppsAdapter.ViewHolder holder, final int position) {

        CardView cardView= holder.cardView;
        ImageView appImg = cardView.findViewById(R.id.appImg);
        appImg.setImageDrawable(appsArrayList.get(position).getAppImgRsc());

        TextView appTitle = cardView.findViewById(R.id.appTitle);
        appTitle.setText(appsArrayList.get(position).getAppTitle());

        TextView appDesc = cardView.findViewById(R.id.appDesc);
        appDesc.setText(appsArrayList.get(position).getAppDesc());

        Button getAppBtn = cardView.findViewById(R.id.getAppBtn);
        getAppBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Intent intent1 = new Intent(Intent.ACTION_VIEW);
                //intent1.setData(Uri.parse(appsArrayList.get(position).getAppLink()));
                //intent1.setPackage("com.android.vending");
                //mContext.startActivity(intent1);

                PopUpAdsApps.ShowInterstitialAds(mContext,appsArrayList.get(position).getAppLink());
            }
        });
    }

    @Override
    public int getItemCount() {
        return appsArrayList.size();
    }


}
