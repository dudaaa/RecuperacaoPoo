package com.example.recuperacaopoo;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onRadioButtonClicked (View view) {
        RadioButton radioButton = (RadioButton) view;
            int id = radioButton.getId();
            switch (id) {
                case R.id.buttonOpcao1:
                    AlertDialog.Builder builder = new AlertDialog.Builder(this);
                    builder.setTitle("Parabéns!");
                    builder.setMessage("Resposta correta!");
                    DialogInterface.OnClickListener btnOk = new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            Intent intent = new Intent(getApplicationContext(), SegundaPergunta.class);
                            startActivity(intent);
                        }
                    };
                        break;
                case R.id.buttonOpcao2:
                    Toast.makeText(this, "Resposta incorreta!", Toast.LENGTH_LONG).show();
                    break;
                case R.id.buttonOpcao3:
                    Toast.makeText(this, "Resposta incorreta!", Toast.LENGTH_LONG).show();
                    break;
                case R.id.buttonOpcao4:
                    Toast.makeText(this, "Resposta incorreta!", Toast.LENGTH_LONG).show();
                    break;
                case R.id.buttonOpcao5:
                    Toast.makeText(this, "Resposta incorreta!", Toast.LENGTH_LONG).show();
                    break;
            }



        }



        }


