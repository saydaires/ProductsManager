//package com.mycompany.productsmanager;

import java.util.Scanner;
import java.util.ArrayList;
public class ProductsManager {
    /* In the next commit, remember to add verifications that checks if variables "price" and
    "stockQuantity" are largest than 0.0 and 0, respectvely. */
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        // ArrayList<Product> productArray = new ArrayList(); This instruction issues an warning message
        ArrayList<Product> productArray = new ArrayList<Product>(); // right instruction;
        int closeApp = 0;
        
        do
        {
            System.out.println("\tSHOP PRODUCTS\n\n");
            System.out.println("Select your option:\n1- Add Product");
            System.out.println("2- Remove Product\n3- Search Product\n4- Show All Products");
            System.out.println("0- Close App\nINSERT OPTION --> ");
            int option = scanner.nextInt();
            cleanBuffer(scanner);
            // clean console method;
            
            switch(option)
            {
                case 0:
                    System.out.println("Closing App\nPress <ENTER> to continue");
                    scanner.nextLine();
                    closeApp = 1;
                    break;
                    
                case 1:
                    System.out.println("Name: ");
                    String nameEntered = scanner.nextLine();
                    String name = nameEntered.toUpperCase();
                    System.out.println("Price: ");
                    double price = scanner.nextDouble();
                    System.out.println("Stock Quantity: ");
                    int stockQuantity = scanner.nextInt();
                    cleanBuffer(scanner);
                    Product newProduct = new Product(name, price, stockQuantity); 
                    productArray.add(newProduct);
                    System.out.println("Product was add with success!\nPress <ENTER> to return menu");
                    scanner.nextLine();
                    // clean console method
                    break;
                    
                case 2:
                    if(productArray.isEmpty())
                    {
                        System.out.println("Has not products registered in the System.");
                        System.out.println("Press <ENTER> to return menu");
                        scanner.nextLine();
                        // clean console method
                    }
                    else
                    {
                        System.out.println("Enter NAME product: ");
                        String nameSearchedEntered = scanner.nextLine();
                        String nameSearched = nameSearchedEntered.toUpperCase();
                        int existenceProductVariable = 0;
                       
                        for(int index = 0; index < productArray.size(); index++)
                        {
                            Product product = productArray.get(index);
                            String nameProduct = product.getName();
                            
                            if(nameProduct.equals(nameSearched))
                            {
                                existenceProductVariable = 1;
                                double priceProduct = product.getPrice();
                                int stockQuantityProduct = product.getStockQuantity();
                            
                                System.out.println("\tProduct Informations\n\n");
                                System.out.println("Name: " + nameProduct);
                                System.out.println("Price: $ " + priceProduct);
                                System.out.println("Stock Quantity: " + stockQuantityProduct);
                                System.out.print("Make sure of delete this Product? (1- YES| 0- NO)\n--> ");
                                int optionDelete = scanner.nextInt();
                                cleanBuffer(scanner);
                                
                                if(optionDelete == 1)
                                {
                                    productArray.remove(index);
                                    System.out.println("Product was deleted of the System");
                                    System.out.println("Press <ENTER> to return menu");
                                    scanner.nextLine();
                                    // clean console method
                                    break; // break the for loop
                                }
                                else
                                {
                                    System.out.println("The Delete Operation was aborted");
                                    System.out.println("Press <ENTER> to return menu");
                                    scanner.nextLine();
                                    // clean console method
                                    break; // break the for loop
                                }
                            }
                        }
                        // if this product was not found, those instructions should be executed
                        if(existenceProductVariable == 0)
                        {
                            System.out.println("This product was not found in the System");
                            System.out.println("Press <ENTER> to return menu");
                            scanner.nextLine();        
                        }
                        
                    }
                    break;
                
                case 3:
                     if(productArray.isEmpty())
                    {
                        System.out.println("Has not products registered in the System.");
                        System.out.println("Press <ENTER> to return menu");
                        scanner.nextLine();
                        // clean console method
                    }
                    else
                    {
                        System.out.println("Enter NAME product: ");
                        String nameSearchedEntered = scanner.nextLine();
                        String nameSearched = nameSearchedEntered.toUpperCase();
                        int existenceProductVariable = 0;
                       
                        for(int index = 0; index < productArray.size(); index++)
                        {
                            Product product = productArray.get(index);
                            String nameProduct = product.getName();
                            
                            if(nameProduct.equals(nameSearched))
                            {
                                existenceProductVariable = 1;
                                double priceProduct = product.getPrice();
                                int stockQuantityProduct = product.getStockQuantity();
                            
                                System.out.println("\tProduct Informations\n\n");
                                System.out.println("Name: " + nameProduct);
                                System.out.println("Price: $ " + priceProduct);
                                System.out.println("Stock Quantity: " + stockQuantityProduct);
                                System.out.println("Press <ENTER> to return menu");
                                scanner.nextLine();
                                // clean console method
                                break; // break the for loop
                            }
                        }
                        // if this product was not found, those instructions should be executed
                        if(existenceProductVariable == 0)
                        {
                            System.out.println("This product was not found in the System");
                            System.out.println("Press <ENTER> to return menu");
                            scanner.nextLine();
                            // clean console method
                        }     
                    }
                    break;
                    
                case 4:
                    if(productArray.isEmpty())
                    {
                        System.out.println("Has not products registered in the System.");
                        System.out.println("Press <ENTER> to return menu");
                        scanner.nextLine();
                        // clean console method
                    }
                    else
                    {
                        for(int index = 0; index < productArray.size(); index++)
                        {
                            Product product = productArray.get(index);
                            String nameProduct = product.getName();
                            double priceProduct = product.getPrice();
                            int stockQuantityProduct = product.getStockQuantity();
                            
                            System.out.printf("Product #%d\n", index);
                            System.out.println("Name: " + nameProduct);
                            System.out.println("Price: $ " + priceProduct);
                            System.out.println("Stock Quantity: " + stockQuantityProduct);
                            System.out.println();
                        }
                        System.out.println("Press <ENTER> to return menu");
                        scanner.nextLine();
                        // clean console method
                    }
                    break;
                default:
                    System.out.println("Enter an valid option!");
                    System.out.println("Pess <ENTER> to return menu");
                    scanner.nextLine();
                    // clean console method
            }     
        } while(closeApp != 1);
    }
    
    private static void cleanBuffer(Scanner scanner)
    {
        if(scanner.hasNextLine())
        {
            scanner.nextLine(); // the '\n' in the buffer should be caught
        }
    }
}