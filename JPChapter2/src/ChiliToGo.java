
/*Fundraiser by selling chili dinners to go. The price is $7 for an adult meal and $4 for a child’s meal. Write a
program that accepts the number of each type of meal ordered and display the total money collected for adult meals,
children’s meals, and all meals.*/

import javax.swing.*;
import java.text.DecimalFormat;

public class ChiliToGo {

    final static double ADULT_MEAL = 7.00;
    final static double CHILD_MEAL = 4.00;
    final static String adultTitle = "Adult Meals";
    final static String childTitle = "Child Meals";

    public static void main (String [] args){
        input();
    }

    public static void input(){
        DecimalFormat df = new DecimalFormat("###.##");
        JOptionPane.showMessageDialog(null, "Chilli to Go\nAdult Meals are £" +
                df.format(ADULT_MEAL)  + "\nChildren's Meals are £" + df.format(CHILD_MEAL));
        String adultMealsInput = JOptionPane.showInputDialog(null, "Adult Meals Ordered");
        String childMealsInput = JOptionPane.showInputDialog(null, "Child Meals Ordered");

        int adultMeals = Integer.parseInt(adultMealsInput);
        int childMeals = Integer.parseInt(childMealsInput);

        double adultTotal = adultMeals * ADULT_MEAL;
        double childTotal = childMeals * CHILD_MEAL;
        df.format(adultTotal);
        df.format(childTotal);

        displayTotals(adultTotal, childTotal, adultTitle, childTitle);
        displayAll(adultTotal, childTotal);
    }
    public static void displayTotals(double adult, double child, String adultMeal, String childMeal ){
        JOptionPane.showMessageDialog(null, "The total cost of " + adultMeal + " is £"
        + adult + " The total cost of " + childMeal + " is £" + child);
    }
    public static void displayAll(double adult, double child) {
        double total = adult * child;
        JOptionPane.showMessageDialog(null, "The total of all meals is £" + total);
    }
}
