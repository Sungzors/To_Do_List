package com.example.sungwon.todolist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by SungWon on 8/17/2016.
 */
public class CustomAdapter extends BaseAdapter {

    private Context context;
    private ArrayList<ToDoDoDa> todoList;

    public CustomAdapter(Context context, ArrayList<ToDoDoDa> todoList) {
        this.context = context;
        this.todoList = todoList;
    }


    @Override
    public int getCount() {
        return todoList.size();
    }

    @Override
    public Object getItem(int i) {
        return todoList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder viewHolder;

        if(view == null){
            view = LayoutInflater.from(context).inflate(R.layout.list_item, viewGroup, false);
        } else {

        }

        TextView taskText = (TextView) view.findViewById(R.id.tasktext);
        TextView startDateText = (TextView) view.findViewById(R.id.startDateText);
        TextView dueDateText = (TextView) view.findViewById(R.id.dueDateText);
        final ToDoDoDa toodles = todoList.get(i);
        taskText.setText("Task: " + toodles.getTask());
        startDateText.setText("Start: " + toodles.getDateMade());
        dueDateText.setText("Due: " + toodles.getDueDate());

        return null;
    }
    static class ViewHolder{
        TextView viewDateText;
        TextView viewHighText;
        TextView viewLowText;

        public ViewHolder(View itemlayout) {
//            this.viewDateText = (TextView) itemlayout.findViewById(R.id.dateText);
//            this.viewHighText = (TextView) itemlayout.findViewById(R.id.highText);
//            this.viewLowText = (TextView) itemlayout.findViewById(R.id.lowText);
        }
    }
}
