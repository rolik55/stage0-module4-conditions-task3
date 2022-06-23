package school.mjc.stage0.conditions.task3;

public class AlphabeticCharacters {
    public void vowelDeterminer(char character) {
        if (character >= 'a' && character <= 'z') {
            if (character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u')
                System.out.println("Vowel");
            else
                System.out.println("Consonant");
        } else
            System.out.println("Wrong alphabet!");
    }
}
