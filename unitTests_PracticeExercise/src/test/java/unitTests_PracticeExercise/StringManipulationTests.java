package unitTests_PracticeExercise;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringManipulationTests {

//    Vowel count Tests

    @Test
    void givenNullStringThenReturnZeroVowelCount(){
        assertEquals(0,StringManipulation.vowelCount(null));
    }

    @Test
    void givenEmptyStringThenReturnZeroVowelCount(){
        assertEquals(0,StringManipulation.vowelCount(""));
    }

    @Test
    void givenStringThenReturnVowelCount(){
        assertEquals(4,StringManipulation.vowelCount("RishAbh nOhwaL"));
    }

    @Test
    void givenNoVowelStringThenReturnZeroVowelCount(){
        assertEquals(0,StringManipulation.vowelCount("MYTH"));
    }

    @Test
    void givenAllVowelStringThenReturnVowelCount(){
        assertEquals(10,StringManipulation.vowelCount("aeiouAEIOU"));
    }

//    Character count test

    @Test
    void givenNullStringThenReturnZeroCharacterCount(){
        assertEquals(0,StringManipulation.characterCount(null));
    }

    @Test
    void givenEmptyStringThenReturnZeroCharacterCount(){
        assertEquals(0,StringManipulation.characterCount(""));
    }

    @Test
    void givenStringThenReturnCharacterCount(){
        assertEquals(10,StringManipulation.characterCount("water is dry"));
    }

    @Test
    void givenStringWithSpacesOnlyThenReturnZeroCharacterCount(){
        assertEquals(0,StringManipulation.characterCount("       "));
    }

}