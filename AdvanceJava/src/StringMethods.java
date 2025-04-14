public class StringMethods {
    public static void main(String[] args) {
        String strContent = " AAAF ";
        System.out.println("strContent:" + strContent + " count:" + strContent.length());
        System.out.println("strip:" + strContent.strip() + " " + strContent.strip().length());
        System.out.println("Leading:" + strContent.stripLeading().length());
        System.out.println("Trailing:" + strContent.stripTrailing().length());
        System.out.println("indent(5):" + strContent.indent(5));
        System.out.println("indent(5):" + strContent.indent(5).length());
        System.out.println("Transform: " + strContent.transform(String::toLowerCase));

        String jsonMsg = "       line1  \n       line2 \n       line3";
        System.out.println(jsonMsg);
        System.out.println("stripIndent:\n" + jsonMsg.stripIndent());
        String seqChar = "Value1\\tvalue2\\nvalue3";
        System.out.println("seqChar:" + seqChar);
        System.out.println("translateEscapes:\n" + seqChar.translateEscapes());


    }
}
