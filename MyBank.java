//CREDIT: https://youtu.be/hqY6rKhRBzU

public class myBank {
    public static void main(String[] args)
    // SEE IF YOU CAN GENERATE A RANDOM ID WITH AN IN-BUILT MATH FUNCTION & SAVE IT
        Account myName = new Account("My Name", "A00001");
        myName.pickLanguage();
        myName.showMenu();

        Account newGuy = new Account("New Guy", "B00002");
        newGuy.pickLanguage();
        newGuy.showMenu();
}