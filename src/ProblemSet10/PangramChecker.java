package ProblemSet10;
public class PangramChecker {
    private final static int LETTERS_IN_ALPHABET = 26;
    public boolean isPangram(String input) {
        return input.toLowerCase().chars()
                .filter(Character::isAlphabetic)
                .distinct()
                .count() == LETTERS_IN_ALPHABET;
    }
}