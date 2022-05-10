package Model.Entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Contract {

    private Integer number;
    private Date date;
    private Double totalValue;

    private List<Installment> installmentList = new ArrayList<>();

    public Contract() {

    }

    public Contract(Integer number, Date date, Double totalValue) {
        this.number = number;
        this.date = date;
        this.totalValue = totalValue;
    }

    public Integer getNumber() {
        return number;
    }


    public Date getDate() {
        return date;
    }


    public Double getTotalValue() {
        return totalValue;
    }

    public List<Installment> getInstallmentList() {
        return installmentList;
    }

    public void addInstallment(Installment installment) {
        installmentList.add(installment);
    }

    public void removeInstallment(Installment installment) {
        installmentList.remove(installment);
    }
}