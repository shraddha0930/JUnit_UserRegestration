package day23Practiceproblem;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class UserRegistrationLambda
{
	
	public static void main(String[] args) 
	{
		
		Pattern firstnamepattern,lastnamepattern,emailpattern,mobilenopattern,passwordpattern;

		System.out.println("1. Valid First Name :");
		List<String> firstname = Arrays.asList("Pratik", "Abc", "abc", "abYZS");
		firstnamepattern = Pattern.compile("^[A-Z]{1}[a-z]{2,}$");

		// Using regex with lambda expression
		List<String> firstnamelist = firstname.stream().filter(p -> firstnamepattern.matcher(p).find()).collect(Collectors.<String>toList());
		firstnamelist.forEach(System.out::println);

		System.out.println("2. Valid Last Name :");
		List<String> lastname = Arrays.asList("Ingole", "Abc", "abc", "abYZS");
		lastnamepattern = Pattern.compile("^[A-Z]{1}[a-z]{2,}$");
		
		// Using regex with lambda expression
		List<String> lastnamelist = lastname.stream().filter(p -> lastnamepattern.matcher(p).find()).collect(Collectors.<String>toList());
		lastnamelist.forEach(System.out::println);

		System.out.println("3. Valid Email :");
		List<String> email = Arrays.asList("abc@yahoo.com", "abc.100@yahoo.com", "abc123@.com.com","abc@abc@gmail.com");
		emailpattern = Pattern.compile("^[a-zA-Z0-9][a-zA-Z0-9_+]*([.][a-zA-Z0-9]+)?[@][a-zA-Z0-9]+[.][a-z]{2,4}([.][a-zA-Z]{2,4})?$");

		// Using regex with lambda expression
		List<String> emaillist = email.stream().filter(p -> emailpattern.matcher(p).find()).collect(Collectors.<String>toList());
		emaillist.forEach(System.out::println);
		

		System.out.println("4. Valid Mobile No :");
		List<String> mobileno = Arrays.asList("+91 8696858686", "91 8696858686", "918696858686", "+918696858686");
		mobilenopattern = Pattern.compile("^[91]{2}(\\s)[6-9]{1}[0-9]{9}$");
		
		// Using regex with lambda expression
		List<String> mobilenolist = mobileno.stream().filter(p -> mobilenopattern.matcher(p).find()).collect(Collectors.<String>toList());
		mobilenolist.forEach(System.out::println);

		System.out.println("5. Valid Password :");
		List<String> password = Arrays.asList("PRATIK0907@", "121Pasd@", "pratik@1", "PRA@08");
		passwordpattern = Pattern.compile("^[A-Za-z0-9!@#$%^&*]{8,}$");
		 
		// Using regex with lambda expression
		List<String> passwordlist = password.stream().filter(p -> passwordpattern.matcher(p).find()).collect(Collectors.<String>toList());
		passwordlist.forEach(System.out::println);

	}
}