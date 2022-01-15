package com.example.dz3;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;


public class ListFragment extends Fragment {
private Button button;
private EditText editText;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_list, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        button=view.findViewById(R.id.btn_send4);
        editText=view.findViewById(R.id.chetyry);
        String text = requireArguments().getString("sagyn");
        editText.setText(text);
        button.setOnClickListener(view1 -> sendData());

    }

    private void sendData() {
        MainFragment_5 mainFragment_5 = new MainFragment_5();
        Bundle bundle = new Bundle();
        bundle.putString("muba", editText.getText().toString());
        mainFragment_5.setArguments(bundle);
        getParentFragmentManager().beginTransaction().replace(R.id.fragment_container, mainFragment_5).commit();


    }


}