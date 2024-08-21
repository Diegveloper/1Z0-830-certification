package ozomahtli.generics;

import java.util.List;

public class Donts {
    //Won't compile due to erasure
    //private void doSomething(List<Object> input){}
    private void doSomething(List<Double> input){}
}
