public class BinarySearch {

    public static Product search(Product[] products, int targetId) {
        System.out.println("\n[Binary Search] Searching for Product ID: " + targetId);

        int low = 0;
        int high = products.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            System.out.println("  low=" + low + " mid=" + mid + 
                               " high=" + high + 
                               " → Checking ID: " + products[mid].productId);

            if (products[mid].productId == targetId) {
                System.out.println("   Found at index " + mid);
                return products[mid];

            } else if (products[mid].productId < targetId) {
                low = mid + 1;  
                System.out.println("  → Go RIGHT");

            } else {
                high = mid - 1;  
                System.out.println("  → Go LEFT");
            }
        }

        System.out.println("   Product not found.");
        return null;
    }
}