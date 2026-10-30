package CaseMethod;

public class PangkatRekursif_Bagian2 {
    public static int pangkat(int basis, int eksponen) {
        if (eksponen == 0) { // Base case
            return 1;
        }
       
        return basis * pangkat(basis, eksponen - 1);
    }

    public static void main(String[] args) {
        System.out.println("2 pangkat 3 = " + pangkat(2, 3));
        System.out.println("5 pangkat 0 = " + pangkat(5, 0));
    }
}
