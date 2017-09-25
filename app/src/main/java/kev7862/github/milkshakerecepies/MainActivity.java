package kev7862.github.milkshakerecepies;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView app_header;
    private Button milkshakeButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Styling Homepage Views
        app_header = (TextView)findViewById(R.id.app_header);
        milkshakeButton = (Button)findViewById(R.id.milkshakeButton);
        Typeface cartel = Typeface.createFromAsset(getAssets(), "fonts/cartel.ttf");
        app_header.setTypeface(cartel);
        Typeface Pacifico = Typeface.createFromAsset(getAssets(), "fonts/Pacifico.ttf");
        milkshakeButton.setTypeface(Pacifico);
    }
}
