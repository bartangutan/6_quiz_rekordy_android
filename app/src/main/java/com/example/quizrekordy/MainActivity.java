package com.example.quizrekordy;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    TextView textViewDziedzina, textViewRekordzista, textViewRok, textViewWynik, textViewPorownanyWynik;
    RadioGroup radioGroup;
    RadioButton radioButton1, radioButton2, radioButton3;
    EditText editTextText;
    Button buttonPorownaj;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        textViewDziedzina = findViewById(R.id.textViewDziedzina);
        textViewRekordzista = findViewById(R.id.textViewRekordzista);
        textViewRok = findViewById(R.id.textViewRok);
        textViewWynik = findViewById(R.id.textViewWynik);
        textViewPorownanyWynik = findViewById(R.id.textViewPorownanyWynik);

        radioGroup = findViewById(R.id.radioGroup1);
        radioButton1 = findViewById(R.id.radioButton1);
        radioButton2 = findViewById(R.id.radioButton2);
        radioButton3 = findViewById(R.id.radioButton3);

        editTextText = findViewById(R.id.editTextText);
        buttonPorownaj = findViewById(R.id.buttonPorownaj);
    }


}