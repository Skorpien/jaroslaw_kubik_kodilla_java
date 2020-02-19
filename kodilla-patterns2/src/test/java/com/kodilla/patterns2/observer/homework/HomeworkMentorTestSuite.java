package com.kodilla.patterns2.observer.homework;

import org.junit.Test;

import static org.junit.Assert.*;

public class HomeworkMentorTestSuite {
    @Test
    public void testUpdate() {
        //Given
        TaskQueue billClinton = new TaskQueue("Bill Clinton");
        TaskQueue janisJoplin = new TaskQueue("Janis Joplin");
        TaskQueue peterParker = new TaskQueue("Peter Parker");
        Mentor blueMentor = new Mentor("Blue Mentor");
        Mentor redMentor = new Mentor("Red Mentor");
        billClinton.registerObserver(blueMentor);
        janisJoplin.registerObserver(redMentor);
        peterParker.registerObserver(blueMentor);
        peterParker.registerObserver(redMentor);
        //When
        billClinton.addTask("Module 1.2");
        janisJoplin.addTask("Module 2.1");
        peterParker.addTask("Module 1.1");
        janisJoplin.addTask("Module 2.2");
        //Then
        assertEquals(2, blueMentor.getUpdateCount());
        assertEquals(3, redMentor.getUpdateCount());
    }
}
