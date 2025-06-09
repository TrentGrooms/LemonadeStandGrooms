

import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) {
        int cupsSold = Integer.parseInt(JOptionPane.showInputDialog("Enter number of Cups Sold:"));
        double PricePerCup = Double.parseDouble(JOptionPane.showInputDialog("Enter Price per Cup:"));
        double LemonCost = Double.parseDouble(JOptionPane.showInputDialog("Enter the cost of lemons per batch:"));
        double SugarCost = Double.parseDouble(JOptionPane.showInputDialog("Enter the cost of sugar per batch:"));
        double CupsCost = Double.parseDouble(JOptionPane.showInputDialog("Enter the cost of cups per batch:"));

        double totalCost = LemonCost + SugarCost + CupsCost;
        double revenue = cupsSold * PricePerCup;
        double profit = revenue - totalCost;

        String totalCostFormatted = String.format("%.2f", totalCost);
        String revenueFormatted = String.format("%.2f", revenue);
        String profitFormatted = String.format("%.2f", profit);

        String Message;
        if (profit > 0) {
            Message = "You made a profit!";
            }
        else if (profit == 0) {
            Message = "You broke even!";
        }
        else {
            Message = "You lost money!";
        }

        String finalMessage = "Total Cost: $" + totalCostFormatted + "\nRevenue: $" + revenueFormatted
                + "\nProfit: $" + profitFormatted + "\n" + Message;

        JOptionPane.showMessageDialog(null, finalMessage);
    }
}