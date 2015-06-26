package com.example.android.sunshine.app;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * A placeholder fragment containing a simple view.
 */
public class ForecastFragment extends Fragment {

    ArrayAdapter<String> mForecastAdapter;

    public ForecastFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // fake data
        String[] data = {
                "Mon 6/23 - Sunny - 31/17",
                "Tue 6/24 - Foggy - 21/8",
                "Wed 6/25 - Cloudy - 22/17",
                "Thu 6/26 - Rainy - 18/11",
                "Fri 6/27 - Foggy - 21/10",
                "Sat 6/28 - Freezy - 23/18",
                "Sun 6/29 - Sunny - 20/7",
                "Mon 6/30 - Bloody - 10/5",
                "Tue 7/1  - Cold - 8/4"
        };
        List<String> weekForecast = new ArrayList<String>(Arrays.asList(data));

        View rootView = inflater.inflate(R.layout.fragment_main, container, false);

        // Find listView in hierarchy
        ListView listView = (ListView) rootView.findViewById(R.id.listview_forecast);

        // Create ArrayAdapter binding data and associated view (
        mForecastAdapter = new ArrayAdapter<String>(
                getActivity(),
                R.layout.list_item_forecast2,
                R.id.list_item_forecast_textview,
                weekForecast);

        // Set Adapter
        listView.setAdapter(mForecastAdapter);


        return rootView;
    }


}
