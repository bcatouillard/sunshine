package com.example.android.sunshine;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.w3c.dom.Text;

public class ForecastAdapter extends RecyclerView.Adapter<ForecastAdapter.ForecastAdapterViewHolder> {

    private String[] mWeatherData;

    ForecastAdapter(){

    }

    class ForecastAdapterViewHolder extends RecyclerView.ViewHolder {

        public final TextView mWeatherTextView;

        ForecastAdapterViewHolder(View view){
            super(view);
            mWeatherTextView = (TextView) view.findViewById(R.id.recyclerview_forecast);
        }

        @Override
        public ForecastAdapterViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            return null;
        }
    }
}

