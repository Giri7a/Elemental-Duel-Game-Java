/* Q:Two players are playing a game in a row where there are n number of elements,each player needs to pick the highest element from either of the corners and takes that element. player 1 starts the game from either of the corners followed by the player 2. write a program to print which player gets the highest score.*/


import java.util.*;
class sleep {
    public static void a() {
        System.out.print(A.PURPLE+"\t Welcome to the Game "+A.RESET);
        for (int i = 0; i < 5; i++) {
            try {
                System.out.print(" . ");
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(); 
    }
    public static void g() {
        System.out.print(A.GREEN+"\t Getting Results "+A.RESET);
        for (int i = 0; i < 3; i++) {
            try {
                System.out.print(" . ");
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(); 
    }
    public static void b() {
        System.out.print(A.PURPLE+"\t Both players are playing the game, selecting the highest element from the ends of the row"+A.RESET);
        for (int i = 0; i < 5; i++) {
            try {
                System.out.print(". ");
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(); 
    }
    public static void f() {
        System.out.print("");
        for (int i = 0; i < 2; i++) {
            try {
                System.out.print("");
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(); 
    }
    public static void c() {
        System.out.print(A.WHITE+"\t Please Wait"+A.RESET);
        for (int i = 0; i < 5; i++) {
            try {
                System.out.print(" .");
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(); 
    }
    public static void d() {
        System.out.print(A.PURPLE+"\t Player 1 Score is"+A.RESET);
        for (int i = 0; i < 2; i++) {
            try {
                System.out.print(" .");
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(); 
    }
    public static void e() {
        System.out.print(A.PURPLE+"\t Player 2 Score is"+A.RESET);
        for (int i = 0; i < 2; i++) {
            try {
                System.out.print(" .");
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(); 
    }

}
class A {
    public static final String YELLOW = "\u001B[33m";
    public static final String WHITE  = "\u001B[37m";
    public static final String backred="\u001B[101m";
    public static final String PURPLE = "\u001B[35m";
    public static final String RESET = "\033[0m";
    public static final String RED = "\033[0;31m";
    public static final String GREEN = "\033[0;32m";
    public static final String BLUE = "\033[0;34m";
    public static final String blink="\u001B[5m";
    public static final String bold="\u001B[1m";
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
System.out.println();
sleep.a();
System.out.println();
System.out.println();
System.out.println();
System.out.println(RED+""+"\t\t\t\t\t\t\t  --------------------------- "+RESET);
System.out.println(bold+""+BLUE+""+blink+"\t\t\t\t\t\t\t | Elemental Duel: Who Wins? |"+RESET);
System.out.println(RED+""+"\t\t\t\t\t\t\t  --------------------------- "+RESET);

System.out.println();
System.out.println();
sleep.f();
        System.out.print(GREEN+"\t\t\t\t Enter the number of elements: "+RESET);
        int n = sc.nextInt();
System.out.println();
        int[] a= new int[n];
        System.out.print(GREEN+"\t\t\t\t Enter the elements: "+RESET);
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int player1Score = 0;
        int player2Score = 0;
        int left = 0;
        int right = n - 1;
        boolean player1Turn = true;

        while (left <= right) {
            if (a[left] > a[right]) {
                if (player1Turn) {
                    player1Score += a[left];
                } else {
                    player2Score += a[left];
                }
                left++;
            } else {
                if (player1Turn) {
                    player1Score += a[right];
                } else {
                    player2Score += a[right];
                }
                right--;
            }
            player1Turn = !player1Turn;
        }
System.out.println();
sleep.b();
System.out.println();
sleep.c();
System.out.println();
sleep.d();
System.out.println();
        System.out.println(RED+"\t\t\t\t Player 1 score: "+RESET +""+ player1Score);
sleep.e();
System.out.println();
        System.out.println(BLUE+"\t\t\t\t Player 2 score: "+RESET+""+ player2Score);
System.out.println();
        if (player1Score > player2Score) {
sleep.g();
System.out.println();
            System.out.println(blink+RED+"\t\t\t\t Player 1 wins!"+RESET);
System.out.println();
        } else if (player1Score < player2Score) {
sleep.g();
System.out.println();
            System.out.println(blink+BLUE+"\t\t\t\t Player 2 wins!"+RESET);
System.out.println();
        } else {
sleep.g();
System.out.println();
            System.out.println(blink+YELLOW+"\t\t\t\t It's a tie!"+RESET);
System.out.println();
        }
    }
}


/* 
🎮 Elemental Duel Game: Where Code Meets Strategy!

Excited to share my latest Java project: Elemental Duel Game! 🚀

Gameplay:
In Elemental Duel, two players compete to pick the highest elements from a row. Players take turns choosing from the ends, and scores are calculated in real-time. The game not only entertains but also challenges players' strategic thinking.

Why It's Important:

Java Mastery: Developed entirely in Java, this project showcases my coding skills, including loops, conditionals, and multithreading.
Problem-Solving: Designing the game logic tested my problem-solving abilities, ensuring efficient element selection and scoring.
User Experience: The colorful interface enhances user engagement, emphasizing my focus on creating enjoyable experiences.
Features:

Interactive: Players can customize the game by inputting the number of elements, making it accessible and user-friendly.
Real-Time Updates: Multithreading is used to display dynamic, real-time score calculations, adding excitement to the gameplay.
Visual Appeal: The vibrant terminal interface demonstrates my creativity in combining functionality with aesthetics.
Explore the code on GitHub [insert GitHub link] and dive into the world of Elemental Duel! If you're interested in Java programming, game development, or creative coding, let's connect. Excited to discuss potential collaborations and share insights!

#JavaProgramming #GameDevelopment #CreativeCoding #JavaDeveloper 🕹️🖥️
*/
