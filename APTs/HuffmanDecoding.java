import java.util.*;
import java.io.*;

public class HuffmanDecoding {
    public String decode(String archive, String[] dictionary) {
        // archive has encoded bits
        // dictionary has the resultant
        String[] alphabet = {"A", "B", "C", "D", "E", "F", "G", "H", "I",
                "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
        String current = "";
        int currentIndex = 0;
        for (int k = 0; k < archive.length(); k++) {
            for (int i = 0; i < dictionary.length; i++) {
                if (archive.substring(currentIndex, k + 1).equals(dictionary[i])) {
                    current += alphabet[i];
                    currentIndex = k + 1;
                }
            }
        }
        return current;
    }


}