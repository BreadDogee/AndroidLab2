package com.example.lab2;

import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.lab2.databinding.FragmentBlankBinding;

public class BlankFragment extends Fragment {

    FragmentBlankBinding binding;
    InnerInterface InnerInterface;

    public String text;

    @Override
    public void onAttach(Context context){
        super.onAttach(context);
        InnerInterface = (InnerInterface) context;
    }
    public void setCallBackInterface(InnerInterface callBackInterface){
        this.InnerInterface = callBackInterface;
    }
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
   
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentBlankBinding.inflate(inflater, container, false);
        View view = binding.getRoot();
        binding.button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                InnerInterface.Button1Switch(binding.editText.getText().toString());
            }
        });
        // Inflate the layout for this fragment
        return view;
    }
}