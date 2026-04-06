import java.util.Scanner;
public class Quiz{
    
    // Answers
    // Australia
// 	Mars
// Neil Armstrong
// 	Avocado
// 	Arendelle
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        // String question1="1.What is the only country in the world that is also a continent?";
        // String question2="2.Which planet in our solar system is known as the 'Red Planet'?";
        // String question3="3.Who was the first person to step foot on the moon?";
        // String question4="4.What is the primary ingredient used to make traditional Guacamole?";
        // String question5="5.What is the name of the fictional kingdom where the movie Frozen takes place?";
        // String[] questions={question1,question2,question3,question4,question5};

        System.out.println("******************************************");
        System.out.println("WELCOME TO THE PARISTARBELL'S QUIZ GAME⭐");
        System.out.println("******************************************\n");
        System.out.println("Choose the correct answer from the given options from A-B:");
        
        String question1="1.What is the only country in the world that is also a continent?";
        String question2="2.Which planet in our solar system is known as the 'Red Planet'?";
        String question3="3.Who was the first person to step foot on the moon?";
        String question4="4.What is the primary ingredient used to make traditional Guacamole?";
        String question5="5.What is the name of the fictional kingdom where the movie Frozen takes place?";
        String[] questions={question1,question2,question3,question4,question5};

        String[] OptionsA={"A.Australia","B.South Africa","C.England","D.China"};
        String[] OptionsB={"A.Jupiter","B.Venus","C.Mars","D.Neptune"};
        String[] OptionsC={"A.Buzz Aldrin ","B.Sally Ride","C.Neil Armstrong","D.Guion Bluford"};
        String[] OptionsD={"A.Avocado ","B.Grapes","C.Banana","D.Mango"};
        String[] OptionsE={"A.Beyonce","B.Arendelle","C.Jennifer Lawrence","D.Angelina Jolie"};

        String[][] options={OptionsA,OptionsB,OptionsC,OptionsD,OptionsE};

        String[] answers={"A","C","C","A","B"};
        int score=0;
        
              
        for(int i=0; i<questions.length; i++){
            System.out.println(questions[i]);
            
            for(String option:options[i]){
                System.out.println(option);
                
            }
            String answer=(scanner.nextLine()).toUpperCase();
             if (answers[i].equals(answer)){
                System.out.println("Yay correct");
                score +=1;
                
             }
             else{
                score+=0;
                    System.out.println("Wrong answer, the actual answer is "+answers[i]);
             }
             System.out.println(score);
            
        }
    
        scanner.close();
    }   
             
}
