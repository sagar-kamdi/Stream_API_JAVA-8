package com.Stream_API;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExamples {

    public static void main(String[] args) {
        List<String> stringList = new ArrayList<String>();

        stringList.add("ONE");
        stringList.add("TWO");
        stringList.add("THREE");
        stringList.add("ONE");
        stringList.add("TWO");

        Stream<String> stream = stringList.stream();

        long count = stream
            .map((value) -> { return value.toLowerCase(); })
            .count();

        System.out.println("count = " + count);
        System.out.println("--------------------------------");
        //
        
        Stream<String> stream1 = stringList.stream();

        List<String> distinctStrings = stream1
                .distinct()
                .collect(Collectors.toList());

        System.out.println(distinctStrings);
        System.out.println("--------------------------------");
        //
        
        /*
         * This first creates a Stream, then calls limit() on it, 
         * and then calls forEach() with a lambda that prints out the elements in the stream.
         *  Only the two first elements will be printed because of the limit(2) call.
         */
        
        List<String> stringList1 = new ArrayList<String>();

        stringList1.add("one");
        stringList1.add("two");
        stringList1.add("three");
        stringList1.add("one");

        Stream<String> _limit = stringList1.stream();
        _limit
            .limit(2)
            .forEach( element -> { System.out.println(element); }); 
        
        System.out.println("--------------------------------");
        
        //

        List<String> stringList11 = new ArrayList<String>();

        stringList11.add("One flew over the cuckoo's nest");
        stringList11.add("To kill a muckingbird");
        stringList11.add("Gone with the wind");

        Stream<String> stream111 = stringList11.stream();

        stream111.flatMap((value) -> {
            String[] split = value.split(" ");
            return (Stream<String>) Arrays.asList(split).stream();
        })
        .forEach((value) -> System.out.println(value))
        ;
        System.out.println("--------------------------------");
        
        //if the Optional returned contains an element via its isPresent() method.
        Stream<String> first = stringList.stream();

        Optional<String> result = first.findFirst();

        System.out.println(result.get());
        System.out.println("--------------------------------");
       
        
        

    }
}