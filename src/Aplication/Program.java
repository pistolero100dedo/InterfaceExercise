package Aplication;

import Model.Entities.Contract;
import Model.Entities.Installment;
import Model.Services.ContractService;
import Model.Services.PaypalService;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Enter the contract data");
        System.out.print("Number: ");
        int number = sc.nextInt();
        sc.nextLine();
        System.out.print("Date (dd/MM/yyyy): ");
        Date start = sdf.parse(sc.nextLine());
        System.out.print("Contract value: ");
        double totalValue = sc.nextDouble();

        Contract contract = new Contract(number, start, totalValue);

        System.out.print("Enter the number of installments: ");
        int installment = sc.nextInt();

        ContractService contractService = new ContractService(new PaypalService());

        contractService.processContract(contract, installment);


        System.out.println("Installments");

        for (Installment installments : contract.getInstallmentList()) {
            System.out.println(installments);
        }
        sc.close();
    }
}
