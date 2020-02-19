package com.kodilla.patterns2.observer.homework;

public class Mentor implements HomeworkObserver {
    private final String mentorName;
    private int updateCount;

    public Mentor(String mentorName) {
        this.mentorName = mentorName;
    }

    @Override
    public void update(TaskQueue taskQueue) {
        System.out.println(mentorName + ": new task from " + taskQueue.getStudentName() + "\n" +
                "total: " + taskQueue.getTasks().size() + " messages");
        updateCount++;
    }

    public int getUpdateCount() {
        return updateCount;
    }
}
