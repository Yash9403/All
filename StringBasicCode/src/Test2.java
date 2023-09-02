public class Test2 {



    public static boolean checkforpalindrom(String s)
    {
        String rev = "";
       for(int i=s.length()-1; i>=0;i--)
       {
            rev = rev + s.charAt(i);
       }

       if(s.equals(rev))
       {
           return true;
       }

        return false;
    }

    public static void main(String[] args) {
        boolean t = checkforpalindrom("Yash");
        System.out.println(t);
    }
}
