package com.example.autofillinputtexttemp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private String[] tags = {"Sport", "Cooking", "Bikes", "Books", "Music", "Films", "Animals", "Games", "Math"};
    private AutoCompleteTextView autoCompleteTextView;
    private Button sendBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setReferences();

//        ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(this, android.R.layout.select_dialog_item, tags);
        ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(this, R.layout.autofill_text_item, tags);

        autoCompleteTextView.setThreshold(1);
        autoCompleteTextView.setAdapter(adapter1);

        sendBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getBaseContext(), autoCompleteTextView.getText().toString(), Toast.LENGTH_SHORT).show();
            }
        });

    }

    private void setReferences() {
        autoCompleteTextView = findViewById(R.id.auto_complete_text_view);
        sendBtn = findViewById(R.id.send_btn);
    }
}