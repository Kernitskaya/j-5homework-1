package ru.maven.junit;

public class Main {
    public static void main(String[] args) {
        BonusService service = new BonusService();
        System.out.println(service.calculate(100, false));
    }
}
