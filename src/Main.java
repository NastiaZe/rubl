public class Main {
    public static void main(String[] args) {
        float cost = 1200;
        float bonus;
        if (cost > 1000) {
            bonus = cost / 100;
        } else {
            bonus = 0;
        }
        System.out.println(bonus);

    }
}