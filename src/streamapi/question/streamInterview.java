package streamapi.question;

import java.util.*;
import java.util.stream.Collectors;

public class streamInterview {

    //1.Write a Program to find the duplicates in an array using stream API.
    public static List<Integer> listOfDuplicate(List<Integer> list){
    list.stream().filter(a-> Collections.frequency(list,a)>1).
            distinct().forEach(e->System.out.print(e));
    return list;
    }

    //2. Find an average of even numbers using Java using Java 8 stream API.
    public static OptionalDouble findAverage(List<Integer> list){
        OptionalDouble avgSum= list.stream().filter(i->i%2==0).mapToDouble(Integer::intValue).average();
        return avgSum;
    }

    //3. Find the 2nd highest from given array it might contain duplicate values
    public static Optional<Integer> secondHighest(List<Integer> list){
        Map<Integer,Long> freqMap= list.stream().
                collect(Collectors.groupingBy(e->e,Collectors.counting()));
        Optional<Integer> a = Optional.of(freqMap.keySet().stream().max(Comparator.comparing(Integer::intValue))
                .orElse(0));
        if(a.isPresent()){
            return a;
        }
        return null;

        // OR
        // Optional<Integer> a = list.stream().
        // distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst();
    }

    //Find the duplicate element and its occurrence in a given string using the Stream API.

    public static void duplicateElement(List<Integer> list){
        list.stream().filter(e -> (Collections.frequency(list,e)>1))
                .collect(Collectors.groupingBy(i -> i,Collectors.counting()))
               .entrySet().stream().forEach(e -> System.out.println(e.getKey() + ":" + e.getValue()));

    }

    public static void main(String[] args) {
        Integer[] arr= new Integer[] {1,2,3,3,1,2,4,6,7,10,9,10};
        List<Integer> list = Arrays.asList(arr);
        listOfDuplicate(list);
        findAverage(list);
        secondHighest(list);
        duplicateElement(list);
    }
}
