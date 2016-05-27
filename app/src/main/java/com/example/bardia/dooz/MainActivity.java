package com.example.bardia.dooz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    TextView turnTextView;
    Button btn11,btn12,btn13,btn21,btn22,btn23,btn31,btn32,btn33;
    boolean turn = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        turnTextView = (TextView) findViewById(R.id.turnTextView);
        btn11 = (Button) findViewById(R.id.btn11);
        btn12 = (Button) findViewById(R.id.btn12);
        btn13 = (Button) findViewById(R.id.btn13);
        btn21 = (Button) findViewById(R.id.btn21);
        btn22 = (Button) findViewById(R.id.btn22);
        btn23 = (Button) findViewById(R.id.btn23);
        btn31 = (Button) findViewById(R.id.btn31);
        btn32 = (Button) findViewById(R.id.btn32);
        btn33 = (Button) findViewById(R.id.btn33);
        if(!turn)
            turnTextView.setText("X");
        else
            turnTextView.setText("O");

        btn11.setOnClickListener(this);
        btn12.setOnClickListener(this);
        btn13.setOnClickListener(this);
        btn21.setOnClickListener(this);
        btn22.setOnClickListener(this);
        btn23.setOnClickListener(this);
        btn31.setOnClickListener(this);
        btn32.setOnClickListener(this);
        btn33.setOnClickListener(this);
        
        System.out.println(btn11);
    }

    @Override
    public void onClick(View v) {
        if (!((Button)v).getText().toString().equals("")) {
            Toast.makeText(MainActivity.this, "invalid", Toast.LENGTH_SHORT).show();
            return;
        }
        if (turn)
            ((Button)v).setText("O");
        else
            ((Button)v).setText("X");
        turn =! turn;
        if(!turn)
            turnTextView.setText("X");
        else
            turnTextView.setText("O");
    }
}
