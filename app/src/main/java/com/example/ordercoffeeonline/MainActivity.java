package com.example.ordercoffeeonline;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    int total = 0;
    int coff1 = 0, coff2 = 0, coff3 = 0, coff4 = 0;

    public void coffee1plus(View view){
        if(coff1 < 100) coff1++;
        TextView text = (TextView) findViewById(R.id.coffee1amount);
        text.setText(""+coff1);
    }
    public void coffee1Minus(View view){
        if(coff1 > 0) coff1--;
        TextView text = (TextView) findViewById(R.id.coffee1amount);
        text.setText(""+coff1);
    }
    public void coffee2plus(View view){
        if(coff2 < 100) coff2++;
        TextView text = (TextView) findViewById(R.id.coffee2amount);
        text.setText(""+coff2);
    }
    public void coffee2Minus(View view){
        if(coff2 > 0) coff2--;
        TextView textView = (TextView) findViewById(R.id.coffee2amount);
        textView.setText(""+coff2);
    }
    public void coffee3plus(View view){
        if(coff3 < 100) coff3++;
        TextView text = (TextView) findViewById(R.id.coffee3amount);
        text.setText(""+coff3);
    }
    public void coffee3Minus(View view){
        if(coff3 > 0) coff3--;
        TextView textView = (TextView) findViewById(R.id.coffee3amount);
        textView.setText(""+coff3);
    }
    public void coffee4plus(View view){
        if(coff4 < 100) coff4++;
        TextView text = (TextView) findViewById(R.id.coffee4amount);
        text.setText(""+coff4);
    }
    public void coffee4Minus(View view){
        if(coff4 > 0) coff4--;
        TextView textView = (TextView) findViewById(R.id.coffee4amount);
        textView.setText(""+coff4);
    }

    public void reset(View view){
        coff1 = 0;
        coff2 = 0;
        coff3 = 0;
        coff4 = 0;
        TextView text1 = (TextView) findViewById(R.id.coffee1amount);
        TextView text2 = (TextView) findViewById(R.id.coffee2amount);
        TextView text3 = (TextView) findViewById(R.id.coffee3amount);
        TextView text4 = (TextView) findViewById(R.id.coffee4amount);
        text1.setText(""+coff1);
        text2.setText(""+coff2);
        text3.setText(""+coff3);
        text4.setText(""+coff4);
    }

    public void order(View view){

    }
}