package kr.hs.emirim.w2038.ex6_10;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.MultiAutoCompleteTextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] items = {"Cat", "Carol", "California", "Angel", "Android", "Anxious", "Sound", "Soul", "Social"};

        AutoCompleteTextView autoText = findViewById(R.id.auto_text);
        MultiAutoCompleteTextView multiText = findViewById(R.id.multi_text);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line, items);
        autoText.setAdapter(adapter);

        MultiAutoCompleteTextView.CommaTokenizer token = new MultiAutoCompleteTextView.CommaTokenizer();
        multiText.setTokenizer(token);
        multiText.setAdapter(adapter);
    }
}