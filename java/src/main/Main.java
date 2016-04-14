package main;

import java.io.*;

/**
 * Created by Edward on 13/04/2016.
 */
public class Main {
    private static Writer writer = null;
    public static void main(String[] args) {
        try {
            writer = new BufferedWriter(new OutputStreamWriter(
                    new FileOutputStream("importScript.sql"), "utf-8"));








        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
