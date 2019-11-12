package com.kodilla.spring.portfolio;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BoardTestSuite {
    @Test
    public void testTaskAdd() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);
        //When
        board.getToDoList().getTasks().add("to do");
        board.getInProgressList().getTasks().add("in progress");
        board.getDoneList().getTasks().add("done");
        //Then
        System.out.println(board.getToDoList().getTasks());
        System.out.println(board.getInProgressList().getTasks());
        System.out.println(board.getDoneList().getTasks());
    }
}
