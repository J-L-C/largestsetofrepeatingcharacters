package com.cognizant;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public String findCharacterRepeats(String givenString) {

        char[] givenCharArray = givenString.toCharArray();
        Map<Character, Integer> repeatingCharactersMap = new HashMap<>();
        StringBuilder result = new StringBuilder();
        int repeatingCharacterCount = 1;

        for (int i = 0; i < givenCharArray.length; i++ ){

            Character current = givenCharArray[i];
            Character nextChar = i != givenCharArray.length - 1 ? givenCharArray[i+1] : null;

            if(current.equals(nextChar))
                repeatingCharacterCount++;

            if(!current.equals(nextChar)){
                if(repeatingCharactersMap.containsKey(current) && repeatingCharactersMap.get(current) < repeatingCharacterCount)
                    repeatingCharactersMap.put(current, repeatingCharacterCount);
                if(!repeatingCharactersMap.containsKey(current))
                    repeatingCharactersMap.put(current, repeatingCharacterCount);
                repeatingCharacterCount = 1;
            }

        }

        for(Character value : repeatingCharactersMap.keySet()){
            if(repeatingCharactersMap.get(value) > 1)
                result.append(String.valueOf(value) + repeatingCharactersMap.get(value));
        }

        return result.toString();
    }
}
