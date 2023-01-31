package org.example;
class Calculator{
    public int add(int i , int j){
        return i + j;
    }
}
class AdvCalculator extends Calculator{
    public int sub(int i , int j){
        return i + j;
    }
}
class NewCalculator extends AdvCalculator{
    public int mul(int i, int j){
        return i*j;
    }
}

public class Main {
    public static void main(String[] args) {
        NewCalculator object = new NewCalculator();
        int result1 = object.add(13,12);
        int result2 = object.sub(76,23);
        int result3 = object.mul(23, 13);
        System.out.println("addition of two number is: " + result1);
        System.out.println("Subtraction of two number is :" + result2);
        System.out.println("multiplication of two number is :" + result3);
    }
}