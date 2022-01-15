package com.example.dz3;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


public class MainFragment_5 extends Fragment {
    private Button button;
    private EditText editText;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_main_5, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        button = view.findViewById(R.id.btn_send5);
        editText = view.findViewById(R.id.et_second_fragment);
        String text = requireArguments().getString("muba");
        editText.setText(text);
        button.setOnClickListener(view1 -> sendData());

    }

    private void sendData() {
        FirstFragment fragment = new FirstFragment();
        getParentFragmentManager().beginTransaction().replace(R.id.fragment_container, fragment).commit();

    }
}