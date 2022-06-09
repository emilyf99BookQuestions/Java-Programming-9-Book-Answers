
/*Write a program that accepts the names of three political parties and the number
of votes each received in the last mayoral election. Display the percentage of the
vote each party received. Save the program as ElectionStatistics.java. */

import javax.swing.*;
import java.text.DecimalFormat;

public class ElectionStatistics {

    private static final DecimalFormat df = new DecimalFormat("0.0");

    public static void main (String [] args){
        input();
    }

    public static void input(){
        JOptionPane.showMessageDialog(null, "Enter Three Political Parties and the Votes they " +
                "received");
        String partyOne = JOptionPane.showInputDialog(null, "Party One Name:");
        String partyOneVotesString = JOptionPane.showInputDialog(null, "Votes for " + partyOne);
        String partyTwo = JOptionPane.showInputDialog(null, "Party Two Name:");
        String partyTwoVotesString = JOptionPane.showInputDialog(null, "Votes for " + partyTwo);
        String partyThree = JOptionPane.showInputDialog(null, "Party Three Name:");
        String partyThreeVotesString = JOptionPane.showInputDialog(null, "Votes for " + partyThree);

        percentages(partyOne, partyTwo, partyThree, partyOneVotesString, partyTwoVotesString, partyThreeVotesString);
    }

    public static void percentages(String partyOne, String partyTwo, String partyThree, String partyOneVotesString,
                                   String partyTwoVotesString, String partyThreeVotesString) {

        int partyOneVotes = Integer.parseInt(partyOneVotesString);
        int partyTwoVotes = Integer.parseInt(partyTwoVotesString);
        int partyThreeVotes = Integer.parseInt(partyThreeVotesString);

        double total = partyOneVotes + partyTwoVotes + partyThreeVotes;

        double percentageP1 = (partyOneVotes/total)*100;
        double percentageP2 = (partyTwoVotes/total)*100;
        double percentageP3 = (partyThreeVotes/total)*100;

        JOptionPane.showMessageDialog(null, "Total Votes: " + total + "\nTotal Vote Percentage" + "\n" + partyOne + " : "
                + df.format(percentageP1) + "\n" + partyTwo + " : " + df.format(percentageP2) + "\n" + partyThree + " : " + percentageP3);
    }
}
