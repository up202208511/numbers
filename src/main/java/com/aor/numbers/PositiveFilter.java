package com.aor.numbers;

import java.util.ArrayList;
import java.util.List;

public class PositiveFilter implements GenericListFilter {
    public PositiveFilter(GenericListFilter filter){}
    public List<Integer> posfilter(List<Integer> list){
        List<Integer> filteredlist = new ArrayList<>();
        for (Integer number : list)
            if (number > 0)
                filteredlist.add(number);
        return filteredlist;
    }

    @Override
    public boolean accept(Integer number) {
        return false;
    }
}
