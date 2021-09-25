package com.example.ordercoffeeonline;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
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
    boolean whipp = false, choc = false;

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
        CheckBox whippedCream = (CheckBox) findViewById(R.id.whippedcream);
        CheckBox chocolate = (CheckBox) findViewById(R.id.Chocolate);
        if(whippedCream.isChecked()) whipp = true;
        else whipp = false;
        if(chocolate.isChecked()) choc = true;
        else choc = false;
        int quant = coff1+coff2+coff3+coff4;
        total = (coff1*10) + (coff2*15) + (coff3*10) + (coff4*20);
        int a = 0, b = 0;
        if(whipp == true) a = 2;
        if(choc == true) b = 5;
        quant = (quant*a) + (quant*b);
        total += quant;

//        TextView textView = (TextView) findViewById(R.id.coffee1amount);
//        textView.setText("Total Amount is : "+total);
        EditText name = (EditText) findViewById(R.id.name);
        String Name = name.getText().toString();

        EditText address = (EditText) findViewById(R.id.address);
        String Address = address.getText().toString();

        EditText phone = (EditText) findViewById(R.id.Number);
        String Phone = phone.getText().toString();

        String message = "Name : "+Name+"\nAddress : "+Address+"\nPhone : "+Phone+"\n";
        if(coff1 > 0) {
            message = message + "Black Coffee : "+coff1+"\n";
        }
        if(coff2 > 0){
            message = message + "Latte : "+coff2+"\n";
        }
        if(coff3 > 0){
            message = message + "Cappuccino : "+coff3+"\n";
        }
        if(coff4 > 0){
            message = message + "Macchiato : "+coff4+"\n";
        }

        message = message + "Total : "+total+"\nThanks for the order sir!";

        Intent email = new Intent(Intent.ACTION_SENDTO);
        email.setData(Uri.parse("mailto:"));
        email.putExtra(Intent.EXTRA_EMAIL, new String[]{"ordercoffee@gmail.com"});
        email.putExtra(Intent.EXTRA_SUBJECT, "Order for coffee");
        email.putExtra(Intent.EXTRA_TEXT, message);

        if(email.resolveActivity(getPackageManager()) != null){
            startActivity(Intent.createChooser(email, "Choose an Email client : "));
        }
    }
}