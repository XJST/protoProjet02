package com.example.toto.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
//import io.apisense.sdk.APISENSE;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // Create the SDK instance
        //APISENSE apisense = new APISENSE(application); // Standard config
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


}
