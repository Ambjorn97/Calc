import java.util.Scanner;
public class Test {
    public static void main (String[] args){
        System.out.println("Введите выражение без пробелов, напр. (2*2)");
        Scanner input = new Scanner(System.in);
        String s1 = input.nextLine();
        String operation = "";
        int num1, num2, solution = 0;
        String [] numbers = s1.split("[+-/*]");
        RomanDigit roman1 = RomanDigit.valueOf(numbers[0]);
        RomanDigit roman2 = RomanDigit.valueOf(numbers[1]);
        num1 = Integer.parseInt(roman1.getValue());
        num2 = Integer.parseInt(roman2.getValue());
        int x = numbers[0].length();

        if (x==1){
            operation = String.valueOf(s1.charAt(1));

        } if (x==2){
            operation = String.valueOf(s1.charAt(2));

        }
         if (x==3){
             operation = String.valueOf(s1.charAt(3));
         }

        switch (operation){
            case "+":
                solution = num1 + num2;
                break;
            case "-":
                solution = num1 - num2;
                break;
            case "*":
                solution = num1 * num2;
                break;
            case "/":
                solution = num1 / num2;
                break;

        }
        System.out.println("Ответ: " + solution);











    }
}
