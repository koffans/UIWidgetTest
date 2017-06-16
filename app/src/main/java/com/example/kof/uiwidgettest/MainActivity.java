package com.example.kof.uiwidgettest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button buttonChange = (Button) findViewById(R.id.ButtonChange);
        buttonChange.setOnClickListener(this);

//        Button buttonChange = (Button) findViewById(R.id.ButtonChange);
//        buttonChange.setOnClickListener(new View.OnClickListener()
//                                        {
//                                            @Override
//                                            public void onClick(View v) {
//                                                TextView txt_Content = (TextView) findViewById(R.id.txt_Content);
//                                                txt_Content.setText("kof");
//                                            }
//                                        }
//        );
    }

    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.ButtonChange:
                TextView txt_Content = (TextView) findViewById(R.id.txt_Content);
                txt_Content.setText("chen");
//                Toast.makeText(MainActivity.this,"Click!",Toast.LENGTH_SHORT).show();
                break;
            default:
                break;
        }
    }
}
