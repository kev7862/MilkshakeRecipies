package kev7862.github.milkshakerecepies;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.io.IOException;
import java.util.ArrayList;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;

public class MilkshakeActivity extends AppCompatActivity {

    private ListView milkshakeList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_milkshake);

    private void getRestaurants(String location) {
        final YelpService yelpService = new YelpService();
        yelpService.findRestaurants(location, new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
                e.printStackTrace();
            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                try {
                    String jsonData = response.body().string();
                    Log.v(TAG, jsonData);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        });
    }
}



        ListView milkshakeList = (ListView)findViewById(R.id.milkshakeList);

        final ArrayList<String> myMilkshakes = new ArrayList<String>();


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
