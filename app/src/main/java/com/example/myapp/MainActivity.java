package com.example.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public String temp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void editTemp(View view) {
        String test="toto";
        String temp = getString(R.string.input_number_enter);
        System.out.println(temp);
        final RadioButton radioButtonDegre = (RadioButton) this.findViewById(R.id.radioButton2);
        final RadioButton radioButtonF = (RadioButton) this.findViewById(R.id.radioButton3);
        final EditText Textinput = (EditText) findViewById(R.id.editTextNumber);
        Editable n = Textinput.getText();
        String ninput= n.toString();
        Double fn=0.0;
        if(radioButtonDegre.isChecked()==true)
        {
            Double nb=Double.parseDouble(ninput);

            fn =  nb*9/5 + 32;
        }

        if(radioButtonF.isChecked()==true)
        {
            Double nb=Double.parseDouble(ninput);
            fn =  (( nb - 32)*5/9);

        }
        final TextView helloTextView = (TextView) findViewById(R.id.textView4);
        // Double = Double.parseDouble(helloTextView);
        String nbfn = String.valueOf(fn);
        helloTextView.setText(nbfn);

    }
}