package com.example.test.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity implements View.OnClickListener {

    private Button button;
    private EditText editText;
    private TextView textview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_main);
        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(this);
        editText = (EditText) findViewById(R.id.editText);
        textview = (TextView) findViewById(R.id.textview);

    }

    @Override
    public void onClick(View v) {
        textview.setText(editText.getText().toString());
        Toast.makeText(this, "click Button", Toast.LENGTH_SHORT).show();
    }
}
