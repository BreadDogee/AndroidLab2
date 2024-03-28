package com.example.lab2;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.lab2.databinding.FragmentBlankForBus1Binding;

import org.greenrobot.eventbus.EventBus;

public class InputFragment extends Fragment {

    public FragmentBlankForBus1Binding binding;
    public InputFragment() {
        super(R.layout.fragment_blank_for_bus1);
    }

    public String getText() {
        String txt;
        txt = binding.editText.getText().toString();
        return txt;
    }
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        binding = FragmentBlankForBus1Binding.inflate(getLayoutInflater());
        View v = binding.getRoot();
        Button button = binding.buutton;
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EventBus.getDefault().post(new Bus(binding.editText.getText().toString()));
            }
        });
        return v;
    }
}