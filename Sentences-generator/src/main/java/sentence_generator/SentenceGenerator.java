package sentence_generator;

import java.util.Random;

public class SentenceGenerator {
    private final String[] article = {"the", "a", "one", "some", "any"};
    private final String[] noun = {"boy", "girl", "dog", "town", "car"};
    private final String[] verb = {"drove", "jumped", "ran", "walked", "skipped"};
    private final String[] preposition = {"to", "from", "over", "under", "on"};

    private final String[][] wordList = {article, noun, verb, preposition};


    public String makeSentence() {
        String sentence = "";
        String firstArticle = " ";
        Random rand = new Random();

        firstArticle = titlelizeFirstLetter(getWord(article));
        sentence += firstArticle + " ";
        sentence += getWord(noun) + " ";
        sentence += getWord(verb) + " ";
        sentence += getWord(preposition) + " ";
        sentence += getWord(article) + " ";
        sentence += getWord(noun) + " ";
        return sentence;
    }

    private String titlelizeFirstLetter(String article) {

        String firstLetter = article.substring(0, 1).toUpperCase();
        String afterFirstLetter = article.substring(1);
        String newArticle = firstLetter + afterFirstLetter;
        return newArticle;
    }

    private String getWord(String[] wordList) {
        Random rand = new Random();
        int index = rand.nextInt(4);
        return wordList[index];
    }
}
