package com.example.sungwon.todolist;

import java.util.Comparator;

/**
 * Created by SungWon on 8/19/2016.
 */
public class ComparatorDate implements Comparator<ToDoDoDa>{
    @Override
    public int compare(ToDoDoDa toDoDoDa, ToDoDoDa t1) {
        return toDoDoDa.getDateNumbah().compareTo(t1.getDateNumbah());
    }
}
