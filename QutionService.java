import java.util.Scanner;

public class QutionService {

    Questions[] questions = new Questions[5];
    String selection[] = new String[5];

    public QutionService() {
        questions[0] = new Questions(1, "Which data type in Java is 8 bytes (64-bit)?", "int", "long", "float", "char",
                "long");

        questions[1] = new Questions(2, "Which data type in Java uses 1 byte (8-bit)?", "short", "boolean", "double",
                "long", "boolean");

        questions[2] = new Questions(3, "Which data type in Java stores a single character and is 2 bytes (16-bit)?",
                "byte", "char", "int", "boolean", "char");

        questions[3] = new Questions(4, "How many bytes does a float take in Java?", "4 bytes", "8 bytes", "2 bytes",
                "1 byte", "4 bytes");

        questions[4] = new Questions(5, "Which data type in Java is 4 bytes (32-bit) signed integer?", "short", "byte",
                "int", "double", "int");

    }

    public void displayQuestions(){
        int i = 0;

       for( Questions q: questions){
        System.out.println(" Question number:"+q.getId());
        System.out.println(q.getQuestion());
        System.out.println(q.getOpt1());
        System.out.println(q.getOpt2());
        System.out.println(q.getOpt3());
        System.out.println(q.getOpt4());

        Scanner sc = new Scanner(System.in);

        selection[i] = sc.nextLine();
        i++;
      }

      for(String s: selection){
        System.out.println(s);
      }


    }
}


