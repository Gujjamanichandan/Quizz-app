public class QutionService {

    Questions[] questions = new Questions[5];

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

       for( Questions q: questions){
        System.out.println(q);
       }

    }

}
