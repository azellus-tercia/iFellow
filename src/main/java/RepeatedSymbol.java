public class RepeatedSymbol {

    public String getRepeatedSymbol(String word) {
        if (word.length() < 2) {
            return "Word contains less than 2 symbols.";
        }

        String[] wordToArray = word.split("");
        for (int i = 0; i < wordToArray.length; i++) {
            for (int j = i + 1; j < wordToArray.length; j++) {
                if (wordToArray[i].equals(wordToArray[j])) {
                    return wordToArray[i];
                }
            }
        }

        return "No repeated symbols were found.";
    }
}