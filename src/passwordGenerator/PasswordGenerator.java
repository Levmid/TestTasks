package passwordGenerator;

import java.util.Random;
import java.util.Scanner;

public class PasswordGenerator {
    private static final String lowerCaseLetters = "abcdefghijklmnopqrstuvwxyz";
    private static final String upperCaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String digits = "0123456789";
    private static final String specialCharacters = "!@#$%^&*()-_=+[]{}|;:,.<>?";
    private static final String allCharacters =lowerCaseLetters + upperCaseLetters + digits + specialCharacters;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int passwordLength = getPasswordLength(scanner);
        String password = generatePassword(passwordLength);
        System.out.println("Ваш пароль: " + password);
    }

    private static int getPasswordLength(Scanner scanner) {
        int length;
        do {
            System.out.print("Введите длину пароля (от 8 до 12): ");
            length = scanner.nextInt();
        } while (length < 8 || length > 12);
        return length;
    }

    private static String generatePassword(int length) {
        StringBuilder password = new StringBuilder();
        Random random = new Random();

        password.append(getRandomCharacter(random, lowerCaseLetters));
        password.append(getRandomCharacter(random, upperCaseLetters));
        password.append(getRandomCharacter(random, digits));
        password.append(getRandomCharacter(random, specialCharacters));

        for (int i = 4; i < length; i++) {
            password.append(getRandomCharacter(random, allCharacters));
        }

        return shuffleString(password.toString(), random);
    }

    private static char getRandomCharacter(Random random, String characters) {
        return characters.charAt(random.nextInt(characters.length()));
    }

    private static String shuffleString(String str, Random random) {
        char[] characters = str.toCharArray();
        for (int i = characters.length - 1; i > 0; i--) {
            int j = random.nextInt(i + 1);
            char temp = characters[i];
            characters[i] = characters[j];
            characters[j] = temp;
        }
        return new String(characters);
    }
}