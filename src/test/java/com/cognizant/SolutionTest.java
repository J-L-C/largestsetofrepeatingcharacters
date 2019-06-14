package main.java.app.cognizant;

import com.cognizant.Solution;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class SolutionTest {

    Solution solution = new Solution();

    @Test
    public void findCharacterRepeats_shouldReturnAStringWithCountGivenASingleCharacterString(){
        String test = "AA";
        assertEquals("A2",solution.findCharacterRepeats(test));
    }

    @Test
    public void findCharacterRepeats_shouldReturnAStringWithCountGivenAStringWithOnlyOneRepeatingCharacter(){
        String test = "AAAA";
        assertEquals("A4",solution.findCharacterRepeats(test));
    }

    @Test
    public void findCharacterRepeats_shouldReturnAStringWithCountGivenAStringWithTwoSetsOfRepeatingCharacters() {
        String test = "AAAABB";
        assertEquals("A4B2",solution.findCharacterRepeats(test));
    }

    @Test
    public void findCharacterRepeats_shouldReturnAStringWithCountGivenAStringWithMultiplesSetsOfRepeatingWithDifferentSizeSetsOfTheSameRepeatingSet() {
        String test = "AAAABBAABBCCC";
        assertEquals("A4B2C3",solution.findCharacterRepeats(test));
    }

    @Test
    public void findCharacterRepeats_asdf() {
        String test = "AaBbCcDdOO";
        assertEquals("O2",solution.findCharacterRepeats(test));
    }

}