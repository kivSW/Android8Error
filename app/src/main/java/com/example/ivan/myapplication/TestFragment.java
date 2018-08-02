package com.example.ivan.myapplication;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;


/**
 * A simple {@link Fragment} subclass.
 */
public class TestFragment extends Fragment {

    View rootView;
    CheckBox checkBox;

    public TestFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        rootView=inflater.inflate(R.layout.fragment_test, container, false);
        checkBox =  rootView.findViewById(R.id.checkBox);

        //checkBox.setChecked(true);//this works correctly
        return rootView;
    }

    @Override
    public void onStart()
    {
        super.onStart();

        checkBox.setChecked(true);

    }

}
