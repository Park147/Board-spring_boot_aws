package org.zerock.w1.todo.dto;

import java.time.LocalDateTime;

public class TodoDTO {
    private String title;
    private Long tno;
    private LocalDateTime dueDate;
    private boolean finished;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Long getTno() {
        return tno;
    }

    public void setTno(Long tno) {
        this.tno = tno;
    }

    public LocalDateTime getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDateTime dueDate) {
        this.dueDate = dueDate;
    }

    public boolean isFinished() {
        return finished;
    }

    public void setFinished(boolean finished) {
        this.finished = finished;
    }

    @Override
    public String toString() {
        return "TodoDTO{" +
                "title='" + title + '\'' +
                ", tno=" + tno +
                ", dueDate=" + dueDate +
                ", finished=" + finished +
                '}';
    }
}
