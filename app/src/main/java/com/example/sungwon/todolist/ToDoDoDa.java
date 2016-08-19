package com.example.sungwon.todolist;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Created by SungWon on 8/17/2016.
 */
public class ToDoDoDa {

    String category;
    String task;
    String dateMade; //view
    Calendar dateNumbah; //method
    String dueDate; //view
    Calendar dueDateNumbah; //method

    public ToDoDoDa(String category, String task) {
        this.category = category;
        this.task = task;
        Calendar rightNow = GregorianCalendar.getInstance();
        this.dateMade = (rightNow.get(GregorianCalendar.MONTH)+1+ " / " + rightNow.get(GregorianCalendar.DATE) + " / " + rightNow.get(Calendar.YEAR));
        this.dateNumbah = rightNow;
    }

    public Calendar getDueDateNumbah() {
        return dueDateNumbah;
    }

    public void setDueDateNumbah(int year, int month, int date) {
        if (dueDateNumbah == null) this.dueDateNumbah = this.dateNumbah;
        Calendar rightNow = new GregorianCalendar();
        rightNow.set(year, month, date);
        this.dueDateNumbah = rightNow;
        this.dueDate = rightNow.get(GregorianCalendar.MONTH)+1+ " / " + rightNow.get(GregorianCalendar.DATE) + " / " + rightNow.get(Calendar.YEAR);
    }
    public void setDueDateNumbah(Calendar newDate){
        this.dueDateNumbah = newDate;
        this.dueDate = getDateMade();
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public String getDateMade() {
        return dateMade;
    }

    public void setDateMade(String dateMade) {
        this.dateMade = dateMade;
    }

    public Calendar getDateNumbah() {
        return dateNumbah;
    }

    public void setDateNumbah(Calendar dateNumbah) {
        this.dateNumbah = dateNumbah;
    }

    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate() {
        if (dueDateNumbah == null) this.dueDate = this.dueDateNumbah.get(GregorianCalendar.MONTH)+1+ " / " + this.dueDateNumbah.get(GregorianCalendar.DATE) + " / " + this.dueDateNumbah.get(Calendar.YEAR);
        this.dueDate = dueDate;
    }
}
