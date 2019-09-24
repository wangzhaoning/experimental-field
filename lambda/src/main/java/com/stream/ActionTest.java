package com.stream;


import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.summarizingInt;

public class ActionTest {

    public static void main(String[] args) {
        Traders traders1=Traders.builder().id("trader1").age(22).name("qaz").city("tianjin").build();
        Traders traders2=Traders.builder().id("trader2").age(23).name("qax").city("beijing").build();
        Traders traders3=Traders.builder().id("trader1").age(24).name("qac").city("beijing").build();
        List<Traders> tradersList=new ArrayList<>(Arrays.asList(traders1,traders2,traders3));
        List<String> traderCity= tradersList.stream().map(Traders::getCity).
                distinct().collect(Collectors.toList());
        System.out.println(traderCity);

    /********************************************************************************************************/

        List<Transactions> transactionsList =new ArrayList<>(Arrays.asList(
            new Transactions.Builder("1").time("2011").quora(15).traders(traders1).build(),
            new Transactions.Builder("2").time("2011").quora(3).traders(traders2).build(),
            new Transactions.Builder("3").time("2011").quora(80).traders(traders3).build(),
            new Transactions.Builder("4").time("2012").quora(80).build()
    ));
       List<Transactions> fliterList= transactionsList.stream().filter(
               (transactions) -> "2011".equals(transactions.getTime()))
               .sorted(Comparator.comparingInt(Transactions::getQuota).reversed())
               .distinct()
               .collect(Collectors.toList());
        System.out.println("fliterList >"+fliterList);
    /********************************************************************************************************/

    Optional<Transactions> optional=transactionsList.stream().max(Comparator.comparingInt(Transactions::getQuota));
        int i= optional.map(Transactions::getQuota).orElse(0);
        System.out.println(i);
        /********************************************************************************************************/
        Stream.iterate(1, n -> n + 2)
                .limit(10)
                .forEach(System.out::println);
        /********************************************************************************************************/
        IntSummaryStatistics intSummaryStatistics =
                transactionsList.stream().collect(summarizingInt(Transactions::getQuota));
        System.out.println("intSummaryStatistics >"+intSummaryStatistics);
    }


}
