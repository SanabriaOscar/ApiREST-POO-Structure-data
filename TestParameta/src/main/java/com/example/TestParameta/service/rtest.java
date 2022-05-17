package com.example.TestParameta.service;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class rtest {
    public static void main(String[] args) {

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate fechaNac = LocalDate.parse("1993-12-23", fmt);
        LocalDate ahora = LocalDate.now();

        Period periodo = Period.between(fechaNac, ahora);

        if (periodo.getYears()>=18){
            System.out.printf("Your age is: %s years, %s months and %s days",
                    periodo.getYears(), periodo.getMonths(), periodo.getDays());
        }
    }
}
