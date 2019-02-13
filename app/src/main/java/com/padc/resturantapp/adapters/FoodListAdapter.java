package com.padc.resturantapp.adapters;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.padc.resturantapp.R;
import com.padc.resturantapp.delegates.FoodListDelegate;
import com.padc.resturantapp.views.holders.FoodViewHolder;

public class FoodListAdapter extends RecyclerView.Adapter<FoodViewHolder> {

    private FoodListDelegate mDelegate;

    public FoodListAdapter(FoodListDelegate delegate) {

        this.mDelegate = delegate;

    }

    @NonNull
    @Override
    public FoodViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        LayoutInflater inflater = LayoutInflater.from(viewGroup.getContext());
        View view = inflater.inflate(R.layout.view_item_food, viewGroup, false);
        return new FoodViewHolder(view,mDelegate);
    }

    @Override
    public void onBindViewHolder(@NonNull FoodViewHolder foodViewHolder, int i) {

    }

    @Override
    public int getItemCount() {
        return 10;
    }
}
