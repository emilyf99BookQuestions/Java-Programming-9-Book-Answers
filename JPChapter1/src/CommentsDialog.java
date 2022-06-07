/*Modify the Comments.java program in Exercise 10 so that the statement about comments is displayed in a
dialog box.*/

import javax.swing.*;

public class CommentsDialog {
    public static void main(String [] args){
        comments();
    }

    public static void comments(){
        JOptionPane.showMessageDialog(null, "Program comments are non-executing statements " +
                "you add to a file for documentation");
    }
}
