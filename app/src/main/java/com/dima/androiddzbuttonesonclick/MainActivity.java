package com.dima.androiddzbuttonesonclick;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickButton1(View view) {
        Toast.makeText(this,R.string.showTextAfterClickButton1,Toast.LENGTH_SHORT).show();
    }

    public void onClickButton2(View view) {
        Snackbar.make(view,R.string.showTextAfterClickButton2, Snackbar.LENGTH_SHORT).show();
    }
}