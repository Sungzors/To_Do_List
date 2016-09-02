package com.example.sungwon.todolist;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * Created by SungWon on 8/17/2016.
 */
public class ToDoDoDa {

    String mCategory;
    int mCategory_id; //mCategory_id id
    String mTask;
    String dateMade; //view OBSOLETE
    String dateNumbah; //method
    String dueDate; //view OBSOLETE
    String dueDateNumbah; //method'
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    public ToDoDoDa(String mCategory, int category, String task) {
        this.mCategory = mCategory;
        this.mCategory_id = category;
        this.mTask = task;
        Calendar rightNow = Calendar.getInstance();
        this.dateNumbah = sdf.format(rightNow.getTime());
        this.dueDateNumbah = this.dateNumbah;
//        this.dateMade = (rightNow.get(GregorianCalendar.MONTH)+1+ " / " + rightNow.get(GregorianCalendar.DATE) + " / " + rightNow.get(Calendar.YEAR));
//        this.dateNumbah = rightNow;
    }

    public String getDueDateNumbah() {
        return dueDateNumbah;
    }

    public void setDueDateNumbah(int year, int month, int date) {
        if (dueDateNumbah == null) this.dueDateNumbah = this.dateNumbah;
        Calendar rightNow = Calendar.getInstance();
        rightNow.set(year, month, date);
        this.dueDateNumbah = sdf.format(rightNow.getTime());
//        this.dueDate = rightNow.get(GregorianCalendar.MONTH)+1+ " / " + rightNow.get(GregorianCalendar.DATE) + " / " + rightNow.get(Calendar.YEAR);
    }

    public void setDueDateNumbah(String dueDate) {
        this.dueDateNumbah = dueDate;
//        this.dueDate = rightNow.get(GregorianCalendar.MONTH)+1+ " / " + rightNow.get(GregorianCalendar.DATE) + " / " + rightNow.get(Calendar.YEAR);
    }

    public String getmCategory() {
        return mCategory;
    }

    public void setmCategory(String mCategory) {
        this.mCategory = mCategory;
    }
    //    public void setDueDateNumbah(Calendar newDate){
//        this.dueDateNumbah = newDate;
//        this.dueDate = getDateMade();
//    }

    public long getmCategory_id() {
        return mCategory_id;
    }

    public void setmCategory_id(int mCategory_id) {
        this.mCategory_id = mCategory_id;
    }

    public String getmTask() {
        return mTask;
    }

    public void setmTask(String mTask) {
        this.mTask = mTask;
    }

    public String getDateMade() {
        return dateMade;
    }

    public void setDateMade(String dateMade) {
        this.dateMade = dateMade;
    }

    public String getDateNumbah() {
        return dateNumbah;
    }

    public void setDateNumbah(String dateNumbah) {
        this.dateNumbah = dateNumbah;
    }

//    public String getDueDate() {
//        return dueDate;
//    }

//    public void setDueDate() {
//        if (dueDateNumbah == null) this.dueDate = this.dueDateNumbah.get(GregorianCalendar.MONTH)+1+ " / " + this.dueDateNumbah.get(GregorianCalendar.DATE) + " / " + this.dueDateNumbah.get(Calendar.YEAR);
//        this.dueDate = dueDate;
//    }
}
