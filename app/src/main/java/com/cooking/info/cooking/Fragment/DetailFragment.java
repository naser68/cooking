package com.cooking.info.cooking.Fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.cooking.info.cooking.Entities.Cooking;
import com.cooking.info.cooking.R;
import com.cooking.info.cooking.Util.Request;

/**
 * A simple {@link Fragment} subclass.
 */
public class DetailFragment extends Fragment {

    public int id;

    public DetailFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_detail, container, false);
        TextView txtTitle = (TextView) view.findViewById(R.id.txtTitle);
        TextView txtDescription = (TextView) view.findViewById(R.id.txtDescription);
        ImageView imgCooking = (ImageView) view.findViewById(R.id.imgCooking);
        Request request = new Request(getContext());
        Cooking cooking = request.GetCooking(id);
        txtTitle.setText(cooking.getName());
        txtDescription.setText(cooking.getDescription());
        Glide.with(getContext()).load(cooking.getImageUrl()).into(imgCooking);


        return view;
    }

}
