package com.kodilla.testing.forum.statistics;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class CalculatingStatisticsTestSuite {

    @Test
    public void testAveragePosts0Users0WithMock() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> users = new ArrayList<String>();
        int posts = 0;
        when(statisticsMock.userNames()).thenReturn(users);
        when(statisticsMock.postsCount()).thenReturn(posts);

        CalculatingStatistics calculatingStatistics = new CalculatingStatistics();

        //When
        calculatingStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertEquals(0, calculatingStatistics.getAveragePostsPerUser(), 0.01);
    }
    @Test
    public void testAveragePosts1000Users0WithMock() {
        Statistics statisticsMock = mock(Statistics.class);
        List<String> users = new ArrayList<String>();
        int posts = 1000;
        when(statisticsMock.userNames()).thenReturn(users);
        when(statisticsMock.postsCount()).thenReturn(posts);

        CalculatingStatistics calculatingStatistics = new CalculatingStatistics();

        //When
        calculatingStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertEquals(0, calculatingStatistics.getAveragePostsPerUser(), 0.01);
    }
    @Test
    public void testAveragePosts0Users100WithMock() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> users = userGenerator(100);
        int posts = 0;
        when(statisticsMock.userNames()).thenReturn(users);
        when(statisticsMock.postsCount()).thenReturn(posts);

        CalculatingStatistics calculatingStatistics = new CalculatingStatistics();

        //When
        calculatingStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertEquals(0, calculatingStatistics.getAveragePostsPerUser(), 0.01);
    }
    @Test
    public void testAveragePosts1000Users100WithMock() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> users = userGenerator(100);
        int posts = 1000;
        when(statisticsMock.userNames()).thenReturn(users);
        when(statisticsMock.postsCount()).thenReturn(posts);

        CalculatingStatistics calculatingStatistics = new CalculatingStatistics();

        //When
        calculatingStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertEquals(10, calculatingStatistics.getAveragePostsPerUser(), 0.01);
    }
    @Test
    public void testAverageComments0Users0WithMock() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> users = new ArrayList<String>();
        int comments = 0;
        when(statisticsMock.userNames()).thenReturn(users);
        when(statisticsMock.commentsCount()).thenReturn(comments);

        CalculatingStatistics calculatingStatistics = new CalculatingStatistics();

        //When
        calculatingStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertEquals(0, calculatingStatistics.getAverageCommentsPerUser(), 0.01);
    }
    @Test
    public void testAverageComments0Users100WithMock() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> users = userGenerator(100);
        int comments = 0;
        when(statisticsMock.userNames()).thenReturn(users);
        when(statisticsMock.commentsCount()).thenReturn(comments);

        CalculatingStatistics calculatingStatistics = new CalculatingStatistics();

        //When
        calculatingStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertEquals(0, calculatingStatistics.getAverageCommentsPerUser(), 0.01);
    }
    @Test
    public void testAverageCommentsMoreThanPostsWithMock() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        int posts = 100;
        int comments = 1000;
        when(statisticsMock.postsCount()).thenReturn(posts);
        when(statisticsMock.commentsCount()).thenReturn(comments);

        CalculatingStatistics calculatingStatistics = new CalculatingStatistics();

        //When
        calculatingStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertEquals(10, calculatingStatistics.getAverageCommentsPerPost(), 0.01);
    }
    @Test
    public void testAverageCommentsLessThanPostsWithMock() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        int posts = 1000;
        int comments = 100;
        when(statisticsMock.postsCount()).thenReturn(posts);
        when(statisticsMock.commentsCount()).thenReturn(comments);

        CalculatingStatistics calculatingStatistics = new CalculatingStatistics();

        //When
        calculatingStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertEquals(0.1, calculatingStatistics.getAverageCommentsPerPost(), 0.01);
    }
    @Test
    public void testShowStatisticsWithMock() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> users = userGenerator(1);
        int posts = 5;
        int comments = 5;
        when(statisticsMock.userNames()).thenReturn(users);
        when(statisticsMock.postsCount()).thenReturn(posts);
        when(statisticsMock.commentsCount()).thenReturn(comments);

        CalculatingStatistics calculatingStatistics = new CalculatingStatistics();

        //When
        calculatingStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertEquals("Average Posts per Users: 5.0\nAverage Comments per Users: 5.0\nAverage Comments per Posts: 1.0", calculatingStatistics.showStatistics());
    }
    private List<String> userGenerator (int numbOfUsers) {
        List<String> listOfUsers = new ArrayList<String>();
        for (int i = 1; i <= numbOfUsers; i++) {
            listOfUsers.add("user" + i);
        }
        return listOfUsers;
    }
}
