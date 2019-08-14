package com.apk.passingdata;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class main2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        TextView t = findViewById(R.id.txt_viewdata);
        Bundle bundle = getIntent().getExtras();
        String s = bundle.getString("name");
        t.setText(s);
    }
}
