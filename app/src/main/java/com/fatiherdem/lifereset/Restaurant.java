package com.fatiherdem.lifereset;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.fatiherdem.lifereset.databinding.ActivityRestaurantBinding;
import com.fatiherdem.lifereset.databinding.ActivityWelcomeBinding;

public class Restaurant extends AppCompatActivity {
    private ActivityRestaurantBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityRestaurantBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);
    }

}