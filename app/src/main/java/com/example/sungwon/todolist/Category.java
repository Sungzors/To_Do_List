package com.example.sungwon.todolist;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.text.InputType;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.LinkedList;

public class Category extends AppCompatActivity {
    LinkedList<String> mCategoryList;
    ArrayAdapter<String> mAdapter;
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);
        listView = (ListView) findViewById(R.id.list_view);

        mCategoryList = new LinkedList<>();

        mAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, mCategoryList);
        listView.setAdapter(mAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                TextView textView = ((TextView)view);
                String text = textView.getText().toString();
                Intent intent = new Intent(Category.this, ToDoListActivity.class);
                intent.putExtra("categoryname", text);
                startActivity(intent);
            }
        });

    }

    public void changeTheText(View v) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);

        final EditText input = new EditText(this);
        input.setInputType(InputType.TYPE_CLASS_TEXT);

        builder.setView(input);

        builder.setMessage(R.string.wannaaddCat)
                .setPositiveButton(R.string.addnewCat, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        if(input.getText().toString().equals("")){
                            Toast.makeText(Category.this, "Please Insert a Category", Toast.LENGTH_SHORT).show();
                            return;
                        }
                        mCategoryList.add(input.getText().toString());
                        mAdapter.notifyDataSetChanged();
                    }
                })
                .setNegativeButton(R.string.cancelmahCat, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {

                    }
                });

        Dialog dialog = builder.create();
        dialog.show();
    }
}
