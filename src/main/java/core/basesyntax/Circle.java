package core.basesyntax;

public class Circle extends Figure {
    private int radius;

    public Circle(String color, int radius) {
        super(color);
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(getRadius(), 2);
    }

    @Override
    public void draw() {
        System.out.println("Figure: circle, area: "
                + getArea()
                + " sq.units, radius: "
                + getRadius()
                + " units, color: "
                + getColor());
    }
}