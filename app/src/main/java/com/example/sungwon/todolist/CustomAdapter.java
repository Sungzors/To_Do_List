package com.example.sungwon.todolist;

import android.content.Context;
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
        return null;
    }
    static class ViewHolder{
        TextView viewDateText;
        TextView viewHighText;
        TextView viewLowText;

        public ViewHolder(View itemlayout) {
            this.viewDateText = (TextView) itemlayout.findViewById(R.id.dateText);
            this.viewHighText = (TextView) itemlayout.findViewById(R.id.highText);
            this.viewLowText = (TextView) itemlayout.findViewById(R.id.lowText);
        }
    }
}
