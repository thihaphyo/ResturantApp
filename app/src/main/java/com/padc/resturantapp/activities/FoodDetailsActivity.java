package com.padc.resturantapp.activities;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.padc.resturantapp.R;

public class FoodDetailsActivity extends AppCompatActivity {

    public static Intent newIntent(Context context) {

        Intent intent = new Intent(context, FoodDetailsActivity.class);
        return intent;
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_details);
    }
}
