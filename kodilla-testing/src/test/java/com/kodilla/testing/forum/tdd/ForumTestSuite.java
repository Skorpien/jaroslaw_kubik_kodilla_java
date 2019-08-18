package com.kodilla.testing.forum.tdd;

import com.kodilla.testing.forum.ForumComment;
import com.kodilla.testing.forum.ForumPost;
import com.kodilla.testing.forum.ForumUser;
import org.junit.*;

// Test suite for classes of Forum
public class ForumTestSuite {
    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests");
    }
    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished");
    }
    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Test
    public void testAddPost() {
        //Given
        ForumUser forumUser = new ForumUser("mrminister", "Ed de Goey");
        //When
        forumUser.addPost("mrminister", "Hey, hi, hello");
        //Then
        Assert.assertEquals(1, forumUser.getPostsQuantity());
    }
    @Test
    public void testAddComment() {
        //Given
        ForumUser forumUser = new ForumUser("mrminister", "Ed de Goey");
        ForumPost thePost = new ForumPost("Hey," + "hi, hello!", "mrminister");
        //When
        forumUser.addComment(thePost, "mrminister", "Thank you!");
        //Then
        Assert.assertEquals(1, forumUser.getCommentQuantity());
    }
    @Test
    public void testGetPost() {
        //Given
        ForumUser forumUser = new ForumUser("mrminister", "Ed de Goey");
        ForumPost thePost = new ForumPost("Hey," + "hi, hello!", "mrminister");
        forumUser.addPost(thePost.getAuthor(), thePost.getPostBody());
        //When
        ForumPost retrievePost;
        retrievePost = forumUser.getPost(0);
        //Then
        Assert.assertEquals(thePost, retrievePost);
    }
    @Test
    public void testGetComment() {
        //Given
        ForumUser forumUser = new ForumUser("mrminister", "Ed de Goey");
        ForumPost thePost = new ForumPost("Hey," + "hi, hello!", "mrminister");
        ForumComment theComment = new ForumComment(thePost,"mrminister", "Thank you!");
        forumUser.addComment(thePost, theComment.getAuthor(), theComment.getCommentBody());
        //When
        ForumComment retrieveComment = forumUser.getComment(0);
        //Then
        Assert.assertEquals(theComment, retrieveComment);
    }
    @Test
    public void testRemovePostNotExisting() {
        //Given
        ForumUser forumUser = new ForumUser("mrminister", "Ed de Goey");
        ForumPost thePost = new ForumPost("Hey," + "hi, hello!", "mrminister");
        //When
        boolean result = forumUser.removePost(thePost);
        //Then
        Assert.assertFalse(result);
    }
    @Test
    public void testRemoveCommentNotExisting() {
        //Given
        ForumUser forumUser = new ForumUser("mrminister", "Ed de Goey");
        ForumPost thePost = new ForumPost("Hey," + "hi, hello!", "mrminister");
        ForumComment theComment = new ForumComment(thePost,"mrminister", "Thank you!");
        //When
        boolean result = forumUser.removeComment(theComment);
        //Then
        Assert.assertFalse(result);
    }
    @Test
    public void testRemovePost() {
        //Given
        ForumUser forumUser = new ForumUser("mrminister", "Ed de Goey");
        ForumPost thePost = new ForumPost("Hey," + "hi, hello!", "mrminister");
        forumUser.addPost(thePost.getAuthor(), thePost.getPostBody());
        //When
        boolean result = forumUser.removePost(thePost);
        //Then
        Assert.assertTrue(result);
        Assert.assertEquals(0, forumUser.getPostsQuantity());
    }
    @Test
    public void testRemoveComment() {
        //Given
        ForumUser forumUser = new ForumUser("mrminister", "Ed de Goey");
        ForumPost thePost = new ForumPost("Hey," + "hi, hello!", "mrminister");
        ForumComment theComment = new ForumComment(thePost,"mrminister", "Thank you!");
        forumUser.addComment(thePost, theComment.getAuthor(), theComment.getCommentBody());
        //When
        boolean result = forumUser.removeComment(theComment);
        //Then
        Assert.assertTrue(result);
        Assert.assertEquals(0, forumUser.getCommentQuantity());
    }

}
