
/**
 * Several Versions of writing a coded message using only arithmetic
 *
 * @author  APCS-A @ HB
 * @version 2018-09-14
 */
import java.util.Scanner;

public class CodeWord
{
    private String original;
    private String encoded;
    
    /** 
     * The constructor sets the value of the ORIGINAL word.  
     * It does not do any encoding.
     * 
     * @param str The original word to encode.
     */
    public CodeWord (String str)
    {
        original = str;
    }
    
    /** Returns the original uncoded String
     *  @return the original uncoded String
     */
    public String getOriginal()
    {
        return original;
    }
    
    /** Returns the encoded String
     *  @return the encoded String
     */
    public String getCoded()
    {
        return encoded;
    }
    
    /**
     *  Converts the original word into a coded word!
     *  
     *  <b>Precondition:</b> The original word consists of only UPPERCASE letters
     *  <b>Postcondition:</b> The private instance variable encoded holds an
     *     encoded version of the original word.
     */
    public void toCode1()
    {
        String ans = "";
        encoded = ans;
    }
    
    /*  main method to test the encoding program!  */
    public static void main(String[] args)
    {
        Scanner kbd = new Scanner (System.in);
        System.out.print("Enter a word in all UPPERCASE: ");
        CodeWord myWord = new CodeWord(kbd.nextLine());
        
        System.out.println("Original word: " + myWord.getOriginal());
        myWord.toCode1();
        System.out.println("Coded to:      " + myWord.getCoded());
    }
}
