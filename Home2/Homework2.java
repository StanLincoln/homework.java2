package de.telran.homework1.Home2;

public class Homework2 {
    public static void main(String[] args) {
        //Задание 1
        Character myChar = 'G';
        Integer myInt =  89;
        Byte myByte = 4;
        Short myShort =  56;
        Float myFloat = 4.7333436F;
        Double myDouble =  4.355453532;
        Long myLong = 12121L;

        System.out.println("Character: " + myChar);
        System.out.println("Integer: " + myInt);
        System.out.println("Byte: " + myByte);
        System.out.println("Short: " + myShort);
        System.out.println("Float: " + myFloat);
        System.out.println("Double: " + myDouble);
        System.out.println("Long: " + myLong);

        //Задание 2
        int myInteger = 345;
        int result1 = myInteger/100;
        int result2 = (myInteger/10)%10;
        int result3 = myInteger%10;
        System.out.println("Число " + myInteger + "-> " + result1 + ", " + result2 + ", " + result3);
    }
}
