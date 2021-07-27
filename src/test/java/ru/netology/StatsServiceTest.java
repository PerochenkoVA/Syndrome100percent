package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {
    @Test
    void findMax(){
        StatsService service = new StatsService();
        long [] incomesInBillions = {12,5,8,4,5,3,8,6,11,11,12};
        long expexted = 12;
        long actual = service.findMax(incomesInBillions);
        assertEquals(expexted, actual);
    }
}