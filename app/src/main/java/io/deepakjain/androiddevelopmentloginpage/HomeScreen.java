package io.deepakjain.androiddevelopmentloginpage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DateFormatSymbols;
import java.util.ArrayList;


public class HomeScreen extends AppCompatActivity implements AdapterView.OnItemClickListener {

    TextView welcome;
    ListView lvmonths;

    String[] months;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);

        welcome = findViewById(R.id.welcomeUser);
        lvmonths = findViewById(R.id.lvmonth);

        Intent intent = getIntent();

        String str = intent.getStringExtra("message_key");

        welcome.setText("Welcome User " +str);

        //months = new DateFormatSymbols().getMonths();

        ArrayList<String> names = new ArrayList<>();
        names.add("Apple");
        names.add("Mango");
        names.add("watermelon");
        names.add("orange");
        names.add("grapes");
        names.add("Pineapple");
        names.add("Apple");
        names.add("Apple");
        names.add("Apple");
        names.add("Apple");



       ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this, R.layout.list_view,names);


        lvmonths.setAdapter(arrayAdapter);
        lvmonths.setOnItemClickListener(this);

    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int i, long l) {
              String month = parent.getItemAtPosition(i).toString();
        Toast.makeText(getApplicationContext(),"Clicked "  + month, Toast.LENGTH_SHORT).show();
    }
}