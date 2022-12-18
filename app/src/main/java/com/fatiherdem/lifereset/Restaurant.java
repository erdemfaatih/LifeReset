package com.fatiherdem.lifereset;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.fatiherdem.lifereset.databinding.ActivityRestaurantBinding;
import com.fatiherdem.lifereset.databinding.ActivityWelcomeBinding;

public class Restaurant extends AppCompatActivity {
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurant);
        button = findViewById(R.id.goRestaurant);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Restaurant.this,RestaurantSpecialss.class);
                startActivity(intent);
            }
        });


    }


}