import javax.swing.*;

public class JobPricing {

    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Enter the following details for a Job Quote");
        String jobName = JOptionPane.showInputDialog(null, "Job Name");
        double materialCost = Double.parseDouble(JOptionPane.showInputDialog(null, "Material Cost: £"));
        int workingTime = Integer.parseInt(JOptionPane.showInputDialog(null, "Amount Of Hours Work"));
        int travelTime = Integer.parseInt(JOptionPane.showInputDialog(null, "Travel Time (In Rounded Hours): "));

        double estimate = createEstimate(materialCost, workingTime, travelTime);
        JOptionPane.showMessageDialog(null, "For Job " + jobName + "\nYour Estimate is £" + estimate);
    }

    public static double createEstimate(double materialCost, int workingTime, int travelTime) {
        double hoursCost = 35 * workingTime;
        double travelCost = 12 * travelTime;
        double estimate = materialCost + hoursCost + travelCost;
        return estimate;
    }
}