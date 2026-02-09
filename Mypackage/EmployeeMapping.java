package Mypackage;

		import java.util.HashMap;
		import java.util.HashSet;
		import java.util.Map;
		import java.util.Map.Entry;
		import java.util.Scanner;
		import java.util.Set;

		public class EmployeeMapping {
		    public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);
		        System.out.println("Enter the Size : ");
		        int size = sc.nextInt();
		        
		        String[] empName = new String[size];
		        for (int i = 0; i < empName.length; i++) {
		            System.out.println("Enter the Employee Name : ");
		            empName[i] = sc.next();
		        }
		        
		        String[] deptName = new String[size];
		        for (int i = 0; i < deptName.length; i++) {
		            System.out.println("Enter the Department Name : ");
		            deptName[i] = sc.next();
		        }
		        
		        System.out.println("The Employees Names ");
		        for (String i : empName) {
		            System.out.println(i);
		        }
		        System.out.println("The Department Names ");
		        for (String i : deptName) {
		            System.out.println(i);
		        }
		        
		        Map<String, Set<String>> emp = new HashMap<>();
		        for (int i = 0; i < empName.length; i++) {
		            emp.computeIfAbsent(deptName[i], k -> new HashSet<>()).add(empName[i]);
		        }
		        
		        for (Entry<String, Set<String>> i : emp.entrySet()) {
		            System.out.println(i.getKey() + "->" + i.getValue());
		        }
		        sc.close();
		    }
		}

	


