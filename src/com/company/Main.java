package com.company;

public class Main {

    public static void main(String[] args) {
        walk(32,43);
        walk(10, 21);
        walk(30 , 11);
        walk(61, -9);
        walk(17, -17);
    }

    public static void walk(int age, int temperature) {
        if ((age > 20 && age < 45) && (temperature > -20 && temperature < 30)) {
            System.out.println("Можно идти гулять"); return;
        }
        if (age < 20 && (temperature > 0 && temperature < 28)) {
            System.out.println("Можно идти гулять"); return;
        }
        if (age > 45 && (temperature > -10 && temperature < 25)) {
            System.out.println("Можно идти гулять");
        } else {
            System.out.println("Оставайтесь дома");
        }
    }
}
