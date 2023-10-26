package piglatin;

public class PigLatin {
    public void printLatinWord(String word) {
        System.out.println(makeLatinWord(word));
    }

    private String makeLatinWord(String word) {
        int index = 1;
        String latinWorded = "";
        latinWorded = word.substring(index) + word.substring(0, index) + "ay ";
        return latinWorded;
    }
}