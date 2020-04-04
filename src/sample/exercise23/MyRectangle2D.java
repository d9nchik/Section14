package sample.exercise23;

import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class MyRectangle2D extends Pane {
    private double x, y;
    private double widthOfRectangle, heightOfRectangle;

    public MyRectangle2D(double x, double y, double widthOfRectangle, double heightOfRectangle) {
        this.x = x;
        this.y = y;
        this.widthOfRectangle = widthOfRectangle;
        this.heightOfRectangle = heightOfRectangle;
        draw();
    }

    public MyRectangle2D() {
        this(0, 0, 1, 1);
        draw();
    }

    private void draw() {
        Rectangle rectangle = new Rectangle(x - widthOfRectangle / 2, y - heightOfRectangle / 2,
                widthOfRectangle, heightOfRectangle);
        rectangle.setFill(null);
        rectangle.setStroke(Color.BLACK);
        getChildren().add(rectangle);
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
        draw();
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
        draw();
    }

    public double getWidthOfRectangle() {
        return widthOfRectangle;
    }

    public void setWidthOfRectangle(double widthOfRectangle) {
        this.widthOfRectangle = widthOfRectangle;
        draw();
    }

    public double getHeightOfRectangle() {
        return heightOfRectangle;
    }

    public void setHeightOfRectangle(double heightOfRectangle) {
        this.heightOfRectangle = heightOfRectangle;
        draw();
    }

    public double getArea() {
        return widthOfRectangle * heightOfRectangle;
    }

    public double getPerimeter() {
        return 2 * (widthOfRectangle + heightOfRectangle);
    }

    public boolean contains(double x, double y) {
        return (this.x - this.widthOfRectangle / 2 < x && x < this.x + this.widthOfRectangle / 2) && (this.y - this.heightOfRectangle / 2 < y && y < this.y + this.heightOfRectangle / 2);
    }

    public boolean contains(MyRectangle2D r) {
        return (this.x - this.widthOfRectangle / 2 < r.x && x < this.x + this.widthOfRectangle / 2) && (this.y - this.heightOfRectangle / 2 < r.y && r.y < this.y + this.heightOfRectangle / 2) && !overlaps(r);
    }

    public boolean overlaps(MyRectangle2D r) {
        return (r.y + r.heightOfRectangle / 2 > y + heightOfRectangle / 2 && y + heightOfRectangle / 2 > r.y - r.heightOfRectangle / 2
                || r.y + r.heightOfRectangle / 2 > y - heightOfRectangle / 2 && y - heightOfRectangle / 2 > r.y - r.heightOfRectangle / 2
                || r.x - r.widthOfRectangle / 2 < x - widthOfRectangle / 2 && r.x + r.widthOfRectangle / 2 > x - widthOfRectangle / 2
                || r.x - r.widthOfRectangle / 2 < x + widthOfRectangle / 2 && r.x + r.widthOfRectangle / 2 > x + widthOfRectangle / 2);
    }
}
