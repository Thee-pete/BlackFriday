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
import com.zuture.apps.blackfridaynew.adapters.AppsAdapter;
import com.zuture.apps.blackfridaynew.classes.Apps;

import java.util.ArrayList;

public class AppsFragment extends Fragment {


    Context context;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {



        View view= inflater.inflate(R.layout.fragment_apps, container, false);
        Context context= getActivity();


        ImageView imageView = view.findViewById(R.id.closeAppsBtn);
        final CardView disclaimerApps= view.findViewById(R.id.disclaimerapps);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                disclaimerApps.setVisibility(View.GONE);
            }
        });

        RecyclerView appsRecycler = view.findViewById(R.id.appsRecycler);
        ArrayList<Apps> appsArrayList= new ArrayList<>();
        appsArrayList.add(new Apps(context.getResources().getDrawable(R.drawable.shopsavvy),context.getResources().getString(R.string.shopsavvy),context.getResources().getString(R.string.shopsavvydesc),context.getResources().getString(R.string.shopsavvylink)));
        appsArrayList.add(new Apps(context.getResources().getDrawable(R.drawable.flipp),context.getResources().getString(R.string.flipptitle),context.getResources().getString(R.string.flippdesc),context.getResources().getString(R.string.flipplink)));
        appsArrayList.add(new Apps(context.getResources().getDrawable(R.drawable.pc),context.getResources().getString(R.string.pctitle),context.getResources().getString(R.string.pcdesc),context.getResources().getString(R.string.pclink)));
        appsArrayList.add(new Apps(context.getResources().getDrawable(R.drawable.tca),context.getResources().getString(R.string.tcatitle),context.getResources().getString(R.string.tcadesc),context.getResources().getString(R.string.tcalink)));
        appsArrayList.add(new Apps(context.getResources().getDrawable(R.drawable.amazon),context.getResources().getString(R.string.amazontitle),context.getResources().getString(R.string.amazonappdesc),context.getResources().getString(R.string.amazonapplink)));



        AppsAdapter appsAdapter= new AppsAdapter(context,appsArrayList);
        appsRecycler.setAdapter(appsAdapter);
        appsRecycler.setLayoutManager(new LinearLayoutManager(context));

        return view;
    }
}