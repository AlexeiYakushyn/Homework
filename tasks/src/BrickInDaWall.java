/**
 * Created by alexei.yakushyn on 7/3/17.
 */
public class BrickInDaWall {
    private double x;
    private double y;
    private double z;
    private double d;
    private double xy;
    private double xz;
    private double yz;

    public BrickInDaWall(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
        double xy = Math.sqrt(x * x + y * y);
        double xz = Math.sqrt(x * x + z * z);
        double yz = Math.sqrt(y * y + z * z);
    }

   /* public BrickInDaWall(double d) {
        this.d = d;
    }*/

    public double setDiameter(double d) {
        return this.d;
    }

    public String solution(double d) {
        this.d = d;

        if ((this.xy <= d) && (this.yz <= d) && (this.xz <= d)) {
            return "Another brick in the wall!";
        } else {
            return "Wrong holl jackass)))";
        }
    }
}
