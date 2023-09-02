public class RemovinfWhiteSpacesWithoutReplaceMethod {
    public static void main(String[] args) {
        String str1 = "Saket Saurav        is an Autom ation Engi ne      er";
        char[] charArray = str1.toCharArray();
        StringBuilder sb = new StringBuilder();
        for(char cc : charArray)
        {
            if(cc!=' ' && cc != '\t')
            {
                sb.append(cc);
            }
        }
        System.out.println(sb);
    }
}
