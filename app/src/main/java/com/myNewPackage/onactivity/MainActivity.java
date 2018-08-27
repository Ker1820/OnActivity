package com.myNewPackage.onactivity;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import static  util.RequestCode.*;

public class MainActivity extends AppCompatActivity {
    private Button buttonName, buttonLanguage;
    private TextView nameR,languageR;

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        nameR = findViewById(com.myAppl.onactivity.R.id.name);
        languageR = findViewById(com.myAppl.onactivity.R.id.language);
        if(resultCode == RESULT_OK){
            switch (requestCode){
                case REQUEST_CODE_PRESENTED:
                    String name = data.getStringExtra("name");
                    nameR.setText(name);
                    break;
                case  REQUEST_CODE_LANGUAGE:
                    String language = data.getStringExtra("language");
                    languageR.setText(language);
                    break;
            }

        }else{
            Toast.makeText(this,"Error",Toast.LENGTH_LONG);

        }

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(com.myAppl.onactivity.R.layout.activity_main);

        buttonName = findViewById(com.myAppl.onactivity.R.id.b_tell_name);
        buttonLanguage = findViewById(com.myAppl.onactivity.R.id.b_tell_language);

        View.OnClickListener onClickListener = view -> {
            Intent intent;
            switch (view.getId()){
                case com.myAppl.onactivity.R.id.b_tell_name:
                    intent = new Intent(this,PresentedActivity.class);
                    startActivityForResult(intent,REQUEST_CODE_PRESENTED);
                    break;
                case com.myAppl.onactivity.R.id.b_tell_language:
                    intent = new Intent(this,LanguageActivity.class);
                    startActivityForResult(intent,REQUEST_CODE_LANGUAGE);
                    break;
            }
        };
        buttonName.setOnClickListener(onClickListener);
        buttonLanguage.setOnClickListener(onClickListener);
    }
}
