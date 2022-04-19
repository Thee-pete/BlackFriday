package com.zuture.apps.blackfridaynew.fragments;

import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.zuture.apps.blackfridaynew.R;
import com.zuture.apps.blackfridaynew.adapters.TipsAdapter;
import com.zuture.apps.blackfridaynew.classes.Tips;

import java.util.ArrayList;

public class TipsFragment extends Fragment {
    Context mContext;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        mContext= getActivity();

        View view = inflater.inflate(R.layout.fragment_tips, container, false);
        RecyclerView tipsRecycler= view.findViewById(R.id.tipsRecycler);

        ArrayList<Tips> tipsArrayList = new ArrayList<>();
        tipsArrayList.add(new Tips( mContext.getResources().getString(R.string.tiptitle1),mContext.getResources().getString(R.string.tipdesc1)));
        tipsArrayList.add(new Tips( mContext.getResources().getString(R.string.tiptitle2),mContext.getResources().getString(R.string.tipdesc2)));
        tipsArrayList.add(new Tips( mContext.getResources().getString(R.string.tiptitle3),mContext.getResources().getString(R.string.tipdesc3)));
        tipsArrayList.add(new Tips( mContext.getResources().getString(R.string.tiptitle4),mContext.getResources().getString(R.string.tipdesc4)));
        tipsArrayList.add(new Tips( mContext.getResources().getString(R.string.tiptitle5),mContext.getResources().getString(R.string.tipdesc5)));
        tipsArrayList.add(new Tips( mContext.getResources().getString(R.string.tiptitle6),mContext.getResources().getString(R.string.tipdesc6)));
        tipsArrayList.add(new Tips( mContext.getResources().getString(R.string.tiptitle7),mContext.getResources().getString(R.string.tipdesc7)));
        tipsArrayList.add(new Tips( mContext.getResources().getString(R.string.tiptitle8),mContext.getResources().getString(R.string.tipdesc8)));
        tipsArrayList.add(new Tips( mContext.getResources().getString(R.string.tiptitle9),mContext.getResources().getString(R.string.tipdesc9)));
        tipsArrayList.add(new Tips( mContext.getResources().getString(R.string.tiptitle10),mContext.getResources().getString(R.string.tipdesc10)));

        TipsAdapter tipsAdapter = new TipsAdapter(tipsArrayList);
        tipsRecycler.setAdapter(tipsAdapter);
        tipsRecycler.setLayoutManager(new LinearLayoutManager(mContext));

        return view;
    }
}