package com.example.test.applistview;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final String[] nameArray = {"Android", "ios", "Windows 7", "Window 10", "Linux", "Mac os", "unix", "sybian"};

        String[] infoArray = {
                "System from google",
                "Smartphone System From Apple",
                "System computer",
                "System computer",
                "System Computer",
                "System Computer Apple",
                "System Computer",
                "System Computer"
        };

        Integer[] imageArray = {R.drawable.androidijo,
                R.drawable.ios,
                R.drawable.window7,
                R.drawable.widows8,
                R.drawable.linux,
                R.drawable.macbook,
                R.drawable.unix,
                R.drawable.symbian};

        ListView listView;
        CostumListAdapter whatever = new CostumListAdapter(this, nameArray, infoArray, imageArray);
        listView = (ListView) findViewById(R.id.listviewID);
        listView.setAdapter(whatever);

        listView.setOnItemClickListener(new OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(MainActivity.this, activitydetail.class);
                String message = nameArray[position];
                intent.putExtra("system", message);
                startActivity(intent);
            }
        });
    }
}
