package com.example.sungwon.todolist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.LinkedList;

/**
 * Created by SungWon on 8/17/2016.
 */
public class CustomAdapter extends BaseAdapter {

    private Context context;
    private LinkedList<ToDoDoDa> todoList;

    public CustomAdapter(Context context, LinkedList<ToDoDoDa> todoList) {
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
            viewHolder = new ViewHolder(view);
            view.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) view.getTag();
        }

        viewHolder.taskText = (TextView) view.findViewById(R.id.tasktext);
        viewHolder.startDateText = (TextView) view.findViewById(R.id.startDateText);
        viewHolder.dueDateText = (TextView) view.findViewById(R.id.dueDateText);
        final ToDoDoDa toodles = todoList.get(i);
        viewHolder.taskText.setText("Task: " + toodles.getmTask());
        viewHolder.startDateText.setText("Start: \n" + toodles.getDateNumbah().substring(0, 11));
        viewHolder.dueDateText.setText("Due: \n" + toodles.getDueDateNumbah().substring(0,11));

        return view;
    }
    static class ViewHolder{
        TextView taskText;
        TextView startDateText;
        TextView dueDateText;

        public ViewHolder(View itemlayout) {
            this.taskText = (TextView) itemlayout.findViewById(R.id.tasktext);
            this.startDateText = (TextView) itemlayout.findViewById(R.id.startDateText);
            this.dueDateText = (TextView) itemlayout.findViewById(R.id.dueDateText);
        }
    }
}
