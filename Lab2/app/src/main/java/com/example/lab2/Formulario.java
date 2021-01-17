package com.example.lab2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

public class Formulario extends AppCompatActivity implements View.OnClickListener{

    private Button btn;
    private EditText txtname,txtapel,txtage,txtgen,txtdirecc, txtcorre;
    private CheckBox cx1,cx2,cx3,cx4,cx5,cx6,cx7,cx8,cx9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario);
        txtname =(EditText) findViewById(R.id.Name);
        txtapel =(EditText) findViewById(R.id.Apellido);
        txtage =(EditText) findViewById(R.id.Edad);
        txtgen = (EditText)findViewById(R.id.Gender);
        txtdirecc = (EditText)findViewById(R.id.Drecc);
        txtcorre = (EditText) findViewById(R.id.Correo);
        cx1 = (CheckBox) findViewById(R.id.St1);
        cx2 = (CheckBox) findViewById(R.id.St2);
        cx3 = (CheckBox) findViewById(R.id.St3);
        cx4 = (CheckBox) findViewById(R.id.St4);
        cx5 = (CheckBox) findViewById(R.id.St5);
        cx6 = (CheckBox) findViewById(R.id.St6);
        cx7 = (CheckBox) findViewById(R.id.St7);
        cx8 = (CheckBox) findViewById(R.id.St8);
        cx9 = (CheckBox) findViewById(R.id.St9);
        btn = (Button) findViewById(R.id.button2);

        btn.setOnClickListener(this);


    }


    @Override
    public void onClick(View v) {
        String enviar = txtcorre.getText().toString();
        String asunto = "Datos Sintomas";
        String nam = txtname.getText().toString();
        String ape = txtapel.getText().toString();
        String gen = txtgen.getText().toString();
        String dire = txtdirecc.getText().toString();
        String s1 = cx1.getText().toString();
        String s2 = cx2.getText().toString();
        String s3 = cx3.getText().toString();
        String s4 = cx4.getText().toString();
        String s5 = cx5.getText().toString();
        String s6 = cx6.getText().toString();
        String s7 = cx7.getText().toString();
        String s8 = cx8.getText().toString();
        String s9 = cx9.getText().toString();
        String union = nam +"\n" + ape + "\n" + gen+ "\n" + dire + "\n" + "\n" ;
        if (cx1.isChecked() || cx2.isChecked() || cx3.isChecked() || cx4.isChecked() || cx5.isChecked() || cx6.isChecked() || cx7.isChecked() || cx8.isChecked() || cx9.isChecked()){
            union += "\n" + "Síntomas";
        }
        else {
            union += "\n" + "No posee sintomas de COVID - 19";
        }


        if (cx1.isChecked()){
            union+= "\n" + "Fiebre";
        }
        if (cx2.isChecked()){
            union+= "\n" + "Dolor de cabeza";
        }
        if (cx3.isChecked()){
            union+= "\n" + "Fatiga";
        }
        if (cx4.isChecked()){
            union+= "\n" + "Perdida del gusto";
        }
        if (cx5.isChecked()){
            union+= "\n" + "Perdida del olfato";
        }
        if (cx6.isChecked()){
            union+= "\n" + "Tos";
        }
        if (cx7.isChecked()){
            union+= "\n" + "Náuseas";
        }
        if (cx8.isChecked()){
            union+= "\n" + "Vómito";
        }
        if (cx9.isChecked()){
            union+= "\n" + "Diarrea";
        }



        Intent intent = new Intent(Intent.ACTION_SEND);

        intent.putExtra(Intent.EXTRA_EMAIL, new String[] { enviar });
        intent.putExtra(Intent.EXTRA_SUBJECT, asunto);
        intent.putExtra(Intent.EXTRA_TEXT,union);
        intent.setType("message/rfc822");
        startActivity(intent);

    }
}