package com.aavdeev.sportbrand;


import android.app.Activity;
import android.app.ListFragment;
import android.content.Context;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ListBrandFragment extends ListFragment {

interface ListBrandListrner{
    void itemClicked(long id);
}

    private ListBrandListrner listrner;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        String[] listBrand = new String[SportBrand.listBrand.length];
        for (int i = 0; i<listBrand.length;i++) {
            listBrand[i] = SportBrand.listBrand[i].getName();
        }

        ArrayAdapter<String> adapter = new ArrayAdapter<>(inflater.getContext(),
                android.R.layout.simple_list_item_1, listBrand);

        setListAdapter(adapter);


        return super.onCreateView(inflater, container, savedInstanceState);
    }


    @Override
    public void onAttach(Activity context) {
        super.onAttach(context);
        this.listrner = (ListBrandListrner) context;
    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        if (listrner != null) {
            listrner.itemClicked(id);
        }
    }
}
