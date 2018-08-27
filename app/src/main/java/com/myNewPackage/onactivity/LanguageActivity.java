package com.myNewPackage.onactivity;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import util.Languages;

public class LanguageActivity extends AppCompatActivity {
    private Button buttonUkr,buttonRus,buttonEng;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(com.myAppl.onactivity.R.layout.language_activity);

        buttonEng = findViewById(com.myAppl.onactivity.R.id.b_eng_language);
        buttonRus = findViewById(com.myAppl.onactivity.R.id.b_rus_language);
        buttonUkr = findViewById(com.myAppl.onactivity.R.id.b_ukr_language);

        View.OnClickListener onClickListener = view -> {
            Intent intent;
            switch (view.getId()){
                case com.myAppl.onactivity.R.id.b_eng_language:
                    intent = new Intent();
                    intent.putExtra("language", Languages.ENGLISH.getLanguage());
                    setResult(RESULT_OK,intent);
                    finish();
                    break;
                case com.myAppl.onactivity.R.id.b_rus_language:
                    intent = new Intent();
                    intent.putExtra("language",Languages.RUSSIAN.getLanguage());
                    setResult(RESULT_OK,intent);
                    finish();
                    break;
                case com.myAppl.onactivity.R.id.b_ukr_language:
                    intent = new Intent();
                    intent.putExtra("language",Languages.UKRAINIAN.getLanguage());
                    setResult(RESULT_OK,intent);
                    finish();
                    break;
            }
        };
        buttonEng.setOnClickListener(onClickListener);
        buttonRus.setOnClickListener(onClickListener);
        buttonUkr.setOnClickListener(onClickListener);

    }
}
