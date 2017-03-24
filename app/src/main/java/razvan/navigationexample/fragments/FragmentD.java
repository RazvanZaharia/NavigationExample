package razvan.navigationexample.fragments;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import razvan.navigationexample.R;

public class FragmentD extends Fragment {

    public static FragmentD newInstance() {
        FragmentD fragment = new FragmentD();

        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_d, container, false);
    }
}
