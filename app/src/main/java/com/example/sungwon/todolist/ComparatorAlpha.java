package com.example.sungwon.todolist;

import java.util.Comparator;

/**
 * Created by SungWon on 8/19/2016.
 */
public class ComparatorAlpha implements Comparator<ToDoDoDa> {
    @Override
    public int compare(ToDoDoDa toDoDoDa, ToDoDoDa t1) {
        return toDoDoDa.getTask().compareToIgnoreCase(t1.getTask());
    }
}
