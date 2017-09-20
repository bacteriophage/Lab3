    import java.io.IOException;
    import java.net.URL;
    import java.util.Scanner;

public class anything {
    /**
     * Retrieve contents from a URL and return them as a string.
     *
     * @param url url to retrieve contents from
     * @return the contents from the url as a string, or an empty string on error
     */

    String something = urlToString("http://erdani.com/tdpl/hamlet.txt");
    int count = 0;
    int totalCharacters = 0;
    int length = something.length();
    int n = 0;

    while (count < length) {

    }





    public static String urlToString(final String url) {
        Scanner urlScanner; {
        try {
            urlScanner = new Scanner(new URL(url).openStream(), "UTF-8");
        } catch (IOException e) {
            return "";
        }
        String contents = urlScanner.useDelimiter("\\A").next();
        urlScanner.close();
        return contents;
    }
}
}