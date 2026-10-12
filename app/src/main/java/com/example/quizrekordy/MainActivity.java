package com.example.quizrekordy;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {
    TextView textViewDziedzina, textViewRekordzista, textViewRok, textViewWynik, textViewPorownanyWynik;
    RadioGroup radioGroup;
    RadioButton radioButton1, radioButton2, radioButton3;
    EditText editTextText;
    Button buttonPorownaj;
    List<Rekord> rekordyZInternetu;

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


        editTextText = findViewById(R.id.editTextText);
        buttonPorownaj = findViewById(R.id.buttonPorownaj);


        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://raw.githubusercontent.com/bartangutan/6_quiz_rekordy_JSON/main/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        JsonPlaceHolder jsonPlaceHolder = retrofit.create(JsonPlaceHolder.class);
        Call<List<Rekord>> call = jsonPlaceHolder.getRekord();

        call.enqueue(
                new Callback<List<Rekord>>() {
                    @Override
                    public void onResponse(Call<List<Rekord>> call, Response<List<Rekord>> response) {
                        if(!response.isSuccessful()){
                            Toast.makeText(MainActivity.this, response.code(), Toast.LENGTH_SHORT).show();
                            return;
                        }
                        rekordyZInternetu = response.body();
                        wypiszRekord(0);
                    }

                    @Override
                    public void onFailure(Call<List<Rekord>> call, Throwable t) {

                    }
                }
        );
    }

    private void wypiszRekord(int numerRekordu){
        textViewDziedzina.setText(rekordyZInternetu.get(numerRekordu).getDziedzina());
        textViewRekordzista.setText(rekordyZInternetu.get(numerRekordu).getRekordzista());
        textViewRok.setText(rekordyZInternetu.get(numerRekordu).getRok());
        textViewWynik.setText(rekordyZInternetu.get(numerRekordu).getRekordowy_wynik());
    }

}