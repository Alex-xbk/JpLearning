package alex.jplearning;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class JplearningApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    void testJp(){
        TestMain main = new TestMain();

        for(int i=0;i<2;i++){
            System.out.println("#################################################################");
            System.out.println(main.romanSentence());
            System.out.println("#################################################################");
            System.out.println(main.sentence());
            System.out.println("#################################################################");
        }
    }

}
