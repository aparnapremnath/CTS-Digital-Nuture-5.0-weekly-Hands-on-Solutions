public class Main {
    public static void main(String[] args) {

        double presentValue = 1000.00;
        double growthRate   = 0.10;
        int    years        = 5;

        System.out.println("========== SIMPLE RECURSION ==========");
        System.out.println("Present Value : Rs." + presentValue);
        System.out.println("Growth Rate   : " + (growthRate * 100) + "%");
        System.out.println("Years         : " + years);
        double result = FinancialForecast.calculateFutureValue(presentValue, growthRate, years);
        System.out.println("Future Value  : Rs." + String.format("%.2f", result));

        System.out.println("\n========== YEAR-BY-YEAR FORECAST ==========");
        FinancialForecast.predictGrowth(presentValue, growthRate, years);

        System.out.println("\n========== MEMOIZED RECURSION ==========");
        double memo1 = FinancialForecast.calculateFutureValueMemo(presentValue, growthRate, years);
        System.out.println("Result: Rs." + String.format("%.2f", memo1));

        System.out.println("\n========== DIFFERENT SCENARIOS ==========");
        System.out.println("Conservative 5% for 10 years:");
        System.out.println("  Rs.1000 -> Rs." + String.format("%.2f",
            FinancialForecast.calculateFutureValue(1000, 0.05, 10)));

        System.out.println("Aggressive 20% for 10 years:");
        System.out.println("  Rs.1000 -> Rs." + String.format("%.2f",
            FinancialForecast.calculateFutureValue(1000, 0.20, 10)));

        System.out.println("Negative Growth -5% for 5 years:");
        System.out.println("  Rs.1000 -> Rs." + String.format("%.2f",
            FinancialForecast.calculateFutureValue(1000, -0.05, 5)));

        System.out.println("\n========== ANALYSIS SUMMARY ==========");
        System.out.println("Simple Recursion   -> O(n) time, O(n) stack space");
        System.out.println("Memoized Recursion -> O(n) first call, O(1) repeated");
        System.out.println("Best for production -> Iterative loop (avoids stack overflow)");
    }
}