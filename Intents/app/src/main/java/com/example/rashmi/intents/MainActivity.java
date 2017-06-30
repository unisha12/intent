package com.example.rashmi.intents;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getSimpleName();

    CheckBox checkBoxAndroid;
    CheckBox checkBoxPython;
    CheckBox checkBoxRuby;
    CheckBox checkBoxJava;

    Button btn;
    Button btnCall;
    private int count = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        btn = (Button) findViewById(R.id.button);
//        btnCall = (Button) findViewById(R.id.btn_callhelp);

        checkBoxAndroid = (CheckBox) findViewById(R.id.ch_android);
        checkBoxPython = (CheckBox) findViewById(R.id.ch_python);
        checkBoxRuby = (CheckBox) findViewById(R.id.ch_ruby);
        checkBoxJava = (CheckBox) findViewById(R.id.ch_java);

//        btn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(MainActivity.this, NewActivity.class);
//                intent.putExtra("PassValue", count);
////                startActivity(intent);
//                Log.d(TAG, "onClick: count "+count);
//                startActivityForResult(intent, 10);
//            }
//        });
//
//        btnCall.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent();
//                intent.setAction(Intent.ACTION_DIAL);
//                intent.setData(Uri.parse("tel:197"));
//                startActivity(intent);
//            }
//        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if(requestCode == 10 && data!=null){
            count = data.getExtras().getInt("PassValue");
            Log.d(TAG, "onActivityResult: count "+count);
        }
    }

    public void submit(View view) {
        String result = "Check Value";
        if(checkBoxAndroid.isChecked()){
            result = result+" "+checkBoxAndroid.getText().toString();
        }
        if(checkBoxJava.isChecked()){
            result = result+" "+checkBoxJava.getText().toString();
        }
        if(checkBoxRuby.isChecked()){
            result= result+" "+checkBoxRuby.getText().toString();
        }
        if(checkBoxPython.isChecked()){
            result = result+" "+checkBoxPython.getText().toString();
        }

        Log.d(TAG, "result: "+result);
    }
}
