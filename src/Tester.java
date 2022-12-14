public class Tester {
    public static void main(String[] args) {
        String string = "are you able to climb, are you able to swim or are you able to fly?";
        string = string.replaceAll("\sare", "_xyz");
        System.out.println(string);
    }
}
