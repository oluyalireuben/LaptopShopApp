package com.example.laptops_list;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class DashboardActivity extends AppCompatActivity {
    Button btnkabarak, btnEgerton, btnmoi, btnKenyatta, btnJkuat, btnUon, btnMachakos, btnLogOut;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        btnkabarak  = findViewById(R.id.btnDEL);
        btnEgerton  = findViewById(R.id.btnasus);
        btnmoi  = findViewById(R.id.btnAcer);
        btnKenyatta  = findViewById(R.id.btnmicrosoft);
        btnJkuat  = findViewById(R.id.btnApple);
        btnUon  = findViewById(R.id.btnlENOVO);
        btnLogOut  = findViewById(R.id.btnLogOut);


        btnkabarak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(DashboardActivity.this, DelActivity.class));

            }
        });

        btnEgerton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(DashboardActivity.this, AsusActivity.class));

            }
        });

        btnmoi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(DashboardActivity.this, AcerActivity.class));

            }
        });

        btnJkuat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(DashboardActivity.this, AppleActivity.class));

            }
        });

        btnUon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(DashboardActivity.this, LenovoActivity.class));

            }
        });



        btnKenyatta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(DashboardActivity.this, MicrosoftActivity.class));

            }
        });

        btnLogOut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(DashboardActivity.this, MainActivity.class));

            }
        });


    }
}