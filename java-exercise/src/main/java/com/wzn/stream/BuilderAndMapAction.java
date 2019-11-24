package com.wzn.stream;


import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.summarizingInt;

public class BuilderAndMapAction {

    public static void main(String[] args) {
        BeanOfTraders traders1= BeanOfTraders.builder().id("trader1").age(22).name("qaz").city("tianjin").build();
        BeanOfTraders traders2= BeanOfTraders.builder().id("trader2").age(23).name("qax").city("beijing").build();
        BeanOfTraders traders3= BeanOfTraders.builder().id("trader1").age(24).name("qac").city("beijing").build();
        List<BeanOfTraders> tradersList=new ArrayList<>(Arrays.asList(traders1,traders2,traders3));
        List<String> traderCity= tradersList.stream().map(BeanOfTraders::getCity).
                distinct().collect(Collectors.toList());
        System.out.println(traderCity);

    /********************************************************************************************************/

        List<BeanOfTransactions> transactionsList =new ArrayList<>(Arrays.asList(
            new BeanOfTransactions.Builder("1").time("2011").quora(15).traders(traders1).build(),
            new BeanOfTransactions.Builder("2").time("2011").quora(3).traders(traders2).build(),
            new BeanOfTransactions.Builder("3").time("2011").quora(80).traders(traders3).build(),
            new BeanOfTransactions.Builder("4").time("2012").quora(80).build()
    ));
       List<BeanOfTransactions> fliterList= transactionsList.stream().filter(
               (transactions) -> "2011".equals(transactions.getTime()))
               .sorted(Comparator.comparingInt(BeanOfTransactions::getQuota).reversed())
               .distinct()
               .collect(Collectors.toList());
        System.out.println("fliterList >"+fliterList);
    /********************************************************************************************************/

    Optional<BeanOfTransactions> optional=transactionsList.stream().max(Comparator.comparingInt(BeanOfTransactions::getQuota));
        int i= optional.map(BeanOfTransactions::getQuota).orElse(0);
        System.out.println(i);
        /********************************************************************************************************/
        Stream.iterate(1, n -> n + 2)
                .limit(10)
                .forEach(System.out::println);
        /********************************************************************************************************/
        IntSummaryStatistics intSummaryStatistics =
                transactionsList.stream().collect(summarizingInt(BeanOfTransactions::getQuota));
        System.out.println("intSummaryStatistics >"+intSummaryStatistics);
    }


}
