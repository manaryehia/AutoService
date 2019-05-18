package com.code.autoservice.views.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import com.code.autoservice.MainActivity;
import com.code.autoservice.R;

public class LoginActivity extends AppCompatActivity {

    EditText ed_mobile;
    EditText ed_password;
    Button btn_login;
    Button btn_register;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        ed_mobile =(EditText)findViewById(R.id.ed_mobileLogin);
        ed_password=(EditText)findViewById(R.id.ed_passLogin);
        btn_login=(Button)findViewById(R.id.btn_login);
        btn_register=(Button)findViewById(R.id.btn_register);


        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if( ed_mobile.getText().toString().length() == 0 )
                    ed_mobile.setError( "Mobile is required!");
                else if (ed_password.getText().toString().length()<=6)
                    ed_password.setError("Password should be more than 6 characters ");
                else
                    startActivity(new Intent(LoginActivity.this, MainActivity.class));



            }
        });
        btn_register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LoginActivity.this, RegisterActivity.class));

            }
        });



    }
}
