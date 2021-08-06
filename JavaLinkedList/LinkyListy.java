package JavaLinkedList;

import java.util.Iterator;
import java.util.LinkedList;



public class LinkyListy {

    public static void main(String[] args) {
        LinkedList lnks = new LinkedList();
        LinkedList<Integer> links = new LinkedList<Integer>();

        lnks.add("Rob");
        lnks.add("Alex");
        lnks.add("Jose");

        links.add(6);
        links.add(78);
        links.add(4);

        lnks.getFirst();

        // lnks.clear();

        System.out.println(lnks);
        System.out.println(links.get(1));

        Iterator it = links.iterator();
        while(it.hasNext()) {
            if ((int)it.next() == 78) {
                System.out.println("We found 78");
            }
        }
        
        
    }
    
}
