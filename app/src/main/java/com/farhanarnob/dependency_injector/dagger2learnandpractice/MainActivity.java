package com.farhanarnob.dependency_injector.dagger2learnandpractice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView tvDate;
    IMyExample iMyExample;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvDate = findViewById(R.id.tvDate);
        iMyExample = MyExampleImpl.getInstance();
        tvDate.setText(String.valueOf(iMyExample.getDate()));
    }
}
