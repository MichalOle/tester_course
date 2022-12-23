package adv.exercise.dictionary;

import java.util.*;

public class Dictionary {
    Map<String, List<EnglishWord>> dictionary = new HashMap<>();


    public void addWord(String polishWord, EnglishWord englishword) {
        List<EnglishWord> englishWord = dictionary.getOrDefault(polishWord,new ArrayList<>());
        englishWord.add(englishword);
        dictionary.put(polishWord,englishWord);
    }

    public List<EnglishWord> findEnglishWords(String polishWord) {
        return dictionary.getOrDefault(polishWord,new ArrayList<>());
    }

    public List<EnglishWord> findEnglishWords(String polishWord, PartOfSpeech partOfSpeech) {

        List<EnglishWord> result = new ArrayList<>();
        for (EnglishWord englishWord : dictionary.getOrDefault(polishWord, new ArrayList<>())) {
            if (englishWord.getPartOfSpeech().equals(partOfSpeech))
                result.add(englishWord);
            }
        return result;
        }

    public int size(){
        return dictionary.size();
    }
}
