package com.nuande.englishpark;

public final class App {
    private App() {
    }

    public static String greeting(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Name must not be blank");
        }
        return "Welcome to Nuande English Park, " + name.trim() + "!";
    }

    public static void main(String[] args) {
        System.out.println(greeting(args.length > 0 ? args[0] : "learner"));
    }
}
