/*
	Name: Vishnu H Nair
	
*/
import java.util.Scanner;
import java.util.Comparator;
import java.util.Arrays;
import java.util.Arrays.*;

class StudentRankingSystem implements Comparable<StudentRankingSystem>{

	Scanner reader = new Scanner(System.in);
	private int rollNo;
	private String name;
	private float lang1, lang2, math, science, es;
	private float total;
	
	public StudentRankingSystem() {
		
		System.out.print("Roll No: ");
		rollNo = reader.nextInt();
		
		System.out.print("Name: ");
		name = reader.next();
		
		System.out.print("Marks in Language1: ");
		lang1 = reader.nextFloat();
		
		System.out.print("Marks in Language2: ");
		lang2 = reader.nextFloat();
		
		System.out.print("Marks in Mathematics: ");
		math = reader.nextFloat();
		
		System.out.print("Marks in Science: ");
		science = reader.nextFloat();
		
		System.out.print("Marks in Environmental Studies: ");
		es = reader.nextFloat();

		System.out.println("");

		total = lang1 + lang2 + math + science + es;
		
	}
	
	public String getName() {

		return name;
	}
	
	public int getRoll() {

		return rollNo;
	}
	
	public float getLang1() {

		return lang1;
	}
	
	public float getLang2() {

		return lang2;
	}
	
	public float getMath() {

		return math;
	}
	
	public float getScience() {

		return science;
	}
	
	public float getES() {

		return es;
	}
	
	public float getTotal() {

		return total;
	}
	
	public int compareTo(StudentRankingSystem student) {

		if(this.total > student.getTotal())
			return 1;
		if(this.total < student.getTotal())
			return -1;

		if(this.math > student.getMath())
			return 1;
		if(this.math < student.getMath())
			return -1;

		if(this.science > student.getScience())
			return 1;
		if(this.science < student.getScience())
			return -1;

		if(this.es > student.getES())
			return 1;
		if(this.es < student.getES())
			return -1;

		if(this.lang1 > student.getLang1())
			return 1;
		if(this.lang1 < student.getLang1())
			return -1;

		if(this.lang2 > student.getLang2())
			return 1;
		if(this.lang2 < student.getLang2())
			return -1;

		return -1*this.name.compareTo(student.name);
	}
	
	
	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);
		int n;
		System.out.println("\n************************ Student Ranking System ************************\n");
		System.out.print("Enter the number of students: ");
		n = reader.nextInt();
		while(n<5) {
			System.out.println("\nNumber of students must be atleast 5. Try again! \n");
			System.out.print("Enter the number of students: ");
			n = reader.nextInt();
		}

		StudentRankingSystem[] student = new StudentRankingSystem[n];
		for(int i = 0; i < n; i++) {
			System.out.printf("Enter the following details of Student %d \n" , i+1);
			student[i] = new StudentRankingSystem();
		}

		Arrays.sort(student,0,n);

		System.out.println("Rank\t\tRoll No\t\tName\t\tTotal\t\tMathes\t\tScience\t\tES\t\tLang 1\t\tLang 2");

		for(int i = n-1; i >= 0; i--) {
	 		System.out.println((n-i) + "\t\t" + student[i].rollNo + "\t\t" + student[i].name + "\t\t" + student[i].total + "\t\t" +
	 						   student[i].math + "\t\t" + student[i].science + "\t\t" + student[i].es + "\t\t" + student[i].lang1 +
	 						   "\t\t" + student[i].lang2); 		
	 	}

		reader.close();
	}
	
}
