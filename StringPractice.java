public class StringPractice {
    public static void main(String[] args) {
        //string literal
        String str1 = "Birds";
        //string object
        String str2 = new String("Watching");
        String str3 = str1 + " " + str2;
        System.out.println(str3);
        System.out.println(str3.length());
        System.out.println(str3.charAt(0));
        System.out.println(str1.concat(str2));
        System.out.println(str3.substring(0, 5));
        System.out.println(str1.equals(str2));
        System.out.println(str3.contains("Bird"));
    }

}
