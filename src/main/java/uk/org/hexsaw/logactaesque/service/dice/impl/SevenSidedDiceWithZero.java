package uk.org.hexsaw.logactaesque.service.dice.impl;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

import uk.org.hexsaw.logactaesque.service.dice.Rollable;

public class SevenSidedDiceWithZero implements Rollable {

    private List<Integer> faces = Arrays.asList(new Integer[] {0,1,2,3,4,5,6});
    
    public int roll() {
        //Random randomizer = new Random(System.currentTimeMillis());
        // return faces.get(randomizer.nextInt(faces.size()-1));
        return faces.get(new Random().nextInt(faces.size()));
    }

}
