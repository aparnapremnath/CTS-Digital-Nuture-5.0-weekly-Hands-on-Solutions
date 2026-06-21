import java.util.HashMap;

public class FinancialForecast {

   
    public static double calculateFutureValue(double presentValue, 
                                               double growthRate, 
                                               int years) {
        if (years == 0) {
            return presentValue;
        }

        double grownValue = presentValue * (1 + growthRate);
        return calculateFutureValue(grownValue, growthRate, years - 1);
    }


    
    private static HashMap<Integer, Double> memo = new HashMap<>();

    public static double calculateFutureValueMemo(double presentValue, 
                                                   double growthRate, 
                                                   int years) {
        if (years == 0) {
            return presentValue;
        }

        if (memo.containsKey(years)) {
            System.out.println("    [Memo] Reusing result for year " + years);
            return memo.get(years);
        }

        double grownValue = presentValue * (1 + growthRate);
        double result = calculateFutureValueMemo(grownValue, growthRate, years - 1);
        memo.put(years, result);

        return result;
    }


    
    public static void predictGrowth(double presentValue, 
                                      double growthRate, 
                                      int years) {
        System.out.println("\n  Year 0 → ₹" + String.format("%.2f", presentValue));

        for (int i = 1; i <= years; i++) {
            double futureValue = calculateFutureValue(presentValue, growthRate, i);
            System.out.println("  Year " + i + " → ₹" + 
                                String.format("%.2f", futureValue));
        }
    }
}