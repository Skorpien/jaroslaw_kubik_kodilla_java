package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {
    public ArrayList<Shape> figures = new ArrayList<Shape>();

    public void addFigure(Shape shape) {
        figures.add(shape);
    }
    public boolean removeFigure(Shape shape) {
        boolean result = false;
        if (figures.contains(shape)) {
                figures.remove(shape);
                result = true;
        }
        return result;
    }
    public Shape getFigure(int n) {
        return figures.get(n);
    }
    public String showFigures() {
        String show = "";
        for (Shape fig: figures){
            show = show + (fig.getShapeName() + " " + fig.getField());
        }
        return show;
    }
}
