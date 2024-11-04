package q4;

public class Main {


        public static void main(String[] args)
        {
            Time t1 = new Time();
            Time t2 = new Time();
    
            Time t3 = new Time();
    
            t1.getTime();
            t2.getTime();
    
            t3.addTime(t1);
            t3.addTime(t2);
    
            System.out.println("The Sum Of t1 and t2: ");
            t3.displayTime();
        }
    }
