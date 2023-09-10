import java.util.*;

public class job1 {

    List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);
    public boolean paire(int i){
        if(i % 2 == 0){
            return true;
        }
        else {
            return false;
        }
    }

    public void Sommep(){
        int i = 0;
        int s = 0;
        while(i < list.size()) {
            if (paire(list.get(i))) {
                s += list.get(i);
            }
            i++;
        }
        System.out.println(s);
    }

    public static void main(String[] args) {
        job1 p = new job1();
        p.Sommep();
    }
}
