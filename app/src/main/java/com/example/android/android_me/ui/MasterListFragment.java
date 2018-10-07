package com.example.android.android_me.ui;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

import com.example.android.android_me.R;
import com.example.android.android_me.data.AndroidImageAssets;

// COMPLETED (2) Create a new class called MasterListFragment which will display the GridView list of ALL AndroidMe images
// In the fragment class, you'll need to implement an empty constructor, and onCreateView
public class MasterListFragment extends Fragment {

    // Required empty constructor
    public MasterListFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragmet_master_list, container, false);

        GridView masterListGridView = (GridView) view.findViewById(R.id.master_list_gridview);

        // COMPLETED (3) In the MasterListFragment class, create a new MasterListAdapter and set it on the GridView
        // The MasterListAdapter code is provided; it creates the ImageViews that are contained in the GridView
        // The adapter takes as parameters (Context context, List<Integer> imageIds)
        MasterListAdapter adapter = new MasterListAdapter(getContext(), AndroidImageAssets.getAll());
        masterListGridView.setAdapter(adapter);

        return view;
    }
}
