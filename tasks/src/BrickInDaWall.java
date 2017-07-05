/**
 * Created by alexei.yakushyn on 7/3/17.
 */
public class BrickInDaWall {
    private double x;
    private double y;
    private double z;
    private double d;
    private int count = 0; // count retroduces how many times brick'll path the hole.

    public BrickInDaWall(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public String solution(double x, double y, double z, double d) {
        double xy = Math.sqrt(x * x + y * y);
        double xz = Math.sqrt(x * x + z * z);
        double yz = Math.sqrt(y * y + z * z);

        if (xy < d) {
            count++;
        }
        if (xz < d) {
            count++;
        }
        if (yz < d) {
            count++;
        }
        if (!(xy < d) && !(xz < d) && !(yz < d)) {
            return "Brick doesn't path the hole.";
        }

        return "Brick path hole with " + count + " edges.";
    }
}
