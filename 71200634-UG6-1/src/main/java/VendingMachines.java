import java.util.ArrayList;

public class VendingMachines {
    private String code;
    private int capacity;
    private int usecapacity;
    private ArrayList<Goods> goods;
    private ArrayList<Double> acceptanceBalance;
    private double consumeMoney;

    public VendingMachines(){

    }
    public VendingMachines(int code, int capacity){
        this.code= String.valueOf(code);
        this.capacity=capacity;
    }
    public VendingMachines(int code, int capacity, Goods goods){
    }

    public void proceedOrder(String goodsCode, int orderQuantity){

    }
    public void takeMoney(double money){

    }
    public void giveGood(double goodPrice, String goodsName){

    }
    public double withdrawMoney(){

        return 0;
    }
    public void inputGoods(Goods good){

    }
}
