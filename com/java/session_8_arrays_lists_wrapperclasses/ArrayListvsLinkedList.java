package session_8_arrays_lists_wrapperclasses;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ArrayListvsLinkedList {
    public static void main(String... args) {

//        arrayListvsLinkedList();
        conversions();



        List<String> arrayList = new ArrayList<>();
        arrayList.add("Sam");
        arrayList.add("Ion");
        arrayList.add("Bob");
        arrayList.add("Iov");

        List<String> linkedList = new LinkedList<>();
        linkedList.add("Sam");
        linkedList.add("Ion");
        linkedList.add("Bob");
        linkedList.add("Iov");

        //get element
        System.out.println(arrayList.get(2));
        System.out.println(linkedList.get(2));

        //add
        arrayList.add(1, "Sara");
        linkedList.add(1, "Sara");
        //{Sam, Ion, Bob, Iov}
        //{Sam,Sara ,Ion,Bob, Iov}

        //remove
        arrayList.remove(1);
        linkedList.remove("Sara");

        //stackimplementation(LIFO)
        LinkedList<String> stack = new LinkedList<>();
        stack.push("A");
        stack.push("B");
        stack.push("C");
        stack.pop();

        //offer() / poll()

        System.out.println(stack);
    }

    public static void arrayListvsLinkedList() {

        //declare ArrayList and LinkedList
        List<String> arrayList = new ArrayList<>();
        List<String> linkedList = new LinkedList<>();

        //Add elements for both lists
        for (int i = 0; i < 500000; i++) {
            arrayList.add(String.valueOf(i));
            linkedList.add(String.valueOf(i));
        }

        //measure performance for ArrayList operations
        long startArrayTime = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
//                arrayList.add(0,String.valueOf(i));
            arrayList.get(250000);
        }
        long endArrayTime = System.currentTimeMillis();
        System.out.println("ArrayList time " + (endArrayTime - startArrayTime));

        long startLinkedListTime = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
//                linkedList.add(0,String.valueOf(i));
            linkedList.get(250000);
        }
        long endLinkedListTime = System.currentTimeMillis();

        System.out.println("LinkedList time " + (endLinkedListTime - startLinkedListTime));


    }
    private static void conversions(){
        //create an array list and add elements
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("A");
        arrayList.add("B");
        arrayList.add("C");

        //convert ArrayList to array
//        String[] arrayFromArrayList = (String[])arrayList.toArray(); //nu compileaza
        String[] arrayFromArrayList = arrayList.toArray(new String[0]);
        System.out.println(arrayList);
        System.out.println(Arrays.toString(arrayFromArrayList));

        //V1 convert array to list (mutable but fixed sized)
        List<String> fromArray = Arrays.asList(arrayFromArrayList);
        fromArray.set(0,"2");
        System.out.println(fromArray);
        System.out.println(Arrays.toString(arrayFromArrayList));

        //V2: Convert array to unmodifiable List
        List<String> fromArray2 = List.of(arrayFromArrayList);//list imutable
        //fromArray2.set(1,"this"); This would throw an exception

        //v3: Convert array to fully mutable ArrayList
        List<String> fromArray3 = new ArrayList<>(Arrays.asList(arrayFromArrayList));
        System.out.println(fromArray3);
        System.out.println(Arrays.toString(arrayFromArrayList));

        fromArray3.set(1,"i");
        System.out.println(fromArray3);
        System.out.println(Arrays.toString(arrayFromArrayList));


    }
}

