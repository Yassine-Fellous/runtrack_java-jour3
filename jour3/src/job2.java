import java.util.*;
import java.util.Collections;

public class job2 {

    List<String> list = Arrays.asList("chat", "chien", "chat", "oiseau", "poisson", "oiseau");

    public void doublon(){
        int s = 0;
        int i = 0;
        while (i < list.size()) {
            int frequenceA = Collections.frequency(list, list.get(i));
            if(1 == frequenceA) {
                System.out.println(list.get(i));
            }
            i++;
        }
    }
    public static void main(String[] args) {
        job2 d = new job2();
        d.doublon();
    }
}
