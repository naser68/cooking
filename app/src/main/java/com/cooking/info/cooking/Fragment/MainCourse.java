package com.cooking.info.cooking.Fragment;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.cooking.info.cooking.Adapter.CookingAdapter;
import com.cooking.info.cooking.Entities.Cooking;
import com.cooking.info.cooking.R;
import com.cooking.info.cooking.Util.RecyclerItemClickListener;
import com.cooking.info.cooking.Util.Request;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link MainCourse.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link MainCourse#newInstance} factory method to
 * create an instance of this fragment.
 */
public class MainCourse extends Fragment {

    private List<Cooking> cookings;
    private CookingAdapter cookingAdapter;
    private RecyclerView recyclerView;
    private OnFragmentInteractionListener mListener;

    public MainCourse() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_main_course, container, false);
        getActivity().setTitle("Main Course");
        Request request = new Request(getContext());
        cookings = request.GetCookings(2);
        recyclerView = (RecyclerView) view.findViewById(R.id.recycler_view);
        recyclerView.addItemDecoration(new DividerItemDecoration(getActivity(), DividerItemDecoration.VERTICAL));

        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        cookingAdapter = new CookingAdapter(view.getContext(), cookings);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(cookingAdapter);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.addOnItemTouchListener(
                new RecyclerItemClickListener(getContext(), recyclerView, new RecyclerItemClickListener.OnItemClickListener() {
                    @Override
                    public void onItemClick(View view, int position) {
                        // do whatever
                        cookings.get(position).getId();
                        DetailFragment fragInfo = new DetailFragment();
                        fragInfo.id =  cookings.get(position).getId();
                        FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                        final FragmentTransaction transaction = fragmentManager.beginTransaction();
                        transaction.replace(R.id.main_container, fragInfo).addToBackStack(null);
                        transaction.commit();
                    }

                    @Override
                    public void onLongItemClick(View view, int position) {
                        // do whatever
                    }
                })
        );
        // cookingAdapter.notifyDataSetChanged();

        return view;
    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onMainCourseFragmentInteraction(uri);
        }
    }


    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onMainCourseFragmentInteraction(Uri uri);
    }
}


