package CollectionDemo;

import java.util.ArrayList;

public class ListDemo {

    public static void main(String[] args) {
        // Collection to store 4 names
        // number - Integer

        //Object of ArrayList
        ArrayList<String> names = new ArrayList<>();

        //Add elements to ArrayList
        names.add("Mike");
        names.add("Smith");
        names.add("John");
        names.add("Ali");
        names.add("Mike");

        //names.remove(1);

        //get elements
        //System.out.println(names.get(2));

        //for Loop
        for (int i= 0; i<names.size();i++){
            System.out.println(names.get(i));

        }
    }
}
