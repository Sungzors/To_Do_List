package com.example.sungwon.todolist;

import java.util.Comparator;

/**
 * Created by SungWon on 8/19/2016.
 */
public class ComparatorDue implements Comparator<ToDoDoDa> {
    @Override
    public int compare(ToDoDoDa toDoDoDa, ToDoDoDa t1) {
        return t1.getDueDateNumbah().compareTo(toDoDoDa.getDueDateNumbah());
    }
}
