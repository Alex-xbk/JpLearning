package alex.jplearning;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
import java.io.*;


@SpringBootTest
class JplearningApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    void testJp(){

        TestMain main = new TestMain();
        LocalDate today = LocalDate.now();
        try{
            for (int i=0;i<7;i++){
                LocalDate date = today.plusDays(i);

                String fileName = "/Users/xubokai/desktop/jpLearning/jpLearning" + date +".txt";
                String answerFileName = "/Users/xubokai/desktop/jpLearning/jpLearningAnswer" + date +".txt";

                File file = new File(fileName);
                File answerFile = new File(answerFileName);

                file.createNewFile();
                answerFile.createNewFile();

                try (
                        FileWriter writer = new FileWriter(file);
                        BufferedWriter out = new BufferedWriter(writer);
                        FileWriter answerWriter = new FileWriter(answerFileName);
                        BufferedWriter answerOut = new BufferedWriter(answerWriter)
                ) {
                    for (int j=0;j<5;j++){
                        String[] roman = main.romanSentence();
                        String romanWords = roman[0];
                        String romanAnswers = roman[1];
                        out.write(romanWords);
                        out.write("\r\n");
                        answerOut.write(romanAnswers);
                        answerOut.write("\r\n");
                    }

                    for (int k=0;k<5;k++){
                        String[] sentence = main.sentence();
                        String words = sentence[0];
                        String answers = sentence[1];
                        out.write(words);
                        out.write("\r\n");
                        answerOut.write(answers);
                        answerOut.write("\r\n");
                    }

                    out.flush();
                    answerOut.flush();
                }

            }
        }catch (IOException e){

        }

//        for(int i=0;i<7;i++){
//
//            System.out.println("#################################################################");
//            System.out.println(main.romanSentence());
//            System.out.println("#################################################################");
//            System.out.println(main.sentence());
//            System.out.println("#################################################################");
//        }
    }

}
