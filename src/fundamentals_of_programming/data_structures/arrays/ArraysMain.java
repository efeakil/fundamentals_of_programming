package fundamentals_of_programming.data_structures.arrays;

import java.util.Arrays;

public class ArraysMain {

	public static void main(String[] args) {
		
		//creating Students
		Student student1 = new Student("efe","akil");
		Student student2 = new Student("mike","tyson");
		Student student3 = new Student("lady","gaga");
		
		// declares an Array and initializing  the elements of the array
		Student[] studentList = new Student[] {student1,student2,student3};
		
		//long for loop
		for (int i = 0; i < studentList.length; i++) {
			System.out.println(studentList[i].toString());
		}
		
		//short for loop
		for (Student s:studentList) {
			System.out.println(s.toString());
		}
		
		Arrays.stream(studentList).forEach(System.out::println);
		
		//copying array
		int[] numArray = {1,2,3,4,5};
		int[] cloneArray = numArray.clone();
		
		//deep copy
		System.out.println(numArray == cloneArray);
		
		int[][] numArray2D = {{1,2,3},{4,5}};
		int[][] cloneArray2D = numArray2D.clone();
		
		//deep copy
		System.out.println(numArray2D == cloneArray2D);
		
		//shallow copy
		System.out.println(numArray2D[0] == cloneArray2D[0]);
		System.out.println(numArray2D[1] == cloneArray2D[1]);
		
		
	}

}
