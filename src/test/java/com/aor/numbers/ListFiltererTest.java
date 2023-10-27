package com.aor.numbers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class ListFiltererTest {
    private List<Integer> list1;
    private List<Integer> list2;
    private List<Integer> list3;
    ListAggregator aggregator;

    @BeforeEach
    public void helper(){ // we give an initial value to variables previously made
        list1 = Arrays.asList(1,2,4,2,5);
        aggregator = new ListAggregator();
        list2 = Arrays.asList(1,2,4,6,7,8,9);
        list3 = Arrays.asList(1,-2,5,-4,3);
    }

    @Test
    public void filter(){
        ListFilterer list_filterer = new ListFilterer();
        List<Integer> list_ = ListFilterer.filter(list1);
        Assertions.assertEquals(Arrays.asList(1,2,4,2,5), list_ );
    }

    @Test
    public void posfilter(){
        List<Integer> list_ = PositiveFilter.posfilter(list2);

        Assertions.assertEquals(Arrays.asList(1,5,3), list_);
    }

    @Test
    public void divfilter(){
        List<Integer> list_ = DivisibleFilter.divfilter(list3);

        Assertions.assertEquals(Arrays.asList(2,4,6,8), list_);
    }
}

