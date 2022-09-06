package code_from_uml;

public class Tile {
    private double height;
    private double width;

    Tile(double height, double width) {
        this.height = height;
        this.width = width;
    }

    protected double area() {
        return 0;
    }
}
