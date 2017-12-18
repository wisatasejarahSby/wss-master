package com.sinau.wss;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import com.sinau.wss.HalamanAwal.MainActivity;

/**
 * Created by addin on 14/12/17.
 */

public class SplashActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        startActivity(new Intent(SplashActivity.this, MainActivity.class));
        finish();
    }
}
