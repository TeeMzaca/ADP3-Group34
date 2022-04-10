package za.ac.cput.LibrarySystem.util;

public class Helper{

    public static boolean isNullorEmpty(String s){
        return (s == null || s.equals ("") || s.isEmpty()|| s.equalsIgnoreCase("null"));
    }
}
