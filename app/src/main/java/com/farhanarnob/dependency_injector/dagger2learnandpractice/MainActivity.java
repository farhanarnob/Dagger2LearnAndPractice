package com.farhanarnob.dependency_injector.dagger2learnandpractice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.Date;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {
    private TextView tvDate;
    @Inject IMyExample mMyExample;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvDate = findViewById(R.id.tvDate);

        ((MyApplication) getApplication())
                .getMyComponent()
                .inject(MainActivity.this);
        tvDate.setText((new Date(mMyExample.getDate())).toString());
    }
}
