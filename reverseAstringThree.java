public class reverseAstringThree {
    public static void main(String[] args) {
        String str = "Probisk";
        char[] reverseString = str.toCharArray();

        for(int i = str.length()-1; i >= 0; i--){
            System.out.print(reverseString[i]);
        }
    }
}
