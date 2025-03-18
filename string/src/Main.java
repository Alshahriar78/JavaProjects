//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String Name = "Al Shahoriar";
        char result = Name.charAt(4);
        int WordLength = Name.length();
        System.out.println(result);
        System.out.println(WordLength);
        if(Name.contains(" ")){
            System.out.printf("The %s Takes Spaces", Name);
        }




    }
}