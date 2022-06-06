package melyik;
import java.util.*;

public class melyikLada {
    private String[] szin = new String[]{"arany", "ezüst", "bronz"};
    private String[] LadaVes = new String[]{"Nálam van a kincs", "Nem nálam van a kincs", "Arany hazudik"};
    private String feladat = "3 láda közül az egyik rejti a kincset. Mindegyiken van egy felirat (ami nem változtatható, mert belevésték a ládába), de csak az egyik láda állítása igaz!";
    private static Scanner sc = new Scanner(System.in);
    private String valasz;
    
    public void Kerdes(){
        System.out.println(feladat);
        System.out.println(Arrays.toString(szin));
        for (int i = 0; i < szin.length; i++) {
            System.out.println(szin[i]);
            System.out.println(LadaVes[i]);
        }
        System.out.println("Melyikben van a kincs?");
        valasz = sc.nextLine();
        felhasznaloValasz();
    }
    public void felhasznaloValasz(){
        String helyes = "ezüst";
        for (int i = 0; i < szin.length; i++) {
            if (valasz.equals(szin[1])) {
                System.out.println("Ebben van a kincs.");
            }
            
        
        
    }
    System.out.println("Nem ebben volt");
    
    
    
}
}
