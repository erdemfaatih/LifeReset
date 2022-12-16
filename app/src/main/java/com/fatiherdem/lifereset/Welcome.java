package com.fatiherdem.lifereset;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

import com.fatiherdem.lifereset.databinding.ActivityMainBinding;
import com.fatiherdem.lifereset.databinding.ActivityWelcomeBinding;
import com.google.firebase.auth.FirebaseAuth;

public class Welcome extends AppCompatActivity {
    private ActivityWelcomeBinding binding;
    private FirebaseAuth auth;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityWelcomeBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);
        auth = FirebaseAuth.getInstance(); // authu aktive etmemiz gerekiyor.

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {  //menumuzu bağlamaya yarıyor
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.option_menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) { //menulerden bir tanesi seçilirse ne olacak
        if(item.getItemId() == R.id.settings){
            Intent intent = new Intent(Welcome.this,Settings.class);
            startActivity(intent);
        }else if (item.getItemId() == R.id.signout){

            auth.signOut(); // çıkışı yapan teknoloji

            Intent intent = new Intent(Welcome.this,MainActivity.class);
            startActivity(intent);
            finish();
        }
        return super.onOptionsItemSelected(item);
    }

    public void goRestaurant(View view){
        intent = new Intent(Welcome.this,Restaurant.class);
        startActivity(intent);
    }
}