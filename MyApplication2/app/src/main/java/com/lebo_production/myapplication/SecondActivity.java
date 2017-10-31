package com.lebo_production.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        final TextView textview2 = (TextView) findViewById(R.id.textView2);
        final Intent intent = getIntent();

        String edit = intent.getStringExtra("edit");
        textview2.setText(edit);

        final Button button_back = (Button) findViewById(R.id.back);
        final Button button_map = (Button) findViewById(R.id.map);
        final Button button_image = (Button) findViewById(R.id.image);
        final Button button_login = (Button) findViewById(R.id.login);

        button_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent_back = new Intent(SecondActivity.this, MainActivity.class);
                startActivity(intent_back);
            }
        });
        button_image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent_img = new Intent(SecondActivity.this, ImageActivity.class);
                startActivity(intent_img);
            }
        });
    }
}
