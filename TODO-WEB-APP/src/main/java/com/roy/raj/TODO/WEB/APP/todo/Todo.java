package com.roy.raj.TODO.WEB.APP.todo;

import java.time.LocalDate;

public class Todo {
    private long id;
    private String Descrption;
    private LocalDate targetDate;
    private boolean done;

    public Todo(long id, String descrption, LocalDate targetDate, boolean done) {
        super();
        this.id = id;
        Descrption = descrption;
        this.targetDate = targetDate;
        this.done = done;
    }
    

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    public LocalDate getTargetDate() {
        return targetDate;
    }

    public void setTargetDate(LocalDate targetDate) {
        this.targetDate = targetDate;
    }

    public String getDescrption() {
        return Descrption;
    }

    public void setDescrption(String descrption) {
        Descrption = descrption;
    }

    @Override
    public String toString() {
        return "Todo{" + "id=" + id + ", Descrption='" + Descrption + '\'' + ", targetDate=" + targetDate + ", done=" + done + '}';
    }
}
