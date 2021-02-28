package edu.bsu.cs222;

import java.util.ArrayList;
import java.lang.*;
import java.util.Collections;


public class FormatsInArrayList{

    public ArrayList<String> list = new ArrayList<String>();

    public FormatsInArrayList(){
    }

    public void addToList(String input) {
            list.add(input);
            Collections.sort(list);
    }
    public String getListItem(int itemNum) {
        return list.get(itemNum);
    }
}