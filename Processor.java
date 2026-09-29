package OExercise7;

import java.util.Scanner;

public class Processor {

    public static void main(String[] args) {
        ProductArrayList productList = new ProductArrayList();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\n =============MENU==============");
            System.out.println("1- Add a laptop or smartphone");
            System.out.println("2- Update a probuct by id");
            System.out.println("3- Delete a product by id");
            System.out.println("4- Display all");
            System.out.println("5- Display product available");
            System.out.println("6- Display highest price");
            System.out.println("0- Exit the program");
            System.out.print("Choose: ");
            int choose = sc.nextInt();
            sc.nextLine();
            switch (choose) {
                case 1:
                    System.out.print("entter 1- add laptop/ 2- add smartphone: ");
                    int choice = sc.nextInt();
                    sc.nextLine();
                    if (choice == 1) {
                        Laptop l = new Laptop();
                        l.addProduct();
                        productList.addProductToArrayList(l);
                    } else if (choice == 2) {
                        Smartphone s = new Smartphone();
                        s.addProduct();
                        productList.addProductToArrayList(s);
                    }
                    break;
                case 2:
                    System.out.print("Enter id to update: ");
                    String idUp = sc.nextLine();
                    productList.updateProductById(idUp);
                    break;
                case 3:
                    System.out.print("Enter id to delete: ");
                    String idDel = sc.nextLine();
                    productList.deleteProductById(idDel);
                    break;
                case 4:
                    System.out.println("Display all");
                    productList.displayAllProducts();
                    break;
                case 5:
                    productList.displayAvailableProducts();
                    break;
                case 6:
                    System.out.println("Highest price: "+productList.findHighestPrice());
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Wrong choice!");
            }
        }
    }
}
