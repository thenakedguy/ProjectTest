package com.hngdngcorp.hngdng.projecttest.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.hngdngcorp.hngdng.projecttest.HistoryActivity;
import com.hngdngcorp.hngdng.projecttest.Model.Randomize;
import com.hngdngcorp.hngdng.projecttest.R;

import java.util.ArrayList;
import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class RandomizeAdapter  extends RecyclerView.Adapter<RandomizeAdapter.ViewHolder> {
    private List<Randomize> randomizeList = new ArrayList<>();

    public RandomizeAdapter(HistoryActivity historyActivity, List<Randomize> randomizeList) {
        this.randomizeList = randomizeList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
            View itemview = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.history_layout,viewGroup,false);

        return new ViewHolder(itemview);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        final Randomize randomize = randomizeList.get(i);
        viewHolder.tvID.setText(randomizeList.get(i).toString());
        viewHolder.tvDate.setText(randomize.getDate());
        viewHolder.tvResult.setText(randomize.getResult());
    }

    @Override
    public int getItemCount() {
        return randomizeList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView tvID;
        private TextView tvDate;
        private TextView tvResult;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvID = itemView.findViewById(R.id.tvID);
            tvDate = itemView.findViewById(R.id.tvDate);
            tvResult = itemView.findViewById(R.id.tvResult);

        }
    }
}
