package com.jtmelton.testme;

public class Sample {
    public static void main(String[] args) {
        boolean s = true;
                
        if (s = false) {  //should produce finding - HERE
            int i1 = "555";
            System.err.println("assignment");
        }
        
        if (s == false) {
            System.err.println("compare");
        }
        
        if (s = true || 1 == 1) { //should produce finding - HERE
            System.err.println("a1");
        } else if (1 == 2 || (s = true)) {  //should produce finding - HERE
            System.err.println("a2");
        } else if (1 == 3 && (s = false || 1 == 4)) { //should produce finding - HERE
            System.err.println("a3");
        }

        System.out.println("Hello World!");
    }
}
