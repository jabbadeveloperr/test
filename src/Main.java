public class Main {
    public static void main(String[] args) {
        String lol = "lol";
        String lol2 = "lol";
        String lol3 = new String("lol");
        String lol4 = lol3 + "";

        // ==
        //equals

        System.out.println(lol == lol2);
        System.out.println(lol == lol3);
        System.out.println(lol == lol4);

    }
}
