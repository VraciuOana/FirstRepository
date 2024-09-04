package session_8_arrays_lists_wrapperclasses;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayvsArraylist {
    public static void main (String[] args){

        //declare
        String [] friendArray = {"Sam","Dan","Ion","Pop"};

        List<String> friendsArraysList = new ArrayList<>(Arrays.asList("Sam","Dan","Ion","Pop"));

        //get value
        System.out.println(friendArray[1]);
        System.out.println(friendsArraysList.get(1));

        //size
        System.out.println(friendArray.length);
        System.out.println(friendsArraysList.size());

        //add value
        friendsArraysList.add("Pavel");
        System.out.println(friendsArraysList.get(4));

        //set value
        friendArray[1] = "Maia";
        System.out.println(friendArray[1]);
        friendsArraysList.set(1,"Maia");
        System.out.println(friendsArraysList.get(1));

        //remove
        friendsArraysList.remove("Maia");
        System.out.println(friendsArraysList.get(1));

        //print
        System.out.println(Arrays.toString(friendArray));
        System.out.println(friendsArraysList);
    }
}
