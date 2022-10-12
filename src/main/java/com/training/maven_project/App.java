package com.training.maven_project;

/**
 * Hello world!
 *
 */
import java.util.*;
public class App 
{
    public static void main( String[] args )
    {
        TreeMap<Integer,String>treemap=new TreeMap<Integer, String>();
        treemap.put(3,"Rabbit");
        treemap.put(1,"Cat");
        treemap.put(2, "Dog");
        System.out.println("Descending list"+treemap.descendingMap());
    }
}
