package com.example.sungwon.todolist;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class ToDoListActivity extends AppCompatActivity {
    Button mAlphaba;
    Button mDatea;
    Button mDoneso;
    ListView listView;
    ArrayList<ToDoDoDa> mToDoArray;
    ArrayList<ToDoDoDa> mShowToDo;
    CustomAdapter customAdapter;
    String categoryChosen;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_to_do_list);
        Intent intent = getIntent();
        categoryChosen = intent.getStringExtra("categoryname");
        mAlphaba = (Button)findViewById(R.id.alphabetize);
        mDatea = (Button)findViewById(R.id.datetize);
        mDoneso = (Button)findViewById(R.id.donesos);
        listView = (ListView)findViewById(R.id.list_view);
        mToDoArray = new ArrayList<>();
        mShowToDo = new ArrayList<>();
        mToDoArray.add(0, new ToDoDoDa("Dummy", "Nothing Here"));

        for (int i = 0; i < mToDoArray.size(); i++) {
            if(mToDoArray.get(i).getTask().equals(categoryChosen)){
                mShowToDo.add(mToDoArray.get(i));
            }
        }
        customAdapter = new CustomAdapter(this, mShowToDo );
        listView.setAdapter(customAdapter);

        final FloatingActionButton fab = (FloatingActionButton)findViewById(R.id.fab2);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(ToDoListActivity.this);
                final Dialog dialog = new Dialog(ToDoListActivity.this);
                dialog.setContentView(R.layout.alert_interface);
                dialog.setTitle("Require Input");
                final EditText yearText = (EditText)dialog.findViewById(R.id.yearInput);
                final EditText monthText = (EditText)dialog.findViewById(R.id.monthInput);
                final EditText dayText = (EditText)dialog.findViewById(R.id.dateInput);
                final EditText input = (EditText)dialog.findViewById(R.id.taskName);
                TextView positiveButton = (TextView) dialog.findViewById(R.id.positiveButton);
                TextView negativeButton = (TextView)dialog.findViewById(R.id.negativeButton);
                positiveButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        int yearInt = Integer.parseInt(yearText.getText().toString());
                        int monthInt = Integer.parseInt(monthText.getText().toString());
                        int dayInt = Integer.parseInt(dayText.getText().toString());
                        ToDoDoDa newToDo = new ToDoDoDa(categoryChosen, input.getText().toString());
                        newToDo.setDueDateNumbah(yearInt, monthInt, dayInt);
                        mToDoArray.add(newToDo);
                        mShowToDo.add(newToDo);
                        customAdapter.notifyDataSetChanged();
                        dialog.dismiss();
                    }
                });
                negativeButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        dialog.dismiss();
                    }
                });


                dialog.show();
            }
        });

    }


}
