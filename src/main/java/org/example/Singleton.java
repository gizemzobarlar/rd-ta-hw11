package org.example;

class Singleton {
    private static org.example.Singleton instance;


    private Singleton() {}

    public static org.example.Singleton getInstance() {
        if (instance == null) {
            instance = new org.example.Singleton();
        }
        return instance;
    }

    public void showMessage() {
            System.out.println("Hello from Singleton class!");
        }
}

