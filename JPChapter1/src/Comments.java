/*Display the following statement about comments: Program comments are nonexecuting statements you add to a
file for documentation. Also include the same statement in three different comments*/

public class Comments {

    public static void main(String [] args){
        comments();
    }

    public static void comments(){
        System.out.println("Program comments are non-executing statements you add to a file for documentation");
        //System.out.println("Program comments are non-executing statements you add to a file for documentation");
        /*System.out.println("Program comments are non-executing statements you add to a file for documentation");*/
        /**System.out.println("Program comments are non-executing statements you add to a file for documentation");*/
    }
}
