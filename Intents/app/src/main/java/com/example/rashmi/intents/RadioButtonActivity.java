package com.example.rashmi.intents;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class RadioButtonActivity extends AppCompatActivity {

    private static final String TAG = RadioButtonActivity.class.getSimpleName();
    RadioGroup radioGroup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio_button);

        radioGroup = (RadioGroup) findViewById(R.id.radioGroup);
    }

    public void submit(View view) {
        int selectedId = radioGroup.getCheckedRadioButtonId();

        RadioButton selectedButton = (RadioButton) findViewById(selectedId);

        Log.d(TAG, "result: "+selectedButton.getText().toString());
    }
}
