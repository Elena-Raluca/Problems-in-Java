package main;

import sentence_generator.SentenceGenerator;

public class Main {
    public static void main(String[] args) {
        SentenceGenerator sentenceGenerator = new SentenceGenerator();
        for (int index = 0; index < 20; index++) {
            System.out.println(sentenceGenerator.makeSentence());
        }
    }
}
