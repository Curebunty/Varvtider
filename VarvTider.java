import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class VarvTider {

    private List<Integer> varvTider;

    public VarvTider() {
        this.varvTider = new ArrayList<>();
    }

    public void laggTillVarvTid(int varvTid) {
        this.varvTider.add(varvTid);
    }

    public List<Integer> hamtaBastaVarvTider(int antal) {

        Collections.sort(varvTider);


        return varvTider.subList(0, Math.min(antal, varvTider.size()));
    }

    public int hamtaTotaltAntalVarvTider() {
        return varvTider.size();
    }

    public static void main(String[] args) {
        VarvTider varvTider = new VarvTider();


        varvTider.laggTillVarvTid(10);
        varvTider.laggTillVarvTid(8);
        varvTider.laggTillVarvTid(12);
        varvTider.laggTillVarvTid(7);
        varvTider.laggTillVarvTid(9);
        varvTider.laggTillVarvTid(11);

        List<Integer> bastaVarvTider = varvTider.hamtaBastaVarvTider(5);
        System.out.println("De 5 bästa varvtiderna: " + bastaVarvTider);
    }
}
