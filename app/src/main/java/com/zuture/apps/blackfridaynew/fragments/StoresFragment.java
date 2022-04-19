package com.zuture.apps.blackfridaynew.fragments;

import android.content.Context;
import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.zuture.apps.blackfridaynew.R;
import com.zuture.apps.blackfridaynew.adapters.StoresAdapter;
import com.zuture.apps.blackfridaynew.classes.Stores;

import java.util.ArrayList;


public class StoresFragment extends Fragment {



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
       View view= inflater.inflate(R.layout.fragment_stores, container, false);
       Context context= getActivity();


        ImageView imageView = view.findViewById(R.id.closeBtn);
        final CardView disclaimer= view.findViewById(R.id.disclaimer);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                disclaimer.setVisibility(View.GONE);
            }
        });

        RecyclerView recyclerView= view.findViewById(R.id.storesRecycler);
        ArrayList<Stores> storesArrayList= new ArrayList<>();
        storesArrayList.add(new Stores(context.getResources().getDrawable(R.drawable.amazonimg),context.getResources().getString(R.string.amazonTitle),context.getResources().getString(R.string.amazondesc),context.getResources().getString(R.string.amazonlink)));
        storesArrayList.add(new Stores(context.getResources().getDrawable(R.drawable.walmart),context.getResources().getString(R.string.walmartTitle),context.getResources().getString(R.string.walmartdesc),context.getResources().getString(R.string.walmartlink)));
        storesArrayList.add(new Stores(context.getResources().getDrawable(R.drawable.ebay),context.getResources().getString(R.string.ebayTitle),context.getResources().getString(R.string.eBaydesc),context.getResources().getString(R.string.eBaylink)));
        storesArrayList.add(new Stores(context.getResources().getDrawable(R.drawable.kohls),context.getResources().getString(R.string.kohlsTitle),context.getResources().getString(R.string.kohlsdesc),context.getResources().getString(R.string.kohlslink)));
        storesArrayList.add(new Stores(context.getResources().getDrawable(R.drawable.bestbuy),context.getResources().getString(R.string.bestbuyTitle),context.getResources().getString(R.string.bestbuydesc),context.getResources().getString(R.string.bestbuylink)));
        storesArrayList.add(new Stores(context.getResources().getDrawable(R.drawable.dell),context.getResources().getString(R.string.dellTitle),context.getResources().getString(R.string.delldesc),context.getResources().getString(R.string.delllink)));


        storesArrayList.add(new Stores(context.getResources().getDrawable(R.drawable.samsclub3),context.getResources().getString(R.string.samsclubTitle),context.getResources().getString(R.string.samsclubdesc),context.getResources().getString(R.string.samsclublink)));
        storesArrayList.add(new Stores(context.getResources().getDrawable(R.drawable.macystwo),context.getResources().getString(R.string.macysTitle),context.getResources().getString(R.string.macysdesc),context.getResources().getString(R.string.macyslink)));
        storesArrayList.add(new Stores(context.getResources().getDrawable(R.drawable.jcpenneytwo),context.getResources().getString(R.string.jcpennyTitle),context.getResources().getString(R.string.jcpennydesc),context.getResources().getString(R.string.jcpennylink)));
        storesArrayList.add(new Stores(context.getResources().getDrawable(R.drawable.samsungtwo),context.getResources().getString(R.string.samsungTitle),context.getResources().getString(R.string.samsungdesc),context.getResources().getString(R.string.samsunglink)));
        storesArrayList.add(new Stores(context.getResources().getDrawable(R.drawable.toysrus),context.getResources().getString(R.string.toysrusTitle),context.getResources().getString(R.string.toysrusdesc),context.getResources().getString(R.string.toysruslink)));
        storesArrayList.add(new Stores(context.getResources().getDrawable(R.drawable.targettwo),context.getResources().getString(R.string.targetTitle),context.getResources().getString(R.string.targetdesc),context.getResources().getString(R.string.targetlink)));
        storesArrayList.add(new Stores(context.getResources().getDrawable(R.drawable.kmarttwo),context.getResources().getString(R.string.kmartTitle),context.getResources().getString(R.string.kmartdesc),context.getResources().getString(R.string.kmartlink)));
        storesArrayList.add(new Stores(context.getResources().getDrawable(R.drawable.groupontwo),context.getResources().getString(R.string.grouponTitle),context.getResources().getString(R.string.groupondesc),context.getResources().getString(R.string.grouponlink)));
        storesArrayList.add(new Stores(context.getResources().getDrawable(R.drawable.searstwo),context.getResources().getString(R.string.searsTitle),context.getResources().getString(R.string.searsdesc),context.getResources().getString(R.string.searslink)));


        StoresAdapter storesAdapter= new StoresAdapter(context,storesArrayList);
        recyclerView.setAdapter(storesAdapter);

        recyclerView.setLayoutManager(new LinearLayoutManager(context));


       return view;
    }
}