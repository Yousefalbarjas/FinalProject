package com.example.hw1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
private int mcounter=0;
Button btn;
Button clr;
TextView txv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    btn = (Button) findViewById(R.id.button);
        clr = (Button) findViewById(R.id.clear);
    txv = (TextView) findViewById(R.id.textView2);

    btn.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            mcounter ++;
        txv.setText(Integer.toString(mcounter));



        }
          });

    clr.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            txv.setText("0");
            mcounter=0;
        }
    });

    }




    }
