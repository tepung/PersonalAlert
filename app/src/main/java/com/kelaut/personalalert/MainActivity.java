package com.kelaut.personalalert;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.onesignal.OneSignal;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //oneSignal Init
        OneSignal.initWithContext(this);
        OneSignal.setAppId("df2922ba-669e-4495-a2e6-ebde08267b27");
    }
}