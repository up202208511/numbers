package com.aor.numbers;

import java.util.ArrayList;
import java.util.List;

public class ListFilterer implements GenericListFilter{
    public ListFilterer(GenericListFilter filter) {

    }

    public List<Integer> filter(List<Integer> list){
        List<Integer> filteredlist = new ArrayList<>();
        for (Integer number : list)
            if (accept(number))
                filteredlist.add(number);
        return filteredlist;
    }


    @Override
    public boolean accept(Integer number) {
        if (number > 0) return true;
        return false;
    }
}
