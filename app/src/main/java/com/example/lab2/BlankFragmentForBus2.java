package com.example.lab2;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.lab2.databinding.FragmentBlankForBus2Binding;

public class InputFragment2 extends Fragment {

    public FragmentBlankForBus2Binding binding;
    public interface onSomeEventListener {
        public void someEvent(String s);
    }

    onSomeEventListener someEventListener;
    public InputFragment2() {
        super(R.layout.fragment_blank_for_bus2);
    }

    @Override
    public void onAttach(@NonNull Context activity) {
        super.onAttach(activity);
        try {
            someEventListener = (onSomeEventListener) activity;
        } catch (ClassCastException e) {
            throw new ClassCastException(activity.toString() + " must implement onSomeEventListener");
        }
    }
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentBlankForBus2Binding.inflate(getLayoutInflater());
        View v = binding.getRoot();

        Button button = binding.button;
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                someEventListener.someEvent(binding.editTextText.getText().toString());
            }
        });

        return v;
    }
}