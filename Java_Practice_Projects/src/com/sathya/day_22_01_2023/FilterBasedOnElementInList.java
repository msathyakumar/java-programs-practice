package com.sathya.day_22_01_2023;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import java.util.function.Predicate;

import java.util.stream.Collectors;

public class FilterBasedOnElementInList {

	
	public static void main(String[] args) {
		List<Product> product = new ArrayList<>();
		product.add(new Product(1, "keyboard", 1000));
		product.add(new Product(2, "keyboard", 600));
		product.add(new Product(3, "keyboard", 1000));
		product.add(new Product(4, "HDD", 5000));
		product.add(new Product(5, "Headphones", 1000));
		
		List<Product> collect = product.stream().filter(distinctByKey(a->a.getName())).collect(Collectors.toList());
		System.out.println(collect.toString());
	}
	public static <T> Predicate<T> distinctByKey(Function<? super T,Object> keyExtracter){
		Map<Object, Boolean>map = new ConcurrentHashMap<>();
		return t ->map.putIfAbsent(keyExtracter.apply(t),Boolean.TRUE) ==null;
	}
	}
