package com.kodilla.patterns.factory.tasks;

public class TaskFactory {
    private static final String SHOPPING = "SHOPPING";
    private static final String PAINTING = "PAINTING";
    private static final String DRIVING = "DRIVING";

    public final Task makeTask (final String taskClass) {
        switch (taskClass) {
            case SHOPPING:
                return new ShoppingTask("Shopping task", "potatoes", 10);
            case PAINTING:
                return new PaintingTask("Painting task", "black", "hell");
            case DRIVING:
                return new DrivingTask("Driving task", "Radom", "tank");
            default:
                return null;
        }
    }

    public static String getSHOPPING() {
        return SHOPPING;
    }

    public static String getPAINTING() {
        return PAINTING;
    }

    public static String getDRIVING() {
        return DRIVING;
    }
}
