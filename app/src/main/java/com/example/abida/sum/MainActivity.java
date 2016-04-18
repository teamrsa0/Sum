package com.example.abida.sum;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Button b1 = (Button) findViewById(R.id.bt_sum);
        b1.setOnClickListener(new View.OnClickListener() {
              public void onClick(View v) {
                  EditText e1 = (EditText) findViewById(R.id.et1);
                  EditText e2 = (EditText) findViewById(R.id.et2);
                  TextView t1 = (TextView) findViewById(R.id.tv1);
                  double num1= Double.parseDouble(e1.getText().toString());
                  double num2= Double.parseDouble(e2.getText().toString());
                  double result= num1+num2;
                  t1.setText(Double.toString(result));

              }
          }
        );


        Button b2 = (Button) findViewById(R.id.bt_sub);
        b2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v)
            {
                EditText e1 = (EditText)findViewById(R.id.et1);
                EditText e2 = (EditText)findViewById(R.id.et2);
                TextView t1 = (TextView)findViewById(R.id.tv1);
                double num1= Double.parseDouble(e1.getText().toString());
                double num2= Double.parseDouble(e2.getText().toString());
                double result= num1-num2;
                t1.setText(Double.toString(result));
            }
        });


        Button b3 = (Button) findViewById(R.id.bt_mult);
        b3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v)
            {
                EditText e1 = (EditText)findViewById(R.id.et1);
                EditText e2 = (EditText)findViewById(R.id.et2);
                TextView t1 = (TextView)findViewById(R.id.tv1);
                double num1= Double.parseDouble(e1.getText().toString());
                double num2= Double.parseDouble(e2.getText().toString());
                double result= num1*num2;
                t1.setText(Double.toString(result));
            }
        });


        Button b4 = (Button) findViewById(R.id.bt_div);
        b4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v)
            {
                EditText e1 = (EditText)findViewById(R.id.et1);
                EditText e2 = (EditText)findViewById(R.id.et2);
                TextView t1 = (TextView)findViewById(R.id.tv1);
                double num1= Double.parseDouble(e1.getText().toString());
                double num2= Double.parseDouble(e2.getText().toString());
                double result= num1/num2;
                t1.setText(Double.toString(result));
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
