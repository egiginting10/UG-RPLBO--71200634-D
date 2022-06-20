public class TriplePythagoras implements MathExpression{

    private int x;
    private int y;
    private int z;

    public TriplePythagoras(int x, int y, int z) {
        super();
        this.z = z;
        this.y = y;
        this.x = x;
    }


    @Override
    public void display() {
        int hasil = (int) Math.sqrt((x*x) + (y*y));
        if(z==hasil) {
            System.out.println("1");
        }
        else {
            System.out.println("-1");
        }

    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }


    public int getY() {
        return y;
    }


    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }


    public void setX(int x) {
        this.x = x;
    }





}