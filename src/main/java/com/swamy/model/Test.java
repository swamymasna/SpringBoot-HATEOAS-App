package com.swamy.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Test {
	// ************Java8 Coding ************
	public static void main(String[] args) {
		
		List<String> prjs = new ArrayList<>();
		prjs.add("A");
		prjs.add("B");

		List<Employee> list = new ArrayList<>();
		list.add(new Employee(10, "SWAMY", 56000.00, prjs));
		list.add(new Employee(12, "KIRAN", 74000.00, prjs));
		list.add(new Employee(13, "ARYA", 96000.00, prjs));
		list.add(new Employee(13, "ARYA", 96000.00, prjs));

		// list.stream().forEach(emp -> System.out.println(emp));

		// List<Double> empsSal = list.stream().map(emp ->
		// emp.getEmpSal()).collect(Collectors.toList());
		// empsSal.forEach(System.out::println);

		// Double reduce = list.stream().map(Employee::getEmpSal).reduce(0.0,
		// Double::sum);
		// System.out.println(reduce);

		// Double avgSal =
		// list.stream().collect(Collectors.averagingDouble(Employee::getEmpSal));
		// System.out.println(avgSal);

		// Map<Object, Object> map = list.stream().collect(Collectors.toMap(s->s,
		// s->s.equals(s), (s1,s2)->s1));
		// map.entrySet().forEach(System.out::println);

		// Map<Object, Object> map = list.stream().collect(Collectors.toMap(k->k,
		// v->v));
		// map.entrySet().forEach(System.out::println);
		// //System.out.println(map);

		// //Count
		// Long collect = list.stream().collect(Collectors.counting());
		// System.out.println(collect);

		// //To Collection
		// LinkedList<Employee> collect =
		// list.stream().collect(Collectors.toCollection(LinkedList::new));
		// System.out.println(collect);

		// //Min Sal
		// Optional<Employee> minSal =
		// list.stream().collect(Collectors.minBy(Comparator.comparing(Employee::getEmpSal)));
		// System.out.println(minSal.get());
		// // Max Sal
		// Optional<Employee> maxSal =
		// list.stream().collect(Collectors.maxBy(Comparator.comparing(Employee::getEmpSal)));
		// System.out.println(maxSal.get());

		// // sum of sals
		// Double sumOfSal =
		// list.stream().collect(Collectors.summingDouble(Employee::getEmpSal));
		// System.out.println(sumOfSal);

		// // Joinig String Data
		// String joining = Stream.of("J", "A", "V", "A").collect(Collectors.joining());
		// System.out.println(joining);

		// //to get complete details of collection
		// DoubleSummaryStatistics summaryStatistics =
		// list.stream().collect(Collectors.summarizingDouble(Employee::getEmpSal));
		// System.out.println(summaryStatistics);

		// //groupingBy
		// Map<String, List<Employee>> collect =
		// list.stream().collect(Collectors.groupingBy(Employee::getEmpName));
		// System.out.println(collect);

		// // Partitioning based on salary
		// Map<Boolean, List<Employee>> partitionedMap =
		// list.stream().collect(Collectors.partitioningBy(emp-> emp.getEmpSal() >
		// 60000.0));
		// partitionedMap.entrySet().forEach(System.out::println);


//		//reduce
//		Optional<Double> reducedValue = list.stream().map(emp-> emp.getEmpSal()).reduce((a,b)->a+b);
//		System.out.println(reducedValue.get());

//		//findFirst
//		Optional<Employee> findFirst = list.stream().filter(emp->emp.getEmpName().equals("SWAMY")).findFirst();
//		System.out.println(findFirst.get());

//		//		//findAny
//		Optional<Employee> findAny = list.stream().filter(emp->emp.getEmpName().equals("SWAMY")).findAny();
//		System.out.println(findAny.get());


//		list.stream().distinct().forEach(System.out::println);
//		list.stream().distinct().limit(1).forEach(System.out::println);
//		list.stream().distinct().limit(3).skip(1).forEach(System.out::println);
		
		Map<Employee, Employee> map = list.stream().distinct().collect(Collectors.toMap(k->k,v->v));
		map.entrySet().forEach(System.out::println);
	}
}
