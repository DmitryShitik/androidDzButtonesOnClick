package com.dima.androiddzbuttonesonclick;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.Snackbar;

class MyClickListener implements View.OnClickListener {

    @Override
    public void onClick(View view) {
        Toast.makeText(view.getContext(), R.string.showTextAfterClickButton2, Toast.LENGTH_SHORT).show();
    }
}

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn2 = findViewById(R.id.button2);
        btn2.setOnClickListener(new MyClickListener());
        Button btn3 = findViewById(R.id.button3);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(view.getContext(), R.string.showTextAfterClickButton3, Toast.LENGTH_SHORT).show();

            }
        });
        Button btn4 = findViewById(R.id.button4);
        btn4.setOnClickListener(view->{
            Toast.makeText(this, R.string.showTextAfterClickButton4, Toast.LENGTH_SHORT).show();
        });
    }

    public void onClickButton1(View view) {
        Toast.makeText(this, R.string.showTextAfterClickButton1, Toast.LENGTH_SHORT).show();
    }

}