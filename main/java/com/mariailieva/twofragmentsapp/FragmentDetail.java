package com.mariailieva.twofragmentsapp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class FragmentDetail extends Fragment {

    private ImageView image;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.detailfragment,container, false);
        image = view.findViewById(R.id.imageView);
        return view;
    }

    public void changeImage (String text){
        image.setImageResource(getResources().getIdentifier(text, "drawable", getContext().getPackageName() ));
    }
}
