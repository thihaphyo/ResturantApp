package com.padc.resturantapp.views.holders;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;

import com.padc.resturantapp.R;
import com.padc.resturantapp.delegates.FoodListDelegate;

public class FoodViewHolder extends RecyclerView.ViewHolder {

    private FoodListDelegate mDelegate;
    Button btnFood;

    public FoodViewHolder(@NonNull View itemView, FoodListDelegate delegate) {
        super(itemView);

        btnFood = itemView.findViewById(R.id.btn_choose);

        mDelegate = delegate;

        btnFood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mDelegate.onClickFood();
            }
        });
    }
}
