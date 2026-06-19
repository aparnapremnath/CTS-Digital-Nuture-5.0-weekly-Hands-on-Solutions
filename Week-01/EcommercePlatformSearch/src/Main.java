public class Main {
    public static void main(String[] args) {

        Product[] productsLinear = {
            new Product(103, "Laptop",      "Electronics"),
            new Product(101, "Phone",       "Electronics"),
            new Product(105, "Shoes",       "Fashion"),
            new Product(102, "Headphones",  "Electronics"),
            new Product(104, "T-Shirt",     "Fashion")
        };

        Product[] productsBinary = {
            new Product(101, "Phone",       "Electronics"),
            new Product(102, "Headphones",  "Electronics"),
            new Product(103, "Laptop",      "Electronics"),
            new Product(104, "T-Shirt",     "Fashion"),
            new Product(105, "Shoes",       "Fashion")
        };

        System.out.println("========== LINEAR SEARCH ==========");
        Product result1 = LinearSearch.search(productsLinear, 104);
        if (result1 != null) result1.display();

        Product result2 = LinearSearch.search(productsLinear, 999);
        if (result2 != null) result2.display();

        System.out.println("\n========== BINARY SEARCH ==========");
        Product result3 = BinarySearch.search(productsBinary, 104);
        if (result3 != null) result3.display();

        Product result4 = BinarySearch.search(productsBinary, 999);
        if (result4 != null) result4.display();

        System.out.println("\n========== ANALYSIS SUMMARY ==========");
        System.out.println("Linear Search -> O(n)     | Works on unsorted data");
        System.out.println("Binary Search -> O(log n) | Requires sorted data");
        System.out.println("Binary Search is faster for large e-commerce catalogs.");
    }
}