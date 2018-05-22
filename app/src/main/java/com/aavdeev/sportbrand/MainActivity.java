package com.aavdeev.sportbrand;

import android.app.Activity;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity implements ListBrandFragment.ListBrandListrner {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void itemClicked(long id) {
        View containerDescription = findViewById(R.id.containerDescription);
        if (containerDescription != null) {
            DescriptionBrandFragment description = new DescriptionBrandFragment();
            FragmentTransaction ft = getFragmentManager().beginTransaction();
            description.setNameID(id);
            ft.replace(R.id.containerDescription, description);
            ft.addToBackStack(null);
            ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
            ft.commit();
        } else {
            Intent intent = new Intent(MainActivity.this, BrandDescriptionActivity.class);
            intent.putExtra(BrandDescriptionActivity.NAME_ID_KEY, (int) id);
            startActivity(intent);
        }
    }
}
