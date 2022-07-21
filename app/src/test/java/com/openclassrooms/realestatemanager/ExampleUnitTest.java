package com.openclassrooms.realestatemanager;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Calendar;
import java.util.Date;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }
    @Test
    public void convertDollarToEuro() {
        // 100$ =>81€
        final int dollars = 100;
        final int euros = Utils.convertDollarToEuro(dollars);
        assertEquals(euros, 81);
    }

    @Test
    public void convertEuroToDollar() {
        // 81€ => 100$
        final int euros = 81;
        final int dollars = Utils.convertEuroToDollar(euros);
        assertEquals(dollars, 100);
    }

    @Test
    public void formatDateToEuropean() {
        Date toDay = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(toDay);
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        int month = calendar.get(Calendar.MONTH) + 1 ;
        int year = calendar.get(Calendar.YEAR);
        final String expectedString = String.format("%02d/%02d/%04d", day, month, year);
        final String toDayString = Utils.formatDateToEuropean();
        assertEquals(toDayString, expectedString);
    }
    @Test
    public void getTodayDate() {
        Date toDay = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(toDay);
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        int month = calendar.get(Calendar.MONTH) + 1 ;
        int year = calendar.get(Calendar.YEAR);
        final String expectedString = String.format("%02d/%02d/%04d", day, month, year);
        final String toDayString = Utils.getTodayDate();
        assertEquals(toDayString, expectedString);
    }
}