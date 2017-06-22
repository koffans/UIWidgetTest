package com.example.kof.uiwidgettest;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    boolean ImageIndex;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        InitialParameters();
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

    private void InitialParameters()
    {
        ImageIndex = true;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.ButtonChange:
//                TextView txt_Content = (TextView) findViewById(R.id.txt_Content);
//                txt_Content.setText("chen");
//                Toast.makeText(MainActivity.this,"Click!",Toast.LENGTH_SHORT).show();
//                ImageIndex = !ImageIndex;
//
//                ImageView ImageContainer = (ImageView) findViewById(R.id.ImageContainer);
//                if (ImageIndex)
//                    ImageContainer.setImageResource(R.mipmap.img_1);
//                else
//                    ImageContainer.setImageResource(R.mipmap.img_2);
//                ProgressBar ProgressBarCtl = (ProgressBar) findViewById(R.id.ProgressBar);
//                if (ProgressBarCtl.getVisibility() == View.GONE)
//                    ProgressBarCtl.setVisibility(View.VISIBLE);
//                else
//                    ProgressBarCtl.setVisibility(View.GONE);
//                ProgressBarCtl.setProgress(ProgressBarCtl.getProgress() + 10);
                AlertDialog.Builder AlertDelete = new AlertDialog.Builder(MainActivity.this);
                AlertDelete.setTitle("System Alert!");
                AlertDelete.setMessage("Are You Sure to Delete This Info?");
                AlertDelete.setCancelable(false);
                AlertDelete.setPositiveButton("Yes",new DialogInterface.OnClickListener(){
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(MainActivity.this,"Delete!",Toast.LENGTH_SHORT).show();
                    }
                });
                AlertDelete.setNegativeButton("No", new DialogInterface.OnClickListener(){
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(MainActivity.this,"Cancel Delete!",Toast.LENGTH_SHORT).show();
                    }
                });

                AlertDelete.show();
                break;
            case R.id.ButtonGetContent:
                EditText txtContent = (EditText) findViewById(R.id.Edit_Name);
                Toast.makeText(MainActivity.this,txtContent.getText().toString(),Toast.LENGTH_SHORT).show();
            default:
                break;
        }
    }
}
