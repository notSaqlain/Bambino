public class Bambino {

    int[] nums;

    Bambino(int[] nums) {
        this.nums = nums;
    }
    
    public void ripeti() {
        for (int i:nums) {
            System.out.println("BATT dice " + i);
        }
    }
    
    
}