package br.estudos.com.POO.LojaSimples;

public class Product {
    public String name;
    public int quantity;
    public  double price;

    public double totalValueInStock(){
        return quantity * price;
    }
    public void addProducts(int quantity){
        this.quantity += quantity;
    }
    public void removeProducts(int quantity){
        this.quantity -= quantity;
    }

    @Override
    public String toString() {
        return "Product{" + "name = " + name + ", quantity = "+ quantity + ", price = " + String.format("%.2f ",price )  + '}';
    }
}
