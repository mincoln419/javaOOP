package com.mermer.oop.service;

import com.mermer.oop.BubbleSort;
import com.mermer.oop.JavaSort;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;



class SortServiceTest {

    private SortService sortService = new SortService(new BubbleSort<>());

    @Test
    void doSort() {
        //given

        //when
        List<String> actual = sortService.doSort(List.of("3", "2", "1"));

        //then
        assertEquals(List.of("1", "2", "3"), actual);
    }
}