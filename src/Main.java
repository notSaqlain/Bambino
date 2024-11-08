public class Main {
    public static void main(String[] args) throws Exception {

        int[] nums = {1, 2, 3};

        Bambino b = new Bambino(nums);
        b.ripeti();

        BambinoSeconda b2 = new BambinoSeconda(nums);
        b2.somma();
    }
}
