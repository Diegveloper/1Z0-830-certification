package ozomahtli.generics;

import java.util.ArrayList;
import java.util.List;

public class Handler {
    public static <T> void prepare(T t){
        System.out.println("Preparing " + t);
    }
    public static <T> Crate<T> ship(T t){
        System.out.println("Shipping " + t);
        return new Crate<T>();
    }
    public static void main(String[] args){
        prepare("Hi");
        List<Integer> numbers = new ArrayList<>();
        //List<Object> objects = numbers;
        List<?> objects = numbers;
    }
}
