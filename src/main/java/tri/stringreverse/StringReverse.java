package tri.stringreverse;

/**
 * Output a reversed string.
 */
public class StringReverse {                //create class
    public String reverse(String text){     //function named reverse, the function used a built-in reverse function and return the reversed string
        return reverse(text);
    }

    public static void main(String[] args) {
        StringReverse goal = new StringReverse();
        System.out.println(goal.reverse());
    }

}
