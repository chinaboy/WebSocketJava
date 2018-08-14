package com.chat;

import static java.lang.Thread.sleep;

public class ServerThread implements Runnable {
    private int counter = 0;
    @Override
    public void run() {
        while(true) {
            System.out.println("Your server is running at " + Integer.toString( counter ) );
            try {
                sleep(100);
                counter += 1;
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
