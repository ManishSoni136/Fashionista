package com.example.fashionista.Men;

public class FormalTopItem {
    String ImageUrl, ItemName, Stock;

    public FormalTopItem(String imageUrl, String itemName, String stock) {
        ImageUrl = imageUrl;
        ItemName = itemName;
        Stock = stock;
    }

    public String getImageUrl() {
        return ImageUrl;
    }

    public String getItemName() {
        return ItemName;
    }

    public String getStock() {
        return Stock;
    }
}
