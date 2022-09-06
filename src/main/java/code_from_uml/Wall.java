package code_from_uml;

public class Wall  extends Tile{
    private String id;

    Wall(String id, double height, double width) {
        super(height, width);
        this.id = id;
    }

    @Override
    public double area() {
        return 0;
    }
}
