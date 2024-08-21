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
    protected void chew(ArrayList<Double> input){}
}

class Mammal {
    List<CharSequence> play() { return null; }
    CharSequence sleep() { return null; }
}
class Monkey extends Mammal {
    ArrayList<CharSequence> play() { return null;}
}
class Goat extends Mammal {
    //Won't compile, generic return must match'
    //List<String> play() {  }
    String sleep() { return null; }
}
