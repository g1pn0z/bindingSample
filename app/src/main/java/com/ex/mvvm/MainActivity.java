package com.ex.mvvm;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import com.ex.mvvm.databinding.ActivityMainBinding;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Coin coinThis = new Coin(1, "Bitcoin", "35,000 USD");

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        binding.setCoin(coinThis);


    }
}