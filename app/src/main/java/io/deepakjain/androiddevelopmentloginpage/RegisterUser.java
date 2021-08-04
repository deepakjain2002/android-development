package io.deepakjain.androiddevelopmentloginpage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class RegisterUser extends AppCompatActivity {


    EditText name, mobno, mailid, password;
    Button done;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_user);


        name = findViewById(R.id.name);
        mobno = findViewById(R.id.mobileno);
        mailid = findViewById(R.id.mailid);
        password = findViewById(R.id.setPassword);
        done = findViewById(R.id.done);

        done.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
             validateDetails();
             validateEmail(mailid);
            }
        });

    }

    public void validateDetails(){
        if(name.getText().toString().isEmpty() || mobno.getText().toString().isEmpty() || mailid.getText().toString().isEmpty() || password.getText().toString().isEmpty()){
            Toast.makeText(this, "Enter all details", Toast.LENGTH_SHORT).show();
        }else{

        }
    }

    public void validateEmail(EditText mailid){
        String emailinput = mailid.getText().toString();

        if(!emailinput.isEmpty() && Patterns.EMAIL_ADDRESS.matcher(emailinput).matches()){
            Intent intent = new Intent(RegisterUser.this, HomeScreen.class);
            startActivity(intent);
        }else{
            Toast.makeText(this,"Invalid Email Address",Toast.LENGTH_SHORT).show();
        }
    }
}