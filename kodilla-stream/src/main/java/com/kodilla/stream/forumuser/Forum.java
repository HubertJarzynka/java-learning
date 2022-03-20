package com.kodilla.stream.forumuser;

import java.util.ArrayList;
import java.util.List;

public class Forum {

    final List<ForumUser> userList = new ArrayList<>();

    public Forum() {
        userList.add(new ForumUser(11111, "tomek", 'M',
                1997, 3, 12, 5));
        userList.add(new ForumUser(22222, "wojtek", 'M',
                1999, 4, 15, 3));
        userList.add(new ForumUser(33333, "olga", 'F',
                2000, 1, 16, 2));
        userList.add(new ForumUser(44444, "mati", 'M',
                1949, 2, 12, 1));
        userList.add(new ForumUser(55555, "kicia", 'F',
                1988, 8, 2, 9));
        userList.add(new ForumUser(66666, "sebek", 'M',
                2002, 9, 1, 5));
        userList.add(new ForumUser(77777, "krzychu", 'M',
                1993, 1, 14, 0));
    }

    public List<ForumUser> getUserList() {
        return new ArrayList<>(userList);
    }

}