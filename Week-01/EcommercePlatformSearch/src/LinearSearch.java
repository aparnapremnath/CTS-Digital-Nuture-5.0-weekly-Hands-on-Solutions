public class LinearSearch {

    public static Product search(Product[] products, int targetId) {
        System.out.println("\n[Linear Search] Searching for Product ID: " + targetId);

        for (int i = 0; i < products.length; i++) {
            System.out.println("  Checking index " + i + 
                               " → ID: " + products[i].productId);

            if (products[i].productId == targetId) {
                System.out.println("   Found at index " + i);
                return products[i];
            }
        }

        System.out.println("   Product not found.");
        return null;
    }
}