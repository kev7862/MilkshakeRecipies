package kev7862.github.milkshakerecepies;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MilkshakeActivity extends AppCompatActivity {

    private ListView milkshakeList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_milkshake);

        ListView milkshakeList = (ListView)findViewById(R.id.milkshakeList);

        final ArrayList<String> myMilkshakes = new ArrayList<String>();

        myMilkshakes.add("Vanilla Milkshake");
        myMilkshakes.add("Icy Banana Milkshake");
        myMilkshakes.add("Cappuccino Cooler");
        myMilkshakes.add("Yummy Strawberry Shake");
        myMilkshakes.add("Chocolate Mug Milkshake");
        myMilkshakes.add("Cold Cocoa Smoothie");
        myMilkshakes.add("Apple Milkshake");
        myMilkshakes.add("Bananaberry Milkshake");

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line, myMilkshakes);
        milkshakeList.setAdapter(arrayAdapter);
        milkshakeList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            // ItemClick on position
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getApplicationContext(), myMilkshakes.get(i), Toast.LENGTH_LONG).show();
            }
        });
    }
}
