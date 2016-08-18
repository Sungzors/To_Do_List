package com.example.sungwon.todolist;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class ToDoListActivity extends AppCompatActivity {
    Button mAlphaba;
    Button mDatea;
    Button mDoneso;
    ListView listView;
    private ArrayList<ToDoDoDa> mToDoArray;
    private ArrayList<ToDoDoDa> mShowToDo;
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

    }

    public void changeTheText(View v) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);

        final EditText input = new EditText(this);
        input.setInputType(InputType.TYPE_CLASS_TEXT);

        builder.setView(input);

        builder.setMessage(R.string.wannaaddTodo)
                .setPositiveButton(R.string.addnewTodo, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        ToDoDoDa newToDo = new ToDoDoDa(categoryChosen, input.getText().toString());
                        mToDoArray.add(newToDo);
                        customAdapter.notifyDataSetChanged();
                    }
                })
                .setNegativeButton(R.string.cancelmahTodo, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {

                    }
                });

        Dialog dialog = builder.create();
        dialog.show();
    }
}
