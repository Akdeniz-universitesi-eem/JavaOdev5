public class JavaOdev5Soru4 {
    public static String changeCase(String input) {
        char[] charArray = input.toCharArray();//Input character arraye donusturulur
        for (int i = 0; i < charArray.length; i++) {//Array boyunca her karakterde doner
            char c = charArray[i];//Karakterler degisildikten sonra array guncellenir
            if (Character.isLowerCase(c)) {
                charArray[i] = Character.toUpperCase(c);//Eger kucuk harfse buyuk harfe cevirir
            } else if (Character.isUpperCase(c)) {
                charArray[i] = Character.toLowerCase(c);//Eger buyuk harfse kucuk harfe cevirir
            }
        }
        return new String(charArray);
    }

    public static void main(String[] args) {
        String input = "Hello I am learning JAVA";
        String result = changeCase(input);
        System.out.println(result);
    }
}
