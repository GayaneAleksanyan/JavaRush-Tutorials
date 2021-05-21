package com.singleObject;

class Singleton {
    private Singleton() {
    }

    public static Singleton getInstance() {
        if (instance == null)
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        return instance;
    }
    private static volatile Singleton instance;
}
