package com.example.sungwon.todolist;

/**
 * Created by SungWon on 8/17/2016.
 */
public class ToDoHolder {
    private static ToDoHolder ourInstance = new ToDoHolder();

    public static ToDoHolder getInstance() {
        return ourInstance;
    }

    private ToDoHolder() {
    }
}
