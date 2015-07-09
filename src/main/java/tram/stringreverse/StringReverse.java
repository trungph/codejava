package tram.stringreverse;

/**
 * Created by Tram on 7/8/2015.
 */
public class StringReverse {
    public String reverse(String text) {
        return new StringBuilder(text).reverse().toString();
    }
}
