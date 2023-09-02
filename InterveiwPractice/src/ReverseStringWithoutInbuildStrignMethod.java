public class ReverseStringWithoutInbuildStrignMethod {
    public static void main(String[] args) {
        String str = "Automation";
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb = sb.reverse();
        System.out.println(sb);
    }
}
