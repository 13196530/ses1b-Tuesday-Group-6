package com.example.erest;

public class AdminViewOrderItem {
    private String user;
    private String food;
    private String price;
    private String discount;

    public AdminViewOrderItem() {
    }

    public AdminViewOrderItem(String user, String food,String price) {
        this.user = user;
        this.food = food;
        this.price = price;

    }

    public void setUser(String user) {
        this.user = user;
    }

    public void setFood(String food) { this.food = food; }

    public void setPrice(String price) {
        this.price=price;
    }

    public String getUser() {
        return user;
    }

    public String getFood() { return food; }

    public String getPrice() {
        return price;
    }

    public String getDiscount() {
        return discount;
    }

    public void setDiscount(String discount) {
        this.discount = discount;
    }
}

