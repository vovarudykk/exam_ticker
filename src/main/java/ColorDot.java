import java.util.Arrays;

public class ColorDot extends Dot{
    private int[] rgb;

    public ColorDot() {
        super();
        this.rgb = new int [3];
    }

    public ColorDot(double x, double y, int[] rgb) {
        super(x, y);
        this.rgb = rgb;
    }

    public void setRGB(int a, int b, int c) throws OutOfRangeValueException {
        int[] temp = new int[3];
        temp[0] = setColor(a);
        temp[1] = setColor(b);
        temp[2] = setColor(c);
        this.rgb = temp;
    }

    public int[] getRGB() {
        return this.rgb;
    }

    public boolean checkRange(int value) {
        return 0 <= value && value <= 255;
    }

    private int setColor(int value) throws OutOfRangeValueException {
        if(checkRange(value)) {
            return value;
        }
        else {
            throw new OutOfRangeValueException("Value in color must be between 0 and 255.");
        }
    }

    public static ColorDot concat(ColorDot dot1, ColorDot dot2) throws OutOfRangeValueException {
        ColorDot newDot = new ColorDot();
        double sumX = dot1.getX()+ dot2.getX();
        double sumY = dot1.getY()+ dot2.getY();

        if(sumX <= max) {
            newDot.setX(sumX);
        }
        else {
            newDot.setX(-1*(max - sumX));
        }

        if(sumY <= max) {
            newDot.setY(sumY);
        }
        else {
            newDot.setY(-1*(max - sumY));
        }

        int a, b, c;
        a = (dot1.getRGB()[0] + dot2.getRGB()[0]) /2;
        b = (dot1.getRGB()[1] + dot2.getRGB()[1]) /2;
        c = (dot1.getRGB()[2] + dot2.getRGB()[2]) /2;

        newDot.setRGB(a, b, c);

        return newDot;
    }

    @Override
    public String toString() {
        return "Dot (x=" + getX() + ", y=" + getY() +
                "), color=rgb(" +
                this.rgb[0] + ", " +
                this.rgb[1] + ", " +
                this.rgb[2]
                + ");";
    }

    @Override
    public void print() {
        System.out.println(
                "Dot (x=" + getX() + ", y=" + getY() +
                        "), color=rgb(" +
                            this.rgb[0] + ", " +
                            this.rgb[1] + ", " +
                            this.rgb[2]
                        + ");"
        );
    }
}
