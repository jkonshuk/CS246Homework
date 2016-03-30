package com.practice.jacob.scripturereference;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class GetScripture extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_get_scripture);
    }

    public void sendInfo(View v){
        Intent intent = new Intent(this, ShareScripture.class);
        EditText bookText = (EditText)findViewById(R.id.BookText);
        EditText chapterText = (EditText)findViewById(R.id.ChapterText);
        EditText verseText = (EditText)findViewById(R.id.VerseText);
        String book = bookText.getText().toString();
        String chapter = chapterText.getText().toString();
        String verse = verseText.getText().toString();
        intent.putExtra("BOOK", book);
        intent.putExtra("CHAPTER", chapter);
        intent.putExtra("VERSE", verse);
        startActivity(intent);
    }
}
