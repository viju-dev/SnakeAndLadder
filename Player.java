public class Player {
    String name;
    String color;
    int stepCounter = 0 ;

    public Player(String name, String color) {
        this.name = name;
        this.color = color;
    }

    boolean roll(){
        int x = (int) (Math.random() * (7 - 1)) + 1;
        int y = x; // y for keeping track of last dice roll value
        int sixCount = 0;
        System.out.println(x);
        while(x == 6){
            sixCount++;
            if (sixCount==3){ // as rule if we got 3 sixes then that turns skipped
                x = 0;
                break;
            }
            x += (int) (Math.random() * (7 - 1)) + 1;
            y = x;
            System.out.println(x);
        }
        stepCounter += x;
        if(stepCounter > 36){
            stepCounter -= y; // last dice roll value
            System.out.println(this.name+" is at "+ stepCounter);
            return false;
        }
        if(stepCounter>0){
            System.out.println(this.name+" is at "+ stepCounter);
        }

         stepCounter = stepDecision(stepCounter);
        if(stepCounter == 36){
            return true;
        }
        return false;
    }

    int stepDecision(int stepCounter){
        switch (stepCounter) {

            //ladder
            case 3:
                System.out.println(this.name +" is came at 3 and got ladder so now he reached to "+ (3+13));
                stepCounter += 13;
                break;
            case 5:
                System.out.println(this.name +" is came at 5 and got ladder so now he reached to "+ (5+2));
                stepCounter += 2;
                break;
            case 15:
                System.out.println(this.name +" is came at 15 and got ladder so now he reached to "+ (15+10));
                stepCounter += 10;
                break;
            case 18:
                System.out.println(this.name +" is came at 18 and got ladder so now he reached to "+ (18+2));
                stepCounter += 2;
                break;
            case 21:
                System.out.println(this.name +" is came at 21 and got ladder so now he reached to "+ (21+11));
                stepCounter += 11;
                break;
            case 36:
                System.out.println("Hurray you won the game...!");
                break;

//                snakes
            case 12:
                System.out.println(this.name +" is came at 12 and bitten by snake so back to "+ (12-10));
                stepCounter -= 10;
                break;
            case 14:
                System.out.println(this.name +" is came at 14 and bitten by snake so back to "+ (14-11));
                stepCounter -= 11;
                break;
            case 17:
                System.out.println(this.name +" is came at 17 and bitten by snake so back to "+ (17-13));
                stepCounter -= 13;
                break;
            case 31:
                System.out.println(this.name +" is cam at 31 and bitten by snake so back to "+ (31-12));
                stepCounter -= 12;
                break;
            case 35:
                System.out.println(this.name +" is cam at 35 and bitten by snake so back to "+ (35-13));
                stepCounter -= 13;
                break;
//            case 28:
//                System.out.println();
//                break;
//            case 29:
//                System.out.println();
//                break;
//            case 30:
//                System.out.println();
//                break;
//            case 31:
//                System.out.println();
//                break;
//            case 32:
//                System.out.println();
//                break;
//            case 33:
//                System.out.println();
//                break;
//            case 34:
//                System.out.println();
//                break;
//            case 35:
//                System.out.println();
//                break;
//            case 36:
//                System.out.println();
//                break;

        }
        return stepCounter;
    }
}
