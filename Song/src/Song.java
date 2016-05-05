/*
 * CS312 Assignment 1.
 * On my honor, <NAME>, this programming assignment is my own work.
 *
 * A program to print out the lyrics to the
 * children's song, "There was an old woman".
 *
 *  Name:
 *  email address:
 *  UTEID:
 *  Section 5 digit ID:
 *  Grader name:
 *  Number of slip days used on this assignment:
 */

public class Song {
    public static void main(String[] args) {
        verseOne();
        System.out.println();
        verseTwo();
        System.out.println();
        verseThree();
        System.out.println();
        verseFour();
        System.out.println();
        verseFive();
        System.out.println();
        verseSix();
        System.out.println();
        verseSeven();
        System.out.println();
        verseEight();
    }

    public static void lineDie() {
        System.out.println("Perhaps she'll die.");
    }
    public static void lineWhy() {
        System.out.println("I don't know why she swallowed that fly,");
    }
    public static void lineSpider() {
        System.out.println("She swallowed the spider to catch the fly,");
    }
    public static void lineBird() {
        System.out.println("She swallowed the bird to catch the spider,");
    }
    public static void lineCat() {
        System.out.println("She swallowed the cat to catch the bird,");
    }
    public static void lineDog() {
        System.out.println("She swallowed the dog to catch the cat,");
    }
    public static void lineGoat() {
        System.out.println("She swallowed the goat to catch the dog,");
    }
    public static void lineCow() {
        System.out.println("She swallowed the cow to catch the goat,");
    }

    public static void verseOne(){
        System.out.println("There was an old woman who swallowed a fly.");
        lineWhy();
        lineDie();
    }
    public static void verseTwo() {
        System.out.println("There was an old woman who swallowed a spider,");
        System.out.println("That wriggled and iggled and jiggled inside her.");
        lineSpider();
        lineWhy();
        lineDie();
    }
    public static void verseThree() {
        System.out.println("There was an old woman who swallowed a bird,");
        System.out.println("How absurd to swallow a bird.");
        lineBird();
        lineSpider();
        lineWhy();
        lineDie();
    }
    public static void verseFour() {
        System.out.println("There was an old woman who swallowed a cat,");
        System.out.println("Imagine that to swallow a cat.");
        lineCat();
        lineBird();
        lineSpider();
        lineWhy();
        lineDie();
    }

    public static void verseFive() {
        System.out.println("There was an old woman who swallowed a dog,");
        System.out.println("What a hog to swallow a dog.");
        lineDog();
        lineCat();
        lineBird();
        lineSpider();
        lineWhy();
        lineDie();
    }
    public static void verseSix() {
        System.out.println("There was an old woman who swallowed a goat,");
        System.out.println("She just opened her throat to swallow a goat.");
        lineGoat();
        lineDog();
        lineCat();
        lineBird();
        lineSpider();
        lineWhy();
        lineDie();
    }
    public static void verseSeven() {
        System.out.println("There was an old woman who swallowed a cow,");
        System.out.println("I don't know how she swallowed a cow.");
        lineCow();
        lineGoat();
        lineDog();
        lineCat();
        lineBird();
        lineSpider();
        lineWhy();
        lineDie();
    }
    public static void verseEight() {
        System.out.println("There was an old woman who swallowed a horse,");
        System.out.println("She died of course.");
    }


   /* public static void main(String[] args) throws IOException {

        FileReader fr = new FileReader("lyrics.txt");
        BufferedReader br = new BufferedReader(fr);
        String sing;
        while((sing = br.readLine()) !=null){
            System.out.println(sing);
        }
        br.close();*/

    }



