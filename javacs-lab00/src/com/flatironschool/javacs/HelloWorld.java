package com.flatironschool.javacs;

public class HelloWorld {
    public static Double getVersion() {
        return Double.parseDouble(System.getProperty("java.version").substring(0, 3));
        // I won't work!
    }

    public static void main(String[] args) {
	    // you can test the output of getVersion() here
	    System.out.println(getVersion());
    }
}
