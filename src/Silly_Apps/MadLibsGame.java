package Silly_Apps;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MadLibsGame {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        System.out.println("Hi! Welcome to the Mad Libs game created by M&M :)");
        System.out.println("You will need to enter 10 words, so let's start!");
        System.out.println();



        System.out.println("First, please enter a color:");
        String color = reader.readLine();
        System.out.println();

        System.out.println("Now please enter any name:");
        String friendName = reader.readLine();
        System.out.println();

        System.out.println("Now enter a mood:");
        String mood = reader.readLine();
        System.out.println();

        System.out.println("Now enter profession:");
        String profession = reader.readLine();
        System.out.println();

        System.out.println("Now enter a song name:");
        String song = reader.readLine();
        System.out.println();

        System.out.println("Now enter a food:");
        String food = reader.readLine();
        System.out.println();

        System.out.println("Now enter a number:");
        String number = reader.readLine();
        System.out.println();

        System.out.println("Now enter part of the body:");
        String bodyPart = reader.readLine();
        System.out.println();

        System.out.println("Now enter a hobby/activity:");
        String hobby = reader.readLine();
        System.out.println();

        System.out.println("At last, please enter your name:");
        String name = reader.readLine();
        System.out.println();


        System.out.println("So... Are you ready for your Mad Libs story? Yes or No? :)");
        String answer = reader.readLine();
        System.out.println();


        if (answer.equalsIgnoreCase("yes")) {
            System.out.println("GREAT! Here we go...");
            System.out.println();

            printStory(color, friendName, mood, profession, song, food, number,bodyPart,hobby, name);
        } else if (answer.equalsIgnoreCase("no")) {

            System.out.println("No? Well okay... Bye when :( ");

        } else {
            System.out.println("Not quite sure what you meant by that, but please enjoy the story:");
            System.out.println();
            printStory(color, friendName, mood, profession, song, food, number,bodyPart,hobby, name);

        }




    }

    public static void printStory(String color, String friendName, String mood,  String profession, String song,
                           String food, String number, String bodyPart, String hobby, String name ) {

        System.out.println(

                "       Story of Johan, the Silly Goose \n" +
                "       created by magnificent " + name + " \n" +
                        "\n" +
                        "\n" +

                        "On that particular day, Johan, the Silly Goose thought to himself \n" +
                        "\"What a beautiful day, I am feeling pretty " +  mood + " today, \n" +
                        "I should go and visit my old friend " + friendName + ", the Great Racoon\".\n" +
                        "\n" +

                        "So he started walking towards " + friendName + "'s house. " + friendName + " was a " + profession + "\n" +
                        "and pretty good one, actually the best. \n" +
                        "\n" +

                        "As Johan was approaching " + friendName + "'s house, he remembered that he hasn't eaten today, \n" +
                        "he figured out that he should go and by some food for himself and his friend " + friendName + ". \n" +
                        "\n" +
                        "Luckily in his direction was a food van, where they were selling best " + food + " in town. \n" +
                        "He bought two portions of " + food + " and went forward. \n" +
                        "\n" +

                        "At that moment " + friendName + " was actually finishing his project, a masterpiece. \n" +
                        "All " + profession + "'s in the world will be jealous when they see his work. \n" +
                        "It took " + number + " months to create this masterpiece and at this moment when " + friendName + " was adding last..." + "\n" +
                        "\n" +

                        "*DING DONG* \n" +
                        "*DING DONG* \n" +
                        "\n" +

                        "It was Johan, the Silly Goose, at the door. " + friendName +" immediately recognized the delicious smell of " + food + ". \n" +
                        "His tail started twisting around, he dropped everything and went straight to the door. \n" +
                        "\n" +

                        "When he opened the door, he couldn't believe his " + bodyPart + " - it was Johan. \n" +
                        "And with two portions of " + food + ", also it was his favorites - the " + color + " ones. \n" +
                        "\"Come in, come in\" said " + friendName + " and hurried Johan inside. \n" +
                        "\n" +

                        "They both were " + mood + " to see each other and deliciously ate " + food + "\n" +
                        "Johan asked, \"So what are you up to " + friendName +", what would you like to do now, how about some " + hobby + "?\" \n" +
                        "\n" +

                        friendName + " said \"I was about to finish my masterpiece. I only needed to... I actually forgot! \n" +
                        "Oh, you Silly Goose, you distracted me! Okay... " + hobby + " sounds nice, let's go do that.\" \n" +
                        "\n" +

                        "LATER THAT DAY \n" +
                        "\n" +

                        "After having such a great day Johan returned home and started singing his favorite song \"" + song + "\". When he thought to himself \n" +
                        "\"What a great day, I am feeling even more " + mood + " now. I hope all the days will be like this one.\" \n" +

                        "\n" +
                        "AND THEY WERE. THE END :)"


        );
    }
}
