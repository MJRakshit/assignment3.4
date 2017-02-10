package com.example.monojit.login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    String username,password;
    EditText input1,input2;
    Button login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        input1=(EditText)findViewById(R.id.editText);
        input2=(EditText)findViewById(R.id.editText2);
        login=(Button)findViewById(R.id.button);

    }
    public void goToDashboard(View view){
        username=input1.getText().toString();
        password=input2.getText().toString();
        Intent dashboard=new Intent(getApplicationContext(),DashBoard_Activity.class);
        Bundle data = new Bundle();
        data.putString("user_name",username);
        data.putString("pass",password);
         dashboard.putExtras(data);
        startActivity(dashboard);
    }

}
