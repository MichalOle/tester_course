package adv.exercise.dictionary;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class DictionaryTestSuite {

@Test
    public void testAddWord(){
    //given
    Dictionary dictionary = new Dictionary();
    String polishWord = "stos";
    EnglishWord englishWord = new EnglishWord(PartOfSpeech.NOUN,"stack");
    //when
    dictionary.addWord(polishWord,englishWord);
    //then
    assertEquals(1,dictionary.size());
}
@Test
    public void testfindEnglishWord(){
    //given
    Dictionary dictionary = new Dictionary();
    dictionary.addWord("gra",new EnglishWord(PartOfSpeech.NOUN,"play"));
    dictionary.addWord("gra",new EnglishWord(PartOfSpeech.NOUN,"game"));
    dictionary.addWord("stos",new EnglishWord(PartOfSpeech.NOUN,"stack"));
    dictionary.addWord("grać",new EnglishWord(PartOfSpeech.VERB,"play"));
    //when
    List<EnglishWord> result = dictionary.findEnglishWords("gra");
    //then
//    assertEquals(2,result.size());

//    metoda dajaca pewnosc, ze pozadane slowa sa w kolekcji
    List<EnglishWord> expectedList = new ArrayList<>();
    expectedList.add(new EnglishWord(PartOfSpeech.NOUN,"play"));
    expectedList.add(new EnglishWord(PartOfSpeech.NOUN,"game"));
    assertEquals(expectedList, result);
}
@Test
    public void testFindEnglishWordWithPartOfSpeech(){
    //given
    Dictionary dictionary = new Dictionary();
    dictionary.addWord("gra",new EnglishWord(PartOfSpeech.NOUN,"play"));
    dictionary.addWord("gra",new EnglishWord(PartOfSpeech.NOUN,"game"));
    dictionary.addWord("stos",new EnglishWord(PartOfSpeech.NOUN,"stack"));
    dictionary.addWord("brać",new EnglishWord(PartOfSpeech.VERB,"take"));
    dictionary.addWord("brać",new EnglishWord(PartOfSpeech.NOUN,"brotherhood"));
    //when
    List<EnglishWord> result = dictionary.findEnglishWords("brać",PartOfSpeech.VERB);
    //then
    List<EnglishWord> expectedList = new ArrayList<>();
    expectedList.add(new EnglishWord(PartOfSpeech.VERB,"take"));
    assertEquals(expectedList, result);
}

}