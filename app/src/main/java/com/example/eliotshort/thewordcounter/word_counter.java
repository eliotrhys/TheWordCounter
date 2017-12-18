package com.example.eliotshort.thewordcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class word_counter extends AppCompatActivity {

    WordCounter theWordCounter;
    EditText phraseBox;
    Button calculateButton;
    TextView revealBox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d(getClass().toString(), "onCreate called");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_word_counter);


        phraseBox = findViewById(R.id.phrase_box);
        calculateButton = findViewById(R.id.calculate_button);
        revealBox = findViewById(R.id.reveal_box);
        theWordCounter = new WordCounter();
    }

    public void onCalculateButtonClicked(View button){
            Log.d(getClass().toString(), "onCalculateButtonClicked was called");
            String entry = phraseBox.getText().toString();
            Log.d(getClass().toString(), "The entry recieved was: '" + entry + "'");
            revealBox.setText(theWordCounter.countWordsUsingSplit(entry));
    }
}
