package com.example.finalintegration;

import androidx.appcompat.app.AppCompatActivity;
import com.clevertap.android.sdk.CleverTapAPI;

import android.os.Bundle;
import com.clevertap.android.sdk.CleverTapAPI;

import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CleverTapAPI clevertapDefaultInstance = CleverTapAPI.getDefaultInstance(getApplicationContext());
        HashMap<String, Object> profileUpdate = new HashMap<String, Object>();


//Update pre-defined profile properties
        profileUpdate.put("Name", "Rashmi Yadav");
        profileUpdate.put("Email", "rashmi@gmail.com");
//Update custom profile properties
        profileUpdate.put("Plan Type", "Platinum");
        profileUpdate.put("Favorite Food", "Pizza");

        clevertapDefaultInstance.pushProfile(profileUpdate);
    }
}