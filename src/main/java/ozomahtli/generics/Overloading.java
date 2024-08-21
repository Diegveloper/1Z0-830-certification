package ozomahtli.generics;

import java.util.ArrayList;
import java.util.List;

public class Overloading {

}

class LongTailAnimal{
    protected void chew(List<Object> input){}
}

class Anteater extends LongTailAnimal{
    //Won't compile due to mismatch in generic
    //protected void chew(List<Double> input){}

    //This works because it overloads
    protected void chew(ArrayList<Double> inpout){}
}
