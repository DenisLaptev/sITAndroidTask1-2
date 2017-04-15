package com.sourceit.sourceit2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText editText;
    Button btnHide;
    Button btnRestore;

    String container;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = (EditText) findViewById(R.id.editText);

        btnHide = (Button) findViewById(R.id.btnHide);
        btnHide.setOnClickListener(this);

        btnRestore = (Button) findViewById(R.id.btnRestore);
        btnRestore.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnHide:
                container = editText.getText().toString();
                editText.setText("");
                break;

            case R.id.btnRestore:
                editText.setText(container);
                break;
        }
    }
}
