package com.example.monojit.login;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class DashBoard_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dash_board_);
        Bundle getBundle = this.getIntent().getExtras();
        String name = getBundle.getString("user_name");
        String pa=getBundle.getString("pass");
        Toast.makeText(this.getApplicationContext(),"Wllcome"+name,Toast.LENGTH_LONG).show();
    }
}
