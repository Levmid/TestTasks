package theGallows;

import java.util.Scanner;
import java.util.Random;

public class Gallows {
    private static final String[] words = {"переменная", "цикл", "алгоритм", "поток", "сортировка", "функция", "массив"};
    private static final int maxLives = 5;
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String wordToGuess = words[random.nextInt(words.length)];
        StringBuilder theGuessedWord = new StringBuilder("_".repeat(wordToGuess.length()));
        int lives = maxLives;

        System.out.println("Добро пожаловать в Виселицу!");

        while (lives > 0 && theGuessedWord.toString().contains("_")){
            System.out.println("Слово: " + theGuessedWord);
            System.out.println("Осталось жизней: " + lives);
            drawingTheGallows(lives);
            System.out.print("Введите букву: ");
            char guessedLetter = scanner.nextLine().toLowerCase().charAt(0);

            if (wordToGuess.indexOf(guessedLetter) >= 0){
                for (int i = 0; i < wordToGuess.length(); i++){
                    if (wordToGuess.charAt(i) == guessedLetter){
                        theGuessedWord.setCharAt(i, guessedLetter);
                    }
                }
                System.out.println("Такая буква есть в слове");
            }
            else {
                lives--;
                System.out.println("Такой буквы нет в слове");
            }
        }
        if (lives > 0){
            System.out.println("Победа! Слово, которое было загадоно: " + wordToGuess);
        }
        else {
            System.out.println("Вы проиграли. Слово, которое было загадано: " + wordToGuess);
            drawingTheGallows(lives);
        }
    }
    private static void drawingTheGallows(int lives) {
        switch (lives) {
            case 5:
                System.out.println("\n \n \n \n \n");
                break;
            case 4:
                System.out.println("\n \n \n \n \n=========");
                break;
            case 3:
                System.out.println("      |  \n      |  \n      |  \n      |  \n      |  \n=========");
                break;
            case 2:
                System.out.println("  +---+  \n      |  \n      |  \n      |  \n      |  \n      |  \n=========");
                break;
            case 1:
                System.out.println("  +---+  \n  |   |  \n      |  \n      |  \n      |  \n      |  \n=========");
                break;
            case 0:
                System.out.println("  +---+  \n  |   |  \n  O   |  \n /|\\  |  \n / \\  |  \n      |  \n=========");
                break;

        }
    }
}
