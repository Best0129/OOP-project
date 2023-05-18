
public abstract class Total implements Summation {
    public static int seat;
    public static int price;
    public static int sum;

    public Total(){
        this(0,0,0);
    }
    public Total(int seat, int price, int sum){
        this.seat = seat;
        this.price = price;
        this.sum = sum;
    }

    public abstract void sum_price();

    public void setSeat(int seat){
        this.seat = seat;
    }
    public int seat(){
        return seat;
    }
    public void setPrice(int price){
        this.price = price;
    }
    public int getPrice(){
        return price;
    }
    public void setSum(int sum){
        this.sum = sum;
    }
    public int getSum(){
        return sum;
    }
}