import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ListTypes {
    public static void main(String[] args) {
        List<Integer> linkedList = new LinkedList<Integer>();
        List<Integer> arrayList = new ArrayList<Integer>();
            //faster, takes less space
        List<Integer> vectors = new Vector<Integer>();
            //thread-safe, slower than arraylist
    }
}
