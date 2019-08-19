package com.kodilla.testing.forum.statistics;


public class CalculatingStatistics {
    private int usersCount;
    private int postsCount;
    private int commentsCount;
    private double averagePostsPerUser;
    private double averageCommentsPerUser;
    private double averageCommentsPerPost;

    public int getUsersCount() {
        return usersCount;
    }

    public int getPostsCount() {
        return postsCount;
    }

    public int getCommentsCount() {
        return commentsCount;
    }

    public double getAveragePostsPerUser() {
        return averagePostsPerUser;
    }

    public double getAverageCommentsPerUser() {
        return averageCommentsPerUser;
    }

    public double getAverageCommentsPerPost() {
        return averageCommentsPerPost;
    }

    public void calculateAdvStatistics(Statistics statistics) {
        this.usersCount = statistics.userNames().size();
        this.postsCount = statistics.postsCount();
        this.commentsCount = statistics.commentsCount();
        if (statistics.userNames().size()==0) {
            this.averagePostsPerUser = 0;
            this.averageCommentsPerUser = 0;
        } else {
            this.averagePostsPerUser = statistics.postsCount() / (double)statistics.userNames().size();
            this.averageCommentsPerUser = statistics.commentsCount() / (double)statistics.userNames().size();
        }
        if (statistics.postsCount()==0) {
            this.averageCommentsPerPost = 0;
        } else {
            this.averageCommentsPerPost = (double)statistics.commentsCount() / (double)statistics.postsCount();
        }
    }
    public String showStatistics() {
        return "Average Posts per Users: " + this.averagePostsPerUser + "\nAverage Comments per Users: " + this.averageCommentsPerUser +
                "\nAverage Comments per Posts: " + this.averageCommentsPerPost;
    }
}
