package com.code.autoservice.views.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.code.autoservice.R;

public class RegisterActivity extends AppCompatActivity {

    EditText firstName,lastName,mobilePhone,password,confirmPassword;

    Button register;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        firstName=findViewById(R.id.ed_firstNameRegister);
        lastName=findViewById(R.id.ed_lastNameRegister);
        mobilePhone=findViewById(R.id.ed_mobilePhoneRegister);
        password=findViewById(R.id.ed_passwordRegister);
        confirmPassword=findViewById(R.id.ed_confirmPasswordRegister);
        register=findViewById(R.id.btn_Register2);

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(firstName .getText().toString().length() == 0 )
                    firstName.setError( "First Name is required!");
                else if (lastName.getText().toString().length()==0)
                    lastName.setError("Last Name is required!");
                else if (mobilePhone.getText().toString().length()==0)
                    mobilePhone.setError("Mobile Number is required!");
                else if (password.getText().toString().length()==0)
                    password.setError("Password is required!");
                else if (password.getText().toString()!=confirmPassword.getText().toString())
                    confirmPassword.setError("Password Not match!");
                else
                    startActivity(new Intent(RegisterActivity.this, LoginActivity.class));


            }
        });


    }
}
