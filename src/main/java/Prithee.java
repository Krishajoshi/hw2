import java.util.Scanner;
public class Prithee {
    /**
     * game core logic
     */

    //variables for correct/wrong count, sonnet and guess

    String fullSonnet;
    int correctCount;
    int wrongCount;
    String guess;
    //default constructor
    public Prithee() {
        //initializes counts to zero and adds in the sonnet, initializes guess to empty string
        this.correctCount = 0;
        this.wrongCount = 0;
        this.fullSonnet = "Shall I compare thee to a summer’s day?\n" +
                "Thou art more lovely and more temperate:\n" +
                "Rough winds do shake the darling buds of May,\n" +
                "And summer’s lease hath all too short a date;\n" +
                "Sometime too hot the eye of heaven shines,\n" +
                "And often is his gold complexion dimm’d;\n" +
                "And every fair from fair sometime declines,\n" +
                "By chance or nature’s changing course untrimm'd;\n" +
                "But thy eternal summer shall not fade,\n" +
                "Nor lose possession of that fair thou ow’st;\n" +
                "Nor shall death brag thou wander’st in his shade,\n" +
                "When in eternal lines to time thou grow’st:\n" +
                "   So long as men can breathe or eyes can see,\n" +
                "   So long lives this, and this gives life to thee.\n";
        this.guess = "";
    }
    //core logic for game
    public void playGame(){
        //while the correct count and wrong count is less than 3, game starts and keeps going
        while(correctCount < 3 && wrongCount < 3){
            //scanner to go through the whole sonnet
            Scanner scanner = new Scanner(fullSonnet);
            //counting the words in the sonnet
            int countWords = 0;
            while(scanner.hasNext()){
                scanner.next();
                countWords++;
            }
            //chooses random word from start to the end of sonnet
           int randIdx = (int)(Math.random()*countWords);

           //new scanner for word inside the sonnet
           Scanner word = new Scanner(fullSonnet);

           //finds the random word for guess and sets it equal to after that word
           for(int i = 0; i<=randIdx; i++){
               guess = word.next();
           }
           //uses print sonnet to print out sonnet up to that word
           printSonnet();
           //scanner for user input
           Scanner userInput = new Scanner(System.in);
           System.out.println("What is the missing word?");
           String answer = userInput.next();
            //checks if answer is correct or not
           if(answer.equalsIgnoreCase(guess)){
               System.out.println("Correct");
               correctCount++;
           }
           else{
               System.out.println("Wrong");
               wrongCount++;
           }
        }
        //outside of loop checks if they got the words correct or wrong
        if(correctCount == 3){
            System.out.println("you were able to guess all 3 words");
        }
        else{
            System.out.println("you were not able to guess all the words");
        }
    }
    //printing out sonnet with the underscores
    public void printSonnet(){
        Scanner scanner = new Scanner(fullSonnet);

        while(scanner.hasNextLine()){
            String l = scanner.nextLine();
            Scanner word = new Scanner(l);
            while(word.hasNext()){
                String w = word.next();
                if(w.equals(guess)){
                    System.out.print("_________ ");
                    return;
                }
                else{
                    System.out.print(w + " ");
                }
            }
            System.out.println();

        }
    }

}
