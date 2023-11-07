import java.util.Scanner;

public class JavaOdev5Soru5 {
    public static String squeeze(String input1, String input2) {
        for (int i = 0; i < input2.length(); i++) {//input 2 boyunca doner
            char c = input2.charAt(i);//Input 2 nin karakterlerini c ye atar
            input1 = input1.replace(String.valueOf(c), "");//c ye atanan karakterleri input 1in icinden alir
        }
        return input1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Kelime 1 giriniz: ");
        String strInput1 = scanner.nextLine();//Inputlar alinir
        System.out.print("Kelime 2 giriniz: ");
       String strInput2 = scanner.nextLine();

        String result = squeeze(strInput1, strInput2);//Inputlar squeeze metoduna gonderilir
        System.out.println(result);
    }
}
