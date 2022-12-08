import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Result {
    public static void solve(double meal_cost, int tip_percent, int tax_percent) {
        double totalCost = meal_cost + meal_cost * (tip_percent + tax_percent) * 0.01;
        System.out.println(Math.round(totalCost));

    }
}

