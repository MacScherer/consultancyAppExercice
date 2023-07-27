package com.example.consultancyappexercice.ui.service;

import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.consultancyappexercice.R;
import com.example.consultancyappexercice.databinding.FragmentHomeBinding;
import com.example.consultancyappexercice.databinding.FragmentServiceBinding;

public class ServiceFragment extends Fragment {

    private FragmentServiceBinding binding;


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        ServiceViewModel serviceViewModel =
                new ViewModelProvider(this).get(ServiceViewModel.class);

        binding = FragmentServiceBinding.inflate(inflater,container,false);
        View root = binding.getRoot();


        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}