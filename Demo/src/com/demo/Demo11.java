package com.demo;

import java.util.List;
import java.util.stream.Collectors;

public class Demo11 {

	public static void main(String[] args) {
		List<Integer> list= List.of(2,4,6,8,10,11,12,14);
		
		List<Integer > newList1= list.stream().filter(i->i%2==0).collect(Collectors.toList());
System.out.println(newList1);
	}

}
