public class BambinoTerza extends BambinoSeconda{
    
    public BambinoTerza(int[] nums) {
        super(nums);
    }

    public void moltiplica() {

        int accumulatore = 1;
        for (int i:nums) {
            accumulatore *= i;
        }

        System.out.println("Il prodotto è " + accumulatore);

        /* this.ripeti();
        this.somma(); */
        
    }
    
}
