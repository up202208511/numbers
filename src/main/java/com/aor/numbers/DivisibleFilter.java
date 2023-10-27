package com.aor.numbers;

import java.util.ArrayList;
import java.util.List;

public class DivisibleFilter implements GenericListFilter {
    public DivisibleFilter(GenericListFilter filter){}
    public List<Integer> divfilter(List<Integer> list, Integer divnum){
        List<Integer> filteredlist = new ArrayList<>();
        for (Integer number : list)
            if (number % divnum == 0)
                filteredlist.add(number);
        return filteredlist;
    }
    @Override
    public boolean accept(Integer number) {
        return false;
    }
}
