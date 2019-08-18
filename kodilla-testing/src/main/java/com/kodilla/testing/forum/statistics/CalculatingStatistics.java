package com.kodilla.testing.forum.statistics;


public class CalculatingStatistics {
    int usersCount;
    int postsCount;
    int commentsCount;
    double averagePostsPerUser;
    double averageCommentsPerUser;
    double averageCommentsPerPost;

    public void calculateAdvStatistics(Statistics statistics) {
        this.usersCount = statistics.userNames().size();
        this.postsCount = statistics.postsCount();
        this.commentsCount = statistics.commentsCount();
        if (statistics.userNames().size()==0) {
            this.averagePostsPerUser = 0;
            this.averageCommentsPerUser = 0;
        } else {
            this.averagePostsPerUser = (double)statistics.postsCount() / (double)statistics.userNames().size();
            this.averageCommentsPerUser = (double)statistics.commentsCount() / (double)statistics.userNames().size();
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
