package javamidterm_simon;

import java.util.Scanner;

public class JavaMidterm_Simon {

    public static Player player = new Player(5, 5);
    public static Scanner sc = new Scanner(System.in);
    public static Map map = new Map(5, 5);
    public static int scan;
    public static String sca;

    public static void main(String[] args) {
        System.out.println("Welcome to Simon's game of mystery, there will be\n"
                + "several games to choose from, including:\n"
                + "[1]: Maze\n"
                + "[2]: Blackjack [Not Ready]\n");
        System.out.println("Please enter the corresponding number to start a game.");
        scanstart();
    }

    public static void scanstart() {
        scan = sc.nextInt();
        switch (scan) {
            case 1:
                maze();
                break;
            case 2:
                blackjack();
                break;
            default:
                System.out.println("Please try entering a number again!");
                scanstart();
                break;
        }
    }

    public static void maze() {
        System.out.println(" \nWelcome to maze, my name is philip, your instructor.\n"
                + "there is a deep backstory for how you got here, and\n"
                + "I will be more than happy to tell you about that!\n");
        System.out.println(" You see, you are an interesting character. For you\n"
                + "to make it here was not easy, yet it wasn't nearly as\n"
                + "difficult as it was for many others. If I'm going to\n"
                + "be 100% honest, you're very lucky, because winning\n"
                + "this game could be the start of a complete life,\n"
                + "something many others wish for!\n");
        System.out.println(" Now the one thing I don't know is your name, and\n"
                + "I'm sure that you don't remember it either, so give\n"
                + "a good one!\n");
        sc.nextLine();
        player.name = sc.nextLine();
        System.out.println("\nNice to meet you, " + player.getName() + ", now let\n"
                + "me tell you where you are from.");
        boolean start = true;
        while (start) {
            System.out.println("\nOkay, give me a x and y value to start from!");
            System.out.print("[X]: ");
            player.x = sc.nextInt();
            System.out.print("[Y]: ");
            player.y = sc.nextInt();
            System.out.println("Are you sure you want to start at " + player.getX() + "," + player.getY() + "?");
            sc.nextLine();
            sca = sc.nextLine();
            if (sca.contains("y")) {
                System.out.println("\nOkay, Here we go!");
                start = false;
                map();
            }

        }
    }

    public static void map() {
        char[][] map = new char[20][20];

        map[player.x][player.y] = 'x';

        for (int i = 0; i <= map[0].length - 1; i++) {
            for (int j = 0; j <= map[1].length - 1; j++) {
                if (j < map[1].length - 1) {
                    if (i == 0) {
                        System.out.print("▬▬▬");
                    } else if (i == 19) {
                        System.out.print("▬▬▬");
                    } else if (j == 0) {
                        System.out.print("▐");
                    } else if (j == 19) {
                        System.out.print("▐");
                    } else if (map[i][j] != 'x') { //map[i][j] != 'x'
                        System.out.print(" • ");
                    } else {
                        System.out.print(" " + map[i][j] + " ");
                    }
                } else if (i == 0) {
                    System.out.println("");
                } else if (i == 19) {
                    System.out.println("");
                } else if (j == 0) {
                    System.out.println("▐");
                } else if (j == 19) {
                    System.out.println("▐");
                } else if (map[i][j] != 'x') { //map[i][j] != 'x'
                    System.out.println(" • ");
                } else {
                    System.out.println(" " + map[i][j] + " ");
                }
            }
        }

    }

    public static void blackjack() {

    }

}
