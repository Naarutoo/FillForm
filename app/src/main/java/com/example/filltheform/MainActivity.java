package com.example.filltheform;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private Button mBtnTick;
private EditText mEtOrganization;
private EditText mEtCustomer;
private EditText mEtMobileNumber;
private EditText mEtEmail;
private EditText mEtAddress;
private EditText mEtManfacturur;
private EditText mEtTaxId;
private EditText mEtCompanyId;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main);
        initviews();
        mBtnTick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MainActivity2.class);
                intent.putExtra("Org",mEtOrganization.getText().toString());
                intent.putExtra("Name",mEtCustomer.getText().toString());
                intent.putExtra("Phone",mEtMobileNumber.getText().toString());
                intent.putExtra("Email",mEtEmail.getText().toString());
                intent.putExtra("Add",mEtAddress.getText().toString());
                intent.putExtra("manfacturur",mEtManfacturur.getText().toString());
                intent.putExtra("Tax",mEtTaxId.getText().toString());
                intent.putExtra("Com",mEtCompanyId.getText().toString());
                startActivity(intent);
            }
        });
    }

    private void initviews() {
        mBtnTick = findViewById(R.id.btnTick);
        mEtOrganization = findViewById(R.id.etOrganization);
        mEtCustomer = findViewById(R.id.etCustomer);
        mEtMobileNumber = findViewById(R.id.etMobileNumber);
        mEtAddress = findViewById(R.id.etAddress);
        mEtEmail = findViewById(R.id.etEmail);
        mEtManfacturur = findViewById(R.id.etManfacturur);
        mEtTaxId = findViewById(R.id.etTaxId);
        mEtCompanyId = findViewById(R.id.etCompanyId);
    }
}