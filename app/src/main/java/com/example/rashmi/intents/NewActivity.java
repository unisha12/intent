package com.example.rashmi.intents;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class NewActivity extends AppCompatActivity {

    private static final String TAG = NewActivity.class.getSimpleName();
    private int count;
    private Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);

        count =  getIntent().getExtras().getInt("PassValue");
        Log.d(TAG, "onCreate: count "+count);

        btn = (Button) findViewById(R.id.button_2);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count = count +2;

                Intent intent = new Intent();
                intent.putExtra("PassValue", count);

                setResult(10, intent);
                finish();
            }
        });
    }
}
