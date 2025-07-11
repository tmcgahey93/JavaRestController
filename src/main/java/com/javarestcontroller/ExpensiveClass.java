package com.javarestcontroller;

public class ExpensiveClass {
    public static void doWork() {
        try {
            Thread.sleep(1000); // Simulates expensive work
        } catch (InterruptedException e) {
            e.printStackTrace(); // Or use proper logging
        }
    }
}
