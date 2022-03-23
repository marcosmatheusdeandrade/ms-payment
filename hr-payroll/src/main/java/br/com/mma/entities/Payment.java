package br.com.mma.entities;

import javax.persistence.Entity;
import java.math.BigDecimal;

@Entity
public class Payment {

    private String name;
    private BigDecimal dailyIncome;
    private Integer days;
    private BigDecimal total;

    public Payment(String name, BigDecimal dailyIncome, Integer days) {
        this.name = name;
        this.dailyIncome = dailyIncome;
        this.days = days;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getDailyIncome() {
        return dailyIncome;
    }

    public void setDailyIncome(BigDecimal dailyIncome) {
        this.dailyIncome = dailyIncome;
    }

    public Integer getDays() {
        return days;
    }

    public void setDays(Integer days) {
        this.days = days;
    }

    public BigDecimal getTotal() {
        return dailyIncome.multiply(BigDecimal.valueOf(days));
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }
}
