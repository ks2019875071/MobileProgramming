package com.cookandroid.helloandroid;

import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button btnHomepage, btnCall, btnGallery, btnFinish;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        setTitle("FourButton");

        btnHomepage = (Button) findViewById(R.id.btnHomepage);
        btnCall = (Button) findViewById(R.id.btnCall);
        btnGallery = (Button) findViewById(R.id.btnGallery);
        btnFinish = (Button) findViewById(R.id.btnFinish);

        btnHomepage.setBackgroundColor(Color.GRAY);
        btnCall.setBackgroundColor(Color.GREEN);
        btnGallery.setBackgroundColor(Color.RED);
        btnFinish.setBackgroundColor(Color.YELLOW);

        btnCall.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent mIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("tel:/911"));
                startActivity(mIntent);
            }
        });
        btnHomepage.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent mIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://m.nate.com"));
                startActivity(mIntent);
            }
        });
        btnGallery.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent mIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("content://media/internal/images/media"));
                startActivity(mIntent);
            }
        });
        btnFinish.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                finish();
            }
        });
    }
}