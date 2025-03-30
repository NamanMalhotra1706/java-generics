package com.bridgelabz.javagenrics.warehouse;

public class SmartWareHouse {
    public static void main(String[] args) {
        Storage<Electronics> electronicsStorage = new Storage<>();
        Storage<Groceries> groceriesStorage = new Storage<>();
        Storage<Furniture> furnitureStorage = new Storage<>();

        electronicsStorage.addItem(new Electronics("Laptop", 1200.00));
        electronicsStorage.addItem(new Electronics("Smartphone", 800.00));

        groceriesStorage.addItem(new Groceries("Apple", 1.50));
        groceriesStorage.addItem(new Groceries("Milk", 2.00));

        furnitureStorage.addItem(new Furniture("Chair", 75.00));
        furnitureStorage.addItem(new Furniture("Table", 150.00));

        System.out.println("Electronics:");
        WarehouseUtils.displayItems(electronicsStorage.getItems());

        System.out.println("\nGroceries:");
        WarehouseUtils.displayItems(groceriesStorage.getItems());

        System.out.println("\nFurniture:");
        WarehouseUtils.displayItems(furnitureStorage.getItems());
    }
}
