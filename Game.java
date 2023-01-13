import jdk.nashorn.internal.ir.WhileNode;

import javax.sound.midi.Soundbank;
import javax.swing.text.Keymap;
import java.util.*;

public class Game {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of Players - 2 Or 3 Or 4  and to Quit Enter 0;");
        boolean start = false;
        boolean p1Won = false;
        boolean p2Won = false;
        boolean p3Won = false;
        boolean p4Won = false;
        boolean win = false;
        HashSet<Integer> hm = new HashSet<>();
        int num;
        int i=1;
        Player p1;
        Player p2;
        Player p3;
        Player p4;

        while(start == false){ //function according to players
             num = sc.nextInt();
            if (num == 0){
                return;
            }
            else if (num == 2){
                start = true;
                System.out.println("Enter your Firstname and Color");
//                String color;
                 p1 = new Player(sc.next(), sc.next());

                System.out.println("Enter your Firstname and Color");
                 p2 = new Player(sc.next(), sc.next());
//                while (win == false){
//                    System.out.println(p1.name + "press enter to roll");
//                    // we'll add event listener her by space or enter key
//                    win = p1.roll();
//                    if(win == true)
//                        break;
//                    System.out.println(p2.name + "press enter to roll");
//                    p2.roll();
//                }
                while(num > 1){
                    if (num > 1 && p1Won == false){
                        System.out.println(p1.name + " press enter to roll ");
                        sc.nextLine();
                        p1Won = p1.roll();
                        if (p1Won == true)
                            num--;
                    }
                    if (num > 1 && p2Won == false){
                        System.out.println(p2.name + " press enter to roll ");
                        sc.nextLine();
                        p2Won = p2.roll();
                        if (p2Won == true)
                            num--;
                    }
//                    if (num > 1 && p3Won == false){
//                        System.out.println(p3.name + "press enter to roll");
//                        p3Won = p3.roll();
//                        if (p3Won == true)
//                            num--;
//                    }if (num > 1 && p4Won == false){
//                        System.out.println(p4.name + "press enter to roll");
//                        p4Won = p4.roll();
//                        if (p4Won == true)
//                            num--;
//                    }

                }

            } else if (num == 3) {
                start = true;
                System.out.println("Enter your Firstname and Color");
                 p1 = new Player(sc.next(), sc.next());
                System.out.println("Enter your Firstname and Color");
                 p2 = new Player(sc.next(), sc.next());
                System.out.println("Enter your Firstname and Color");
                 p3 = new Player(sc.next(), sc.next());

                while(num > 1){
                    if (num > 1 && p1Won == false){
                        System.out.println(p1.name + " press enter to roll ");
                        sc.nextLine();
                        p1Won = p1.roll();
                        if (p1Won == true)
                            num--;
                    }
                    if (num > 1 && p2Won == false){
                        System.out.println(p2.name + " press enter to roll ");
                        sc.nextLine();
                        p2Won = p2.roll();
                        if (p2Won == true)
                            num--;
                    }
                    if (num > 1 && p3Won == false){
                        System.out.println(p3.name + "press enter to roll");
                        p3Won = p3.roll();
                        if (p3Won == true)
                            num--;
                    }
//                    if (num > 1 && p4Won == false){
//                        System.out.println(p4.name + "press enter to roll");
//                        p4Won = p4.roll();
//                        if (p4Won == true)
//                            num--;
//                    }

                }

            } else if (num == 4) {
                start = true;
                System.out.println("Enter your Firstname and Color");
                 p1 = new Player(sc.next(), sc.next());
                System.out.println("Enter your Firstname and Color");
                 p2 = new Player(sc.next(), sc.next());
                System.out.println("Enter your Firstname and Color");
                 p3 = new Player(sc.next(), sc.next());
                System.out.println("Enter your Firstname and Color");
                 p4 = new Player(sc.next(), sc.next());

                while(num > 1){
                    if (num > 1 && p1Won == false){
                        System.out.println(p1.name + " press enter to roll ");
                        sc.nextLine();
                        p1Won = p1.roll();
                        if (p1Won == true)
                            num--;
                    }
                    if (num > 1 && p2Won == false){
                        System.out.println(p2.name + " press enter to roll ");
                        sc.nextLine();
                        p2Won = p2.roll();
                        if (p2Won == true)
                            num--;
                    }
                    if (num > 1 && p3Won == false){
                        System.out.println(p3.name + "press enter to roll");
                        p3Won = p3.roll();
                        if (p3Won == true)
                            num--;
                    }if (num > 1 && p4Won == false){
                        System.out.println(p4.name + "press enter to roll");
                        p4Won = p4.roll();
                        if (p4Won == true)
                            num--;
                    }

                }

            }
            else {
                System.out.println("Enter players between 2 - 4");
            }
        }




    }
}
