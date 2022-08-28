package com.example.suggestionedittext;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    AutoCompleteTextView act;
    EditText et;
    String[] products = new String[]{"Shosha","Mishti kumra Big","Mishti kumra small","chichinga","Jhinga","kacha kola","Dherosh","Lal Shak","kakrol","kacha morich","Piyaj local"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        act = findViewById(R.id.autoet);
        act.setAdapter(new ArrayAdapter<>(MainActivity.this, android.R.layout.simple_list_item_1,products));
        Button btn = findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println(act.getText().toString());
            }
        });
    }
}