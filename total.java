/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project_no1;

/**
 *
 * @author User
 */
public class total {
    private int seat;
    private int price;
    private int sum;
    
    public total(){
        this(0,0,0);
    }
    public total(int seat, int price, int sum){
        this.seat = seat;
        this.price = price;
        this.sum = sum;
    }
    
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
