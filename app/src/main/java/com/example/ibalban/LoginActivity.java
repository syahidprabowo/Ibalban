package com.example.ibalban;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        // untuk membuat clickable teks dan mengarahkan ke activity lain
        final TextView txtView = this.findViewById(R.id.teks_reg);
        txtView.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick (View v){
                LoginActivity.this.startActivity(new Intent(LoginActivity.this, RegisterActivity.class));
            }
        });
    }
}
