public class Pangkat implements MathExpression {
    private int x;
    private int y;

    public Pangkat(int x, int y) {
        super();
        this.x = x;
        this.y = y;
    }

    @Override
    public void display() {
        int pangkat = (int) Math.pow(x, y);
        System.out.println(pangkat);


    }


}