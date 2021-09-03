import java.util.Scanner;

public class SelectLanguage {

    // UNICODE 13.0 CHART http://www.unicode.org/charts/ 
    // UNICODE CHART CARE OF https://stackoverflow.com/questions/19899554/unicode-range-for-japanese
    void pickLanguage(){
        char option = '\0';
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Please select your language.");
        System.out.println("A. English");
        System.out.println("B. Spanish");
        System.out.println("C. French");
        System.out.println("D. Japanese");
        System.out.println("E. Arabic");
        System.out.println("F. Quit");
    }

    do{
        System.out.println("Enter an option:");
        char option0 = scanner2.next().charAt(0);
        char option2 = Character.toUpperCase(option0);
 
        //possibly? https://stackoverflow.com/questions/4237488/obtaining-unicode-characters-of-a-language-in-java

        switch (option2){
            case 'A':
            //pick English
            //can stay as is
            showMenu();
            case 'B':
            //pick Spanish
            case 'C':
            //pick French
            case 'D':
            //pick Japanese
            case 'E':
            //pick Arabic
            case 'F': 
            System.out.println("Thank you! Bye!");            
        }

    } while (scanner2 != F); //infinite loop


    
}
