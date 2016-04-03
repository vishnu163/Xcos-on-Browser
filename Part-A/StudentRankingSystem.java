import java.util.Scanner;

public class StudentRankingSystem {

	Scanner reader = new Scanner(System.in);
	private int rollNo;
	private String name;
	private float lang1, lang2, math, science, es;
	private float total = 0;
	
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
		total = lang1 + lang2 + math + science + es;
		return total;
	}
	
	public void PrintRollNo() {
		System.out.println("Roll No :" + rollNo);
	}
	
	public void Rank(StudentRankingSystem s[]) {
		
	}
	
	
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int n;
		System.out.print("Enter the number of students: ");
		n = reader.nextInt();

		StudentRankingSystem[] student = new StudentRankingSystem[n];
		for(int i = 0; i < n; i++) {
			System.out.printf("Enter the following details of Student %d \n" , i+1);
			student[i] = new StudentRankingSystem();
		}
		
		reader.close();
	}
	
}
