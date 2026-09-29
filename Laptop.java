package OExercise7;

import java.util.Date;
import java.util.Scanner;

public class Laptop extends Product {

    private int warrantyYears;
    private double discountPercent;

    Scanner sc = new Scanner(System.in);

    public Laptop() {
    }

    public Laptop(int quarrantyYears, double discountPercent, String id, double basePrice, Date importDate, boolean isAvailable, int quantity) {
        super(id, basePrice, importDate, isAvailable, quantity);
        this.warrantyYears = quarrantyYears;
        this.discountPercent = discountPercent;
    }

    public int getQuarrantyYears() {
        return warrantyYears;
    }

    public double getDiscountPercent() {
        return discountPercent;
    }

    public void setQuarrantyYears(int quarrantyYears) {
        this.warrantyYears = quarrantyYears;
    }

    public void setDiscountPercent(double discountPercent) {
        this.discountPercent = discountPercent;
    }

    @Override
    public void addProduct() {
        super.addProduct();
        System.out.print("Enter Quarranty Years: ");
        setQuarrantyYears(sc.nextInt());
        sc.nextLine();
        System.out.print("Enter discount percent: ");
        setDiscountPercent(sc.nextDouble());
        sc.nextLine();
    }

    @Override
    public void updateProduct() {
        super.updateProduct();
        System.out.print("Enter Quarranty Years: ");
        setQuarrantyYears(sc.nextInt());
        sc.nextLine();
        System.out.print("Enter discount percent: ");
        setDiscountPercent(sc.nextDouble());
        sc.nextLine();
    }

    @Override
    public double calculatePrice() {
        double warrantyFee = 0;
        if (getQuarrantyYears() >= 3) {
            warrantyFee = getBasePrice() * 0.08;
        } else {
            warrantyFee = getBasePrice() * 0.03;
        }
        return (getBasePrice() + warrantyFee) * (1 - getDiscountPercent() / 100);
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Warranry years: " + getQuarrantyYears());
        System.out.println("Discount Percent: " + getDiscountPercent());
        System.out.println("Price: " + calculatePrice());
    }
}
