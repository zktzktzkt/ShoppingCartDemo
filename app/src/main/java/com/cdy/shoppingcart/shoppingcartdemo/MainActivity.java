package com.cdy.shoppingcart.shoppingcartdemo;

import android.hardware.ConsumerIrManager;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ConsumerIrManager IR=(ConsumerIrManager)getSystemService(CONSUMER_IR_SERVICE);

    }
}
