
/*In the ChiliToGo program, the costs to produce an adult meal and a child’s meal are $4.35 and $3.10, respectively.
Modify the ChiliToGo program to display the total profit for each type of meal as well as the grand total profit. */

import javax.swing.*;
import java.text.DecimalFormat;

public class ChiliToGoProfit {

    final static double ADULT_MEAL = 7.00;
    final static double CHILD_MEAL = 4.00;
    final static double ADULT_MEAL_PRODUCTION_COST = 4.35;
    final static double CHILD_MEAL_PRODUCTION_COST = 3.10;
    final static String adultTitle = "Adult Meals";
    final static String childTitle = "Child Meals";
    private static final DecimalFormat df = new DecimalFormat("0.00");

    public static void main (String [] args){
        input();
    }
    public static void input(){
        JOptionPane.showMessageDialog(null, "Chilli to Go\nAdult Meals are £" +
                ADULT_MEAL + "\nChildren's Meals are £" + CHILD_MEAL);
        String adultMealsInput = JOptionPane.showInputDialog(null, "Adult Meals Ordered");
        String childMealsInput = JOptionPane.showInputDialog(null, "Child Meals Ordered");

        int adultMeals = Integer.parseInt(adultMealsInput);
        int childMeals = Integer.parseInt(childMealsInput);

        double adultTotal = adultMeals * ADULT_MEAL;
        double childTotal = childMeals * CHILD_MEAL;
        df.format(adultTotal);
        df.format(childTotal);

        double adultProfit = ADULT_MEAL - ADULT_MEAL_PRODUCTION_COST;
        double childProfit = CHILD_MEAL - CHILD_MEAL_PRODUCTION_COST;

        double adultProfitAll = adultTotal * adultProfit;
        double childProfitAll = childTotal * childProfit;

        df.format(adultProfitAll);
        df.format(childProfitAll);

        displayTotals(adultTotal, childTotal, adultTitle, childTitle);
        displayAll(adultTotal, childTotal);
        displayTotalProfit(adultProfitAll,childProfitAll, adultTitle, childTitle);
        displayAllProfit(adultProfitAll, childProfitAll);
    }
    public static void displayTotals(double adult, double child, String adultMeal, String childMeal ){
        JOptionPane.showMessageDialog(null, "The total cost of " + adultMeal + " is £"
                + adult + " The total cost of " + childMeal + " is £" + child);
    }
    public static void displayAll(double adult, double child) {
        double total = adult * child;
        df.format(total);
        JOptionPane.showMessageDialog(null, "The total of all meals is £" + total);
    }

    public static void displayTotalProfit(double adultProfit, double childProfit, String adultMeal, String childMeal){
        JOptionPane.showMessageDialog(null, "The total profit for  " + adultMeal + " is £"
        + df.format(adultProfit)+ "\nThe total profit for " + childMeal + " is £" + df.format(childProfit));
    }

    public static void displayAllProfit(double adultProfit, double childProfit){
        double totalProfit = adultProfit * childProfit;
        JOptionPane.showMessageDialog(null, "The total profit of all meals is £" + df.format(totalProfit));
    }

}
