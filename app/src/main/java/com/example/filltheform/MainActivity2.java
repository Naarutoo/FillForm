package com.example.filltheform;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity2 extends AppCompatActivity {
    private Button mBtnTick1;
    private EditText mEtOrganization1;
    private EditText mEtCustomer1;
    private EditText mEtMobileNumber1;
    private EditText mEtEmail1;
    private EditText mEtAddress1;
    private EditText mEtManfacturur1;
    private EditText mEtTaxId1;
    private EditText mEtCompanyId1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        initview();
        Intent intent = getIntent();
        String Name = intent.getStringExtra("Name");
        mEtCustomer1.setText(Name);
        String Org = intent.getStringExtra("Org");
        mEtOrganization1.setText(Org);
        String Number = intent.getStringExtra("Phone");
        mEtMobileNumber1.setText(Number);
        String Email = intent.getStringExtra("Email");
        mEtEmail1.setText(Email);
        String Address =intent.getStringExtra("Add");
        mEtAddress1.setText(Address);
        String manfacturur = intent.getStringExtra("manfacturur");
        mEtManfacturur1.setText(manfacturur);
        String Tax = intent.getStringExtra("Tax");
        mEtTaxId1.setText(Tax);
        String company = intent.getStringExtra("Com");
        mEtCompanyId1.setText(company);


    }

    private void initview() {
        mBtnTick1 = findViewById(R.id.btnTick);
        mEtOrganization1 = findViewById(R.id.etOrganization);
        mEtCustomer1 = findViewById(R.id.etCustomer);
        mEtMobileNumber1 = findViewById(R.id.etMobileNumber);
        mEtAddress1 = findViewById(R.id.etAddress);
        mEtEmail1 = findViewById(R.id.etEmail);
        mEtManfacturur1 = findViewById(R.id.etManfacturur);
        mEtTaxId1 = findViewById(R.id.etTaxId);
        mEtCompanyId1 = findViewById(R.id.etCompanyId);

    }
}