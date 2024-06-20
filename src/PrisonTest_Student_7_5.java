//Section 7, Lesson 5 Starter for Exercise 1 - Slide 10

public class PrisonTest_Student_7_5 {
    public static void main(String[] args){
        
        Prisoner_Student_7_5 bubba = new Prisoner_Student_7_5("Bubba", 2.08, 4, "A1");
        Cela cela = new Cela("A1", false);
        
       
        bubba.display(true);
         cela.setIsOpen(false, 12);
         cela.setIsOpen(false, 1234);
          cela.setIsOpen(true, 1234);
        
    }
}
