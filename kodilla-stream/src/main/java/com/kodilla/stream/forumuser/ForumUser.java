package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public final class ForumUser {
    private final int id;
    private final String userName;
    private final char gender;
    private final LocalDate birthDate;
    private final int numbOfPosts;

    public ForumUser(int id, String userName, char gender, int yearOfBirth, int monthOfBirth, int dayOfBirth, int numbOfPosts) {
        this.id = id;
        this.userName = userName;
        this.gender = gender;
        this.birthDate = LocalDate.of(yearOfBirth, monthOfBirth, dayOfBirth);
        this.numbOfPosts = numbOfPosts;
    }

    public int getId() {
        return id;
    }
    public String getUserName() {
        return userName;
    }
    public char getGender() {
        return gender;
    }
    public LocalDate getBirthDate() {
        return birthDate;
    }
    public int getNumbOfPosts() {
        return numbOfPosts;
    }

    public boolean is20() {
        if (LocalDate.now().getYear() - getBirthDate().getYear() > 20) {
            return true;
        }else if (LocalDate.now().getYear() - getBirthDate().getYear() == 20 && LocalDate.now().getMonthValue() > getBirthDate().getMonthValue()) {
            return true;
        }else if (LocalDate.now().getYear() - getBirthDate().getYear() == 20 && LocalDate.now().getMonthValue() == getBirthDate().getMonthValue() && LocalDate.now().getDayOfMonth() - getBirthDate().getDayOfMonth()>=0) {
            return true;
        }else
            return false;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", gender=" + gender +
                ", birthDate=" + birthDate +
                ", numbOfPosts=" + numbOfPosts +
                '}';
    }
}
