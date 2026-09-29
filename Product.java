package OExercise7;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public abstract class Product implements IProduct {

    private String id;
    private double basePrice;
    private Date importDate;
    private boolean isAvailable;
    private int quantity;

    Scanner sc = new Scanner(System.in);
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public Product() {
    }

    public Product(String id, double basePrice, Date importDate, boolean isAvailable, int quantity) {
        this.id = id;
        this.basePrice = basePrice;
        this.importDate = importDate;
        this.isAvailable = isAvailable;
        this.quantity = quantity;
    }

    public String getId() {
        return id;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public Date getImportDate() {
        return importDate;
    }

    public boolean isIsAvailable() {
        return isAvailable;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setBasePrice(double basePrice) {
        this.basePrice = basePrice;
    }

    public void setImportDate(Date importDate) {
        this.importDate = importDate;
    }

    public void setIsAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public void addProduct() {
        System.out.print("Enter id:");
        setId(sc.nextLine());
        System.out.print("Enter base price: ");
        setBasePrice(sc.nextDouble());
        sc.nextLine();
        System.out.print("Enter import date: ");
        String dateString = sc.nextLine();
        try {
            setImportDate(sdf.parse(dateString));
        } catch (ParseException ex) {
            System.out.println("Ivalid date!");
        }
        System.out.print("Enter is available: ");
        setIsAvailable(sc.nextBoolean());
        sc.nextLine();
        System.out.print("Enter quantity: ");
        setQuantity(sc.nextInt());
    }

    @Override
    public void updateProduct() {
        System.out.print("Enter base price: ");
        setBasePrice(sc.nextDouble());
        sc.nextLine();
        System.out.print("Enter import date: ");
        String dateString = sc.nextLine();
        try {
            setImportDate(sdf.parse(dateString));
        } catch (ParseException ex) {
            System.out.println("Ivalid date!");
        }
        System.out.print("Enter is available: ");
        setIsAvailable(sc.nextBoolean());
        sc.nextLine();
        System.out.print("Enter quantity: ");
        setQuantity(sc.nextInt());
    }

    @Override
    public void displayDetails() {
        System.out.println("Id: " + getId());
        System.out.println("Base price: " + getBasePrice());
        System.out.println("Import date: " + sdf.format(importDate));
        System.out.println("Is available: " + isIsAvailable());
        System.out.println("Quantity: " + getQuantity());
    }

}
