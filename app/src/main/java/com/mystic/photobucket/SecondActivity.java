package com.mystic.photobucket;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    public static final String  EXTRA_MESSAGE = "message";
    public static final String  COLOR = "color";
    public static final String ADDRESS = "link";

    LinearLayout layout ;
    TextView describe ;
    Button btnLearn ;
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        layout = findViewById(R.id.linearLayout);
        describe = findViewById(R.id.description);
        btnLearn = findViewById(R.id.button);

        intent = getIntent();
        String messageText = intent.getStringExtra(EXTRA_MESSAGE);
        int color = intent.getIntExtra(COLOR,000);
        layout.setBackgroundColor(color);
        btnLearn.setBackgroundColor(color);
        describe.setText(messageText);
        launchBrowser();
    }

    public void launchBrowser(){

        btnLearn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent launch = new Intent(Intent.ACTION_VIEW);
                String url = intent.getStringExtra(ADDRESS);
                launch.setData(Uri.parse(url));
                startActivity(launch);
            }
        });
    }

}