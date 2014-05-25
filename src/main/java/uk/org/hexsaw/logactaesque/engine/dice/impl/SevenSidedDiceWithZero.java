package uk.org.hexsaw.logactaesque.engine.dice.impl;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

import uk.org.hexsaw.logactaesque.engine.dice.Rollable;

public class SevenSidedDiceWithZero implements Rollable {

    private List<Integer> faces = Arrays.asList(new Integer[] {0,1,2,3,4,5,6});
    
    private Random randomizer = new Random();
    
    public int roll() {
        return faces.get(1 + randomizer.nextInt(faces.size()-1));
    }

}
