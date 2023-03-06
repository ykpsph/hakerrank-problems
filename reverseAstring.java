public class reverseAstring {
    public static void main(String[] args) {
        String str = "yako";
        String rts = "";
        char ch;

        System.out.println("Original string: "+str);
        for(int i = 0; i < str.length(); i ++){
            ch = str.charAt(i);
            rts = ch + rts;
            System.out.println(rts);
        }
        System.out.println("Reversed string: "+rts);
    }
}
