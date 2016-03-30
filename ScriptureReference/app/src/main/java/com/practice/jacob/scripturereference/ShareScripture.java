package com.practice.jacob.scripturereference;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ShareScripture extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_share_scripture);
        display();
    }

    public void display (){
        Intent intent = getIntent();
        String book = intent.getStringExtra("BOOK");
        String chapter = intent.getStringExtra("CHAPTER");
        String verse = intent.getStringExtra("VERSE");
        TextView displayText = (TextView)(findViewById(R.id.referenceDisplay));
        displayText.setText("Your favorite scripture is: " + book + " " + chapter + ":" + verse);
    }
}
