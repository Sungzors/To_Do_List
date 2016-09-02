package com.example.sungwon.todolist;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView mToDoPhrase;
    TextView mDueSoonView;
    Button mToDoStartButton;
    Button mTimelineStartButton;
    SQLHelper mHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mToDoPhrase = (TextView)findViewById(R.id.toDoPhrase);
        mDueSoonView = (TextView)findViewById(R.id.dueSoonView);
        mToDoStartButton = (Button)findViewById(R.id.toDoStartButton);
        mTimelineStartButton = (Button)findViewById(R.id.timelineStartButton);
        double phraseTime = Math.floor((Math.random() * 2.999d));
        if (phraseTime == 2){
            mToDoPhrase.setText(R.string.appquibb1);
        } else if (phraseTime == 1){
            mToDoPhrase.setText(R.string.appquibb2);
        } else {
            mToDoPhrase.setText(R.string.appquibb3);
        }
//        mHelper = new SQLHelper(this);
//        mHelper.addDataToDb();
        mToDoStartButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, CategoryActivity.class);
                startActivity(intent);
            }
        });
//        Calendar rightNow = GregorianCalendar.getInstance();
//        String itisTime = (rightNow.get(GregorianCalendar.DATE)+ "," + rightNow.get(GregorianCalendar.MONTH)+1);
//        mDueSoonView.setText(itisTime);


    }
}
