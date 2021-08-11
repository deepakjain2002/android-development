package io.deepakjain.androiddevelopmentloginpage;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class RecyclerViewList extends AppCompatActivity {

    RecyclerView recyclerView;

    String s1[],s2[];
    int images[] = {R.drawable.boy, R.drawable.boy1, R.drawable.girl, R.drawable.girl1, R.drawable.boy2, R.drawable.boy3,
    R.drawable.boy11, R.drawable.girl2,R.drawable.girl3, R.drawable.girl22};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view_list);

        recyclerView = findViewById(R.id.myContactView);

        s1 = getResources().getStringArray(R.array.contact_name);
        s2 = getResources().getStringArray(R.array.numbers);

        MyAdapter myAdapter = new MyAdapter(this,s1,s2,images);
        recyclerView.setAdapter(myAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}