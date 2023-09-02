public class FinalReverseWithoutUsingStringMethods {
    public static void main(String[] args) {
        String str = "Yash";
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb = sb.reverse();
        System.out.println(sb);
    }
}
