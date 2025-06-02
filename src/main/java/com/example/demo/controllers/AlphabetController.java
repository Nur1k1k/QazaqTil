package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;
import java.util.List;

@Controller
public class AlphabetController {

    @GetMapping("/alphabet")
    public String alphabet(Model model) {
        // Kazakh specific letters with pronunciation
        List<AlphabetLetter> kazakhSpecificLetters = Arrays.asList(
                new AlphabetLetter("Ә", "ә", "[æ] like 'a' in 'cat'"),
                new AlphabetLetter("Ғ", "ғ", "[ʁ] guttural 'g'"),
                new AlphabetLetter("Қ", "қ", "[q] like 'q' in 'Qatar'"),
                new AlphabetLetter("Ң", "ң", "[ŋ] like 'ng' in 'sing'"),
                new AlphabetLetter("Ө", "ө", "[œ] like German 'ö'"),
                new AlphabetLetter("Ұ", "ұ", "[ʊ] like 'u' in 'put'"),
                new AlphabetLetter("Ү", "ү", "[y] like German 'ü'"),
                new AlphabetLetter("Һ", "һ", "[h] like 'h' in 'house'")
        );

        List<AlphabetLetter> commonLetters = Arrays.asList(
                new AlphabetLetter("А", "а", "[a] like 'a' in 'father'"),
                new AlphabetLetter("Б", "б", "[b] like 'b' in 'bed'"),
                new AlphabetLetter("В", "в", "[v] like 'v' in 'vet'"),
                new AlphabetLetter("Г", "г", "[g] like 'g' in 'go'"),
                new AlphabetLetter("Д", "д", "[d] like 'd' in 'dog'"),
                new AlphabetLetter("Е", "е", "[je] like 'ye' in 'yes'"),
                new AlphabetLetter("Ё", "ё", "[jo] like 'yo' in 'yonder'"),
                new AlphabetLetter("Ж", "ж", "[ʒ] like 's' in 'pleasure'"),
                new AlphabetLetter("З", "з", "[z] like 'z' in 'zoo'"),
                new AlphabetLetter("И", "и", "[i] like 'ee' in 'see'"),
                new AlphabetLetter("Й", "й", "[j] like 'y' in 'boy'"),
                new AlphabetLetter("К", "к", "[k] like 'k' in 'kite'"),
                new AlphabetLetter("Л", "л", "[l] like 'l' in 'love'"),
                new AlphabetLetter("М", "м", "[m] like 'm' in 'mother'"),
                new AlphabetLetter("Н", "н", "[n] like 'n' in 'no'"),
                new AlphabetLetter("О", "о", "[o] like 'o' in 'more'"),
                new AlphabetLetter("П", "п", "[p] like 'p' in 'pet'"),
                new AlphabetLetter("Р", "р", "[r] rolled 'r'"),
                new AlphabetLetter("С", "с", "[s] like 's' in 'sun'"),
                new AlphabetLetter("Т", "т", "[t] like 't' in 'top'"),
                new AlphabetLetter("У", "у", "[u] like 'oo' in 'moon'"),
                new AlphabetLetter("Ф", "ф", "[f] like 'f' in 'face'"),
                new AlphabetLetter("Х", "х", "[x] like 'ch' in Scottish 'loch'"),
                new AlphabetLetter("Ц", "ц", "[ts] like 'ts' in 'cats'"),
                new AlphabetLetter("Ч", "ч", "[tʃ] like 'ch' in 'chat'"),
                new AlphabetLetter("Ш", "ш", "[ʃ] like 'sh' in 'shoe'"),
                new AlphabetLetter("Щ", "щ", "[ʃʃ] longer 'sh'"),
                new AlphabetLetter("Ъ", "ъ", "hard sign (no sound)"),
                new AlphabetLetter("Ы", "ы", "[ɯ] like 'i' in 'bit' with rounded lips"),
                new AlphabetLetter("І", "і", "[i] like 'ee' in 'see'"),
                new AlphabetLetter("Ь", "ь", "soft sign (palatalization)"),
                new AlphabetLetter("Э", "э", "[e] like 'e' in 'met'"),
                new AlphabetLetter("Ю", "ю", "[ju] like 'you'"),
                new AlphabetLetter("Я", "я", "[ja] like 'ya' in 'yard'")
        );

        // Pronunciation examples
        List<PronunciationExample> examples = Arrays.asList(
                new PronunciationExample("Ә", "Әже", "Grandmother", "[æ-ʒe]"),
                new PronunciationExample("Ғ", "Ғалам", "Universe", "[ʁa-lam]"),
                new PronunciationExample("Қ", "Қазақ", "Kazakh", "[qa-zaq]"),
                new PronunciationExample("Ң", "Аң", "Animal", "[aŋ]"),
                new PronunciationExample("Ө", "Өнер", "Art", "[œ-ner]"),
                new PronunciationExample("Ү", "Үй", "House", "[yj]"),
                new PronunciationExample("Ж", "Жол", "Road", "[ʒol]"),
                new PronunciationExample("Ш", "Шаш", "Hair", "[ʃaʃ]")
        );

        model.addAttribute("kazakhSpecificLetters", kazakhSpecificLetters);
        model.addAttribute("commonLetters", commonLetters);
        model.addAttribute("examples", examples);

        return "alphabet";
    }

    public static class AlphabetLetter {
        private String uppercase;
        private String lowercase;
        private String pronunciation;

        public AlphabetLetter(String uppercase, String lowercase, String pronunciation) {
            this.uppercase = uppercase;
            this.lowercase = lowercase;
            this.pronunciation = pronunciation;
        }

        // Getters
        public String getUppercase() { return uppercase; }
        public String getLowercase() { return lowercase; }
        public String getPronunciation() { return pronunciation; }
    }

    public static class PronunciationExample {
        private String letter;
        private String word;
        private String translation;
        private String pronunciation;

        public PronunciationExample(String letter, String word, String translation, String pronunciation) {
            this.letter = letter;
            this.word = word;
            this.translation = translation;
            this.pronunciation = pronunciation;
        }

        public String getLetter() { return letter; }
        public String getWord() { return word; }
        public String getTranslation() { return translation; }
        public String getPronunciation() { return pronunciation; }
    }
}