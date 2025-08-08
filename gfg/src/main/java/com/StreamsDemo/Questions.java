package main.java.com.StreamsDemo;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.Comparator;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;

public class Questions {

    public static List<Product> getProducts() {
        return Arrays.asList(
            new Product("Laptop", "Electronics", 1200.00, 5, true),
            new Product("Mouse", "Electronics", 25.00, 20, true),
            new Product("Keyboard", "Electronics", 75.00, 10, false),
            new Product("Desk Chair", "Furniture", 150.00, 3, true),
            new Product("Monitor", "Electronics", 300.00, 7, true),
            new Product("Table Lamp", "Home Decor", 40.00, 15, true),
            new Product("Coffee Table", "Furniture", 80.00, 2, false),
            new Product("Smartphone", "Electronics", 800.00, 8, true),
            new Product("Headphones", "Electronics", 100.00, 12, true),
            new Product("Bookshelf", "Furniture", 200.00, 4, true),
            new Product("Blender", "Kitchen", 60.00, 6, true),
            new Product("Toaster", "Kitchen", 30.00, 9, false),
            new Product("Sofa", "Furniture", 700.00, 1, true)
        );
    }

    public static void main(String[] args) {
        List<Product> products = getProducts();
        String[] names = {"Sam", "John", "Jane", "Jim", "Jill", "Jack", "Jill", "Jim", "Jane", "John", "Sam"};
        // HashMap<String,Integer> nameCount = Arrays.stream(names).collect(Collectors.groupingBy(n -> n, Collectors.counting()));
        Map<String,Long> nameCount = Arrays.stream(names).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(nameCount);


        // 1. Filter by Category:
        // filter by category
        List<Product> electronicsList = products.stream().filter(p -> p.getCategory().equals("Electronics")).collect(Collectors.toList());
        System.out.println(electronicsList);
        
        // Filter in stock
        List<Product> inStockItems = products.stream().filter(x -> x.isInStock()).collect(Collectors.toList());
        System.out.println(inStockItems);

        //Map Product Names
        List<String> productNames = products.stream().map(p -> p.getName()).collect(Collectors.toList());
        System.out.println(productNames);

        // Count Electronics
        Long count = products.stream().filter(x->x.getCategory().equals("Electronics")).count();
        System.out.println(count);
        
        // Calculate Total Price
        Double sum = 0.0;
        sum = products.stream().map(p -> p.getPrice() * p.getQuantity()).reduce(0.0, (a,b) -> a+b);
        System.out.println(sum);

        // Cheapest Product in stock
        Optional<Product> cheapesProduct = products.stream().filter(x -> x.isInStock()).min((p1,p2) -> (int)(p1.getPrice() - p2.getPrice()));
        System.out.println(cheapesProduct);

        // Check Any In Stock
        Boolean isStock = products.stream().anyMatch(p-> p.isInStock());
        System.out.println(isStock);

        // Check All In Stock (Electronics):
        Boolean allInStock = products.stream().allMatch(p-> p.isInStock());
        System.out.println(allInStock);

        // Display Product Details: Print the name and price of each product.
        products.stream().forEach( p -> System.out.println(p.getName() + " " + p.getPrice()));
        
        // Products with Price > X: Get a list of product names whose price is greater than $100.
        List<String> filteredProductNames = products.stream().filter(p-> p.getPrice() > 100).map(p-> p.getName()).collect(Collectors.toList());
        System.out.println(filteredProductNames);

        //Sort by Price: Get a list of all products sorted by their price in ascending order.
        List<Product> sortedProducts = products.stream().sorted(Comparator.comparingDouble(Product::getPrice)).collect(Collectors.toList());
        System.out.println(sortedProducts);

        // Sort by Quantity (Descending): Get a list of products sorted by quantity in descending order.
        List<Product> sortedOnQuantity = products.stream().sorted((p1,p2) -> p2.getQuantity() - p1.getQuantity()).collect(Collectors.toList());
        // List<Product> sortedOnQuantity = products.stream()
        // .sorted(Comparator.comparingInt(Product::getQuantity).reversed())
        // .collect(Collectors.toList());
        System.out.println(sortedOnQuantity);

        // Group by Category: Create a Map where keys are product categories and values are lists of products belonging to that category.
        Map<String,List<Product>> categoryMap = products.stream().collect(Collectors.groupingBy(p -> p.getCategory()));
        System.out.println(categoryMap);

        // Average Price by Category:
        Map<String, Double> averagePriceByCategory = products.stream().collect(Collectors.groupingBy(Product::getCategory, Collectors.averagingDouble(Product::getPrice)));
        System.out.println(averagePriceByCategory);
        
        //Expensive Products (Set): Get a Set of names of products that cost more than $500.
        Set<String> expensiveProducts = products.stream().filter(p -> p.getPrice() > 500.0).map( p -> p.getName()).collect(Collectors.toSet());
        System.out.println(expensiveProducts);

        // Find the most expensive product in each category:
        Map<String, Optional<Product>> expensiveProductInCategory = products.stream().collect(Collectors.groupingBy(Product::getCategory,Collectors.maxBy(Comparator.comparingDouble(Product::getPrice))));
        System.out.println(expensiveProductInCategory);
    
        // Concatenate Product Names: Create a single string containing all product names, separated by commas.
        String allProductNames = products.stream().map(p -> p.getName()).collect(Collectors.joining(","));
        System.out.println(allProductNames);


        // Total Quantity per Category (In Stock): Calculate the total quantity of in-stock products for each category. Return a Map<String, Integer>.
        Map<String,Integer> tatalQuantityInStock = products.stream().filter(Product::isInStock).collect(Collectors.groupingBy(Product::getCategory,Collectors.summingInt(Product::getQuantity)));
        System.out.println(tatalQuantityInStock);

        // Products with Low Quantity (<= 5) and In Stock: Get a list of names of products that are in stock and have a quantity of 5 or less.
        List<String> lowQuantityProducts = products.stream().filter(Product::isInStock).filter(p -> p.getQuantity() <=5 ).map(p -> p.getName()).collect(Collectors.toList());
        System.out.println(lowQuantityProducts);


    }


}

    class Product {
        private String name;
        private String category;
        private double price;
        private int quantity;
        private boolean inStock;
    
        public Product(String name, String category, double price, int quantity, boolean inStock) {
            this.name = name;
            this.category = category;
            this.price = price;
            this.quantity = quantity;
            this.inStock = inStock;
        }
    
        // Getters
        public String getName() { return name; }
        public String getCategory() { return category; }
        public double getPrice() { return price; }
        public int getQuantity() { return quantity; }
        public boolean isInStock() { return inStock; }
    
        // Setters (if needed for modification, but streams are generally immutable)
        public void setQuantity(int quantity) { this.quantity = quantity; }
        public void setInStock(boolean inStock) { this.inStock = inStock; }
    
        @Override
        public String toString() {
            return "Product{" +
                   "name='" + name + '\'' +
                   ", category='" + category + '\'' +
                   ", price=" + price +
                   ", quantity=" + quantity +
                   ", inStock=" + inStock +
                   '}';
        }
    
        @Override
        
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Product product = (Product) o;
            return Double.compare(product.price, price) == 0 &&
                   quantity == product.quantity &&
                   inStock == product.inStock &&
                   Objects.equals(name, product.name) &&
                   Objects.equals(category, product.category);
        }
    
        @Override
        public int hashCode() {
            return Objects.hash(name, category, price, quantity, inStock);
        }
    }


