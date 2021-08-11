package io.deepakjain.androiddevelopmentloginpage;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class HomePage extends AppCompatActivity {


    EditText userEmail, userPassword;
    Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);


        userEmail = findViewById(R.id.emailOfUser);
        userPassword = findViewById(R.id.userPassword);

        submit = findViewById(R.id.submit);



        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                 if(userEmail.getText().toString().equals("Deepak") && userPassword.getText().toString().equals("12345")){

                     String str = userEmail.getText().toString();

                     Intent intent = new Intent(HomePage.this, HomeScreen.class);

                     intent.putExtra("message_key",str);

                     startActivity(intent);
                 }
                 else
                 {
                     Toast.makeText(getApplicationContext(),"Invalid Credentials", Toast.LENGTH_SHORT).show();
                 }
            }
        });


    }

}