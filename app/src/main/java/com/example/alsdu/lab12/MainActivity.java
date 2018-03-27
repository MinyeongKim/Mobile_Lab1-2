package com.example.alsdu.lab12;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Button;
import android.widget.TextView;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    public EditText edit_name;

    public Button btn_print;
    public Button btn_clear;
    public TextView view_print;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
    }

    public void init(){
        edit_name = (EditText)findViewById(R.id.edit_name);
        btn_clear = (Button)findViewById(R.id.btn_clear);
        btn_print = (Button)findViewById(R.id.btn_print);
        view_print = (TextView)findViewById(R.id.view_print);

        //Print the name on the screen
        btn_print.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                String text = "";   //String to receive typed name

                text = edit_name.getText().toString(); //Receive typed name
                view_print.setText(text); //Print the name on the screen
            }
        });

        //Clear to the initial screen
        btn_clear.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                edit_name.setText(""); //Clear the name entry
                view_print.setText(""); //Clear the printing place
            }
        });

    }
}
