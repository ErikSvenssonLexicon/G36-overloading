package org.example;


public class App 
{

    private int value = 5;

    public String toString(){
        return String.valueOf(value);
    }

    public static void main( String[] args )
    {
        System.out.println(Calculator.add(Integer.valueOf(5), Integer.valueOf(5)));
        System.out.println(Calculator.add(1, 1));
        System.out.println(Calculator.add("1","1"));
        System.out.println(Calculator.add(Math.PI, Math.PI));

        //Johny its all your fault people want to quit now!!
        App app = new App();
        System.out.println(Calculator.add(app, app));

    }
}
