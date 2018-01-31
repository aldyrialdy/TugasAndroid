package com.example.x555bp.myapplication;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btnPersib,btnPersija;
    TextView skorpersib,skorpersija,hasilakhir;
    Integer skorepersija=0, skorepersib=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnPersib = (Button) findViewById(R.id.btnpersib);
        btnPersija = (Button) findViewById(R.id.btnpersija);

        btnPersib.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), Persib.class);
                startActivity(i);
            }
        });
        btnPersija.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), Persija.class);
                startActivity(i);
            }
        });


    }
    public void tambahpersib(View v) {
        skorepersib=skorepersib+1;
        setScore();
    }
    public void minuspersib(View v) {
        if(skorepersib>0)
        {skorepersib=skorepersib-1;
        setScore();}
    }
    public void tambahpersija(View v) {
        skorepersija=skorepersija+1;
        setScore();
    }
    public void minuspersija(View v) {
        if(skorepersija>0)
        {skorepersija=skorepersija-1;
            setScore();}
    }
    public void setScore() {
        skorpersija= (TextView) findViewById(R.id.tv_scorepersija);
        skorpersib= (TextView) findViewById(R.id.tv_scorepersib);
        skorpersija.setText(""+skorepersija);
        skorpersib.setText(""+skorepersib);
    }
    public void Berita(View v) {
        Intent brows=new Intent(Intent.ACTION_VIEW);
        String url="http://bola.kompas.com/read/2017/11/03/19145658/mengapa-wasit-putuskan-laga-persija-vs-persib-usai-pada-menit-ke-83";
                brows.setData(Uri.parse(url));
        startActivity(brows);
    }
    public void Reset(View v) {

    }

    public void Map(View v) {
        Uri mapintenturi=Uri.parse("google.streetview:cbll=-6.957276, 107.712062");
        Intent mapIntent=new Intent(Intent.ACTION_VIEW);
        mapIntent.setPackage("com.google.android.apps.maps");
        if(mapIntent.resolveActivity(getPackageManager())!= null)
        {
            startActivity(mapIntent);

        }

    }



}
