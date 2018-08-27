package com.myNewPackage.onactivity;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class PresentedActivity extends AppCompatActivity {
    private EditText editText;
    private Button buttonTell;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(com.myAppl.onactivity.R.layout.presented_activity);

        editText = findViewById(com.myAppl.onactivity.R.id.typed_name);
        buttonTell = findViewById(com.myAppl.onactivity.R.id.tell);

        View.OnClickListener onClickListener = view -> {
            Intent intent = new Intent();
            intent.putExtra("name",editText.getText().toString());
            setResult(RESULT_OK,intent);
            finish();
        };

        buttonTell.setOnClickListener(onClickListener);

    }
}
