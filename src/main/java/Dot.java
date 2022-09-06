import java.util.Scanner;

public class Dot implements Comparable<Dot>{
    private double x;
    private double y;
    static final public double max = 799;
    static final public double min = 0;

    public Dot() {
        this.x = 0;
        this.y = 0;
    }

    public Dot(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void setX(double value) {
        if(min <= value && value <= max) {
            this.x = value;
        }
        else {
            System.out.println("X value must be between " + min + " and " + max + ".");
        }
    }

    public void setY(double value) {
        if(min <= value && value <= max) {
            this.y = value;
        }
        else {
            System.out.println("Y value must be between " + min + " and " + max + ".");
        }
    }

    public double getX() {
        return this.x;
    }

    public double getY() {
        return this.y;
    }

    public void setXFromConsole() {
        Scanner input = new Scanner(System.in);
        double x;
        boolean flag = false;
        while(!flag) {
            try {
                System.out.println("Enter x value (0-799): ");
                x = input.nextDouble();
                if(0 <= x && x <= 799) {
                    this.setX(x);
                    input.close();
                    flag = true;
                }
                else {
                    System.out.println("X value must be between 0 and 799.");
                    input.next();
                }
            }
            catch (Exception e) {
                System.out.println("Error: " + e + ".");
                input.next();
            }
        }
    }

    public void setYFromConsole() {
        Scanner input = new Scanner(System.in);
        double x;
        boolean flag = false;
        while(!flag) {
            try {
                System.out.println("Enter x value (0-799): ");
                x = input.nextDouble();
                if(0 <= x && x <= 799) {
                    this.setX(x);
                    input.close();
                    flag = true;
                }
                else {
                    System.out.println("X value must be between 0 and 799.");
                    input.next();
                }
            }
            catch (Exception e) {
                System.out.println("Error: " + e + ".");
                input.next();
            }
        }
    }

    @Override
    public String toString() {
        return "Dot (x=" + this.x + ", y=" + this.y + ")";
    }

    public void print() {
        System.out.println(
                "Dot (x=" + this.x + ", y=" + this.y + ")"
        );
    }

    @Override
    public int compareTo(Dot o) {
        if(this.x == o.getX()) {
            return 0;
        }
        else if(this.x < o.getX()) {
            return -1;
        }
        else {
            return 1;
        }
    }
}
