package com.kce.main;

import java.util.Scanner;

import com.kce.dao.ProductDAO;
import com.kce.entity.Product;

public class MainApp {
	public static void main(String[] args) {
		ProductDAO productDAO = new ProductDAO();
		Scanner scanner = new Scanner(System.in);
		int choice;

		do {
			System.out.println("\n=== Product Management System ===");
			System.out.println("1. Add Product");
			System.out.println("2. View Products");
			System.out.println("3. Update Product");
			System.out.println("4. Delete Product");
			System.out.println("5. Exit");
			System.out.print("Enter your choice: ");
			choice = scanner.nextInt();
			scanner.nextLine(); // Consume newline

			switch (choice) {
			case 1:
				// Add Product
				Product product = new Product();
				System.out.print("Enter Product Name: ");
				product.setName(scanner.nextLine());
				System.out.print("Enter Product Price: ");
				product.setPrice(scanner.nextDouble());
				System.out.print("Enter Product Quantity: ");
				product.setQuantity(scanner.nextInt());
				productDAO.saveProduct(product);
				System.out.println("Product added successfully!");
				break;

			case 2:
				// View Products
				System.out.println("\n=== Product List ===");
				System.out.println(productDAO.getProducts());
				break;

			case 3:
				// Update Product
				System.out.print("Enter Product ID to Update: ");
				int updateId = scanner.nextInt();
				scanner.nextLine(); // Consume newline
				Product updateProduct = new Product();
				updateProduct.setId(updateId);
				System.out.print("Enter New Name: ");
				updateProduct.setName(scanner.nextLine());
				System.out.print("Enter New Price: ");
				updateProduct.setPrice(scanner.nextDouble());
				System.out.print("Enter New Quantity: ");
				updateProduct.setQuantity(scanner.nextInt());
				productDAO.updateProduct(updateProduct);
				System.out.println("Product updated successfully!");
				break;

			case 4:
				// Delete Product
				System.out.print("Enter Product ID to Delete: ");
				int deleteId = scanner.nextInt();
				productDAO.deleteProduct(deleteId);
				break;

			case 5:
				System.out.println("Exiting...");
				break;

			default:
				System.out.println("Invalid choice! Please try again.");
			}
		} while (choice != 5);

		scanner.close();
	}
}
