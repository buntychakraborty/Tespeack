package com.example.tespeack;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import de.hdodenhof.circleimageview.CircleImageView;

public class MainActivity extends AppCompatActivity {
    private CircleImageView s2T,t2S;
    private TextView s2t,t2s;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initializeFields();

        s2t.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendToSppechToTextActivity();
            }
        });

        s2T.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendToSppechToTextActivity();

            }
        });

        t2S.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendToTextToSpeechActivity();

            }
        });

        t2s.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendToTextToSpeechActivity();

            }
        });


    }

    private void sendToTextToSpeechActivity() {
        Intent intent=new Intent(getApplicationContext(),TextToSpeechActivity.class);
        startActivity(intent);
    }

    private void sendToSppechToTextActivity() {
        Intent intent=new Intent(getApplicationContext(),SpeechToTextActivity.class);
        startActivity(intent);
    }

    private void initializeFields() {
        s2T=(CircleImageView)findViewById(R.id.speech_to_text);
        t2S=(CircleImageView)findViewById(R.id.text_to_speech);
        s2t=(TextView)findViewById(R.id.textView3);
        t2s=(TextView)findViewById(R.id.textView4);


    }


}
