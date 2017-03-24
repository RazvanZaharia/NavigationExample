package razvan.navigationexample.fragments;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import razvan.navigationexample.R;

public class FragmentE extends DialogFragment {

    public static FragmentE newInstance() {
        FragmentE fragment = new FragmentE();

        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_e, container, false);
    }
}
