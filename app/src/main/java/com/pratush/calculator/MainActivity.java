package com.pratush.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    private EditText editTextNumber;
    private EditText editTextNumber2;
    private Button button;
    private Button button2;
    private Button button3;
    private Button button4;
    private TextView textView2;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.button);
        Button button2 =findViewById(R.id.button2);
        Button button3 = findViewById(R.id.button3);
        Button button4 = findViewById(R.id.button4);
        EditText editTextNumber = findViewById(R.id.editTextNumber);
        EditText editTextNumber2= findViewById(R.id.editTextNumber2);
        TextView textView = findViewById(R.id.textView);
        TextView textView2 = findViewById(R.id.textView2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s =  editTextNumber.getText().toString();
                String a = editTextNumber2.getText().toString();
                int b= Integer.parseInt(s);
                int c = Integer.parseInt(a);
                int d = b+c;
                textView2.setText(String.valueOf(d));

            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s =  editTextNumber.getText().toString();
                String a = editTextNumber2.getText().toString();
                int b= Integer.parseInt(s);
                int c = Integer.parseInt(a);
                int d = b-c;
                textView2.setText(String.valueOf(d));
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s =  editTextNumber.getText().toString();
                String a = editTextNumber2.getText().toString();
                int b= Integer.parseInt(s);
                int c = Integer.parseInt(a);
                int d = b*c;
                textView2.setText(String.valueOf(d));

            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = editTextNumber.getText().toString();
                String a = editTextNumber2.getText().toString();
                int b = Integer.parseInt(s);
                int c = Integer.parseInt(a);
                int d = b / c;
                if (c == 0) {
                    textView2.setText("Error");
                } else {
                    textView2.setText(String.valueOf(d));

                }
            }
        });
    }
}