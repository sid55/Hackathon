package com.hexd.hexd;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class technician extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_technician);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });


        Button btn8 = (Button)findViewById(R.id.button8);
        Button btn9 = (Button)findViewById(R.id.button9);
        Button btn10 = (Button)findViewById(R.id.button10);
        Button btn11 = (Button)findViewById(R.id.button11);
        Button btn12 = (Button)findViewById(R.id.button12);
        Button btn13 = (Button)findViewById(R.id.button13);

        View.OnClickListener onClick = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Button btn = (Button) v;

                switch (btn.getId()){
                    case R.id.button8:
                        Intent app = new Intent(technician.this,StatisticsMap.class);
                        startActivity(app);
                        break;

                    case R.id.button9:
                        Intent app1 = new Intent(technician.this,StatisticsMap.class);
                        startActivity(app1);
                        break;

                    case R.id.button10:
                        Intent app2 = new Intent(technician.this,StatisticsMap.class);
                        startActivity(app2);
                        break;

                    case R.id.button11:
                        Intent app3 = new Intent(technician.this,StatisticsMap.class);
                        startActivity(app3);
                        break;

                    case R.id.button12:
                        Intent app4 = new Intent(technician.this,StatisticsMap.class);
                        startActivity(app4);
                        break;

                    case R.id.button13:
                        Intent app5 = new Intent(technician.this,otherpage.class);
                        startActivity(app5);
                        break;


                }
            }
        };

        btn8.setOnClickListener(onClick);
        btn9.setOnClickListener(onClick);
        btn10.setOnClickListener(onClick);
        btn11.setOnClickListener(onClick);
        btn12.setOnClickListener(onClick);
        btn13.setOnClickListener(onClick);
    }

}
