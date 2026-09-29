package OExercise7;

import java.util.Date;
import java.util.Scanner;

public class Smartphone extends Product {

    private int storageGB;
    private double taxPercent;

    Scanner sc = new Scanner(System.in);

    public Smartphone() {
    }

    public Smartphone(int storageGB, double taxPercent, String id, double basePrice, Date importDate, boolean isAvailable, int quantity) {
        super(id, basePrice, importDate, isAvailable, quantity);
        this.storageGB = storageGB;
        this.taxPercent = taxPercent;
    }

    public int getStorageGB() {
        return storageGB;
    }

    public double getTaxPercent() {
        return taxPercent;
    }

    public void setStorageGB(int storageGB) {
        this.storageGB = storageGB;
    }

    public void setTaxPercent(double taxPercent) {
        this.taxPercent = taxPercent;
    }

    @Override
    public void addProduct() {
        super.addProduct();
        System.out.print("Enter storage gb: ");
        setStorageGB(sc.nextInt());
        sc.nextLine();
        System.out.print("Enter tax percent: ");
        setTaxPercent(sc.nextDouble());
        sc.nextLine();
    }

    @Override
    public void updateProduct() {
        super.updateProduct();
        System.out.print("Enter storage gb: ");
        setStorageGB(sc.nextInt());
        sc.nextLine();
        System.out.print("Enter tax percent: ");
        setTaxPercent(sc.nextDouble());
        sc.nextLine();
    }

    @Override
    public double calculatePrice() {
        double storageFee = 0;
        if (getStorageGB() >= 512) {
            storageFee = getBasePrice() * 0.15;
        } else if (getStorageGB() >= 256) {
            storageFee = getBasePrice() * 0.1;
        } else {
            storageFee = getBasePrice() * 0.05;
        }
        return (getBasePrice() + getStorageGB()) * (1 + getTaxPercent() / 100);
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Storage gb: " + getStorageGB());
        System.out.println("Tax percent: " + getTaxPercent());
        System.out.println("Price: " + calculatePrice());
    }
}
