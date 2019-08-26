package com.kodilla.stream.forumuser;

import java.util.ArrayList;
import java.util.List;

public class Forum {
    private final List<ForumUser> users = new ArrayList<ForumUser>();

    public Forum () {
        users.add(new ForumUser(1, "Bob", 'M', 1998, 5, 23, 0));
        users.add(new ForumUser(2, "Beatrice", 'F', 1992, 3, 3, 2));
        users.add(new ForumUser(3, "Avril", 'F', 1989, 9, 12, 12));
        users.add(new ForumUser(4, "Tom", 'M', 1999, 8, 26, 22));
        users.add(new ForumUser(5, "Esteban", 'M', 2002, 2, 27, 14));
        users.add(new ForumUser(6, "Marie", 'F', 2003, 1, 30, 1));
        users.add(new ForumUser(7, "Barry", 'M', 2008, 11, 29, 9));
        users.add(new ForumUser(8, "Andrew", 'M', 1977, 7, 31, 2));
        users.add(new ForumUser(9, "Elise", 'F', 1980, 4, 4, 30));
        users.add(new ForumUser(10, "Barney", 'M', 2001, 4, 22, 6));
    }

    public List<ForumUser> getUserList() {
        return new ArrayList<ForumUser>(users);
    }
}
