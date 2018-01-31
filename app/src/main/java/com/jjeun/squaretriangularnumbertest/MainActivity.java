package com.jjeun.squaretriangularnumbertest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void checkNumber(View view){

        CheckNumberType check = new CheckNumberType();

        EditText number = (EditText) findViewById(R.id.checkNumberEditText);
        int checkNumber = Integer.parseInt(number.getText().toString());

        if(check.checkSquare(checkNumber) && check.checkTriangular(checkNumber)){
            makeToast("The number is both SQUARE and TRIANGULAR!");

        } else if(check.checkSquare(checkNumber)){
            makeToast("The number is SQUARE!");

        } else if(check.checkTriangular(checkNumber)){
            makeToast("The number is TRIANGULAR!");

        } else {
            makeToast("The number is NEITHER!");
        }
    }

    public void makeToast(String string){
        Toast.makeText(MainActivity.this, string, Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
