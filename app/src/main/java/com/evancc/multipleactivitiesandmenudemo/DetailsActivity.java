package com.evancc.multipleactivitiesandmenudemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class DetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        TextView textView = (TextView) findViewById(R.id.textView);

        Intent intent = getIntent();
        String name = intent.getExtras().getString("name");
        textView.setText(name);
    }

    public void onButtonClick(View view) {
        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(intent);
    }
}
