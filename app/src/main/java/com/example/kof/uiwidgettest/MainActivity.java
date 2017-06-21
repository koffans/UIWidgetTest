package com.example.kof.uiwidgettest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        LinearLayout MainLayout = (LinearLayout) getLayoutInflater().inflate(R.layout.activity_main, null);
        setContentView(MainLayout);
        for (int i = 0; i < MainLayout.getChildCount(); i++) {
            View v = MainLayout.getChildAt(i);
            if (v instanceof Button)
            {
                Button button = (Button) v;
//                Toast.makeText(MainActivity.this,button.getText().toString(),Toast.LENGTH_SHORT).show();
                button.setOnClickListener(this);
            }
        }

//        Button buttonChange = (Button) findViewById(R.id.ButtonChange);
//        buttonChange.setOnClickListener(this);
//        Button buttonGetContent = (Button) findViewById(R.id.ButtonGetContent);
//        buttonGetContent.setOnClickListener(this);

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
            case R.id.ButtonGetContent:
                EditText txtContent = (EditText) findViewById(R.id.Edit_Name);
                Toast.makeText(MainActivity.this,txtContent.getText().toString(),Toast.LENGTH_SHORT).show();
            default:
                break;
        }
    }
}
