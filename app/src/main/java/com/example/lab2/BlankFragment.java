package com.example.lab2;

import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.lab2.databinding.FragmentBlank2Binding;

public class BlankFragment extends Fragment {

    FragmentBlank2Binding binding;
    InnerInterface InnerInterface;

    public String text;
    @Override
    public void onAttach(Context context){
        super.onAttach(context);
   }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentBlank2Binding.inflate(inflater, container, false);
        View view = binding.getRoot();
        binding.textView.setText(text);
        binding.button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                InnerInterface.Button2Switch();
            }
        });
        // Inflate the layout for this fragment
        return view;
    }
}