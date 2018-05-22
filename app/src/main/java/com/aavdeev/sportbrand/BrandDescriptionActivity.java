package com.aavdeev.sportbrand;

import android.app.Activity;
import android.os.Bundle;

public class BrandDescriptionActivity extends Activity {

    public static final String NAME_ID_KEY = "nameID";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_brand_description);

        int nameID = (int) getIntent().getExtras().get(NAME_ID_KEY);
        DescriptionBrandFragment description = (DescriptionBrandFragment) getFragmentManager().findFragmentById(R.id.descriptionBrandActivity);
        description.setNameID(nameID);
    }
}
