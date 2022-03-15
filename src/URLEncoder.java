import java.io.UnsupportedEncodingException;
import java.lang.Object;
/**
 * Utility class for HTML form encoding. This class contains static methods for converting a String to the application/x-www-form-urlencoded MIME format. For more information about HTML form encoding, consult the HTML specification.
When encoding a String, the following rules apply:

The alphanumeric characters "a" through "z", "A" through "Z" and "0" through "9" remain the same.
The special characters ".", "-", "*", and "_" remain the same.
The space character " " is converted into a plus sign "+".
All other characters are unsafe and are first converted into one or more bytes using some encoding scheme. Then each byte is represented by the 3-character string "%xy", where xy is the two-digit hexadecimal representation of the byte. The recommended encoding scheme to use is UTF-8. However, for compatibility reasons, if an encoding is not specified, then the default encoding of the platform is used.
For example using UTF-8 as the encoding scheme the string "The string ü@foo-bar" would get converted to "The+string+%C3%BC%40foo-bar" because in UTF-8 the character ü is encoded as two bytes C3 (hex) and BC (hex), and the character @ is encoded as one byte 40 (hex).
@since JDK1.0
@author Rodrigo
 */


public class URLEncoder extends Object{
    /**
     @Deprecated The resulting string may vary depending on the platform's default encoding. Instead, use the encode(String,String) method to specify the encoding.
     Translates a string into x-www-form-urlencoded format. This method uses the platform's default encoding as the encoding scheme to obtain the bytes for unsafe characters.
     Parameters:
     s - String to be translated.
     Returns:
     the translated String.
     @param s String to be translated.
     @return the Traslated string 
     */
    public static String encode (String s){
        return s;
    }
    /**
    Translates a string into application/x-www-form-urlencoded format using a specific encoding scheme. This method uses the supplied encoding scheme to obtain the bytes for unsafe characters.
    Note: The World Wide Web Consortium Recommendation states that UTF-8 should be used. Not doing so may introduce incompatibilites.
    @param s String to be traslated
    @param s2 The name of a supported character encoding.
    @return the translated String.
    @throws UnsupportedEncodingException - If the named encoding is not supported
    @since 1.4
    @see URLDecoder.decode(java.lang.String, java.lang.String)
    */
    public static String encode(String s , String enc) throws UnsupportedEncodingException{
        return s;
   }
   
}
