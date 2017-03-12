package com.example.weisheng.weisheng1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity1 extends AppCompatActivity {


    private Button btn_liner, btn_relative, btn_table;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);

        btn_liner= (Button) findViewById(R.id.b1);
        btn_relative=(Button) findViewById(R.id.b2);
        btn_table=(Button) findViewById(R.id.b3);
        btn_liner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity1.this,lab2.class);
                startActivity(intent);
            }
        });
        btn_relative.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity1.this,wei.class);
                startActivity(intent);
            }
        });
        btn_table.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity1.this,wei2.class);
                startActivity(intent);
            }
        });
    }
}
