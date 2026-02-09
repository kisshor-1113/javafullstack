package Mypackage;
	
		import java.util.HashSet;
		import java.util.Set;
		public class EmployeesHashset {
			public static void main(String[] args) {
				// TODO Auto-generated method stub
				Set<String> Team_A = new HashSet<>();
				Set<String> Team_B = new HashSet<>();
				Set<String> Team_Unique = new HashSet<>(Team_A);
				Set<String> Team_Common = new HashSet<>(Team_A);
				Team_A.add("lini");
				Team_A.add("Shakthi");
				Team_A.add("chatti");
				Team_A.add("tammy");
				Team_A.add("Loga");
				System.out.println("Employees from team A are : " + Team_A);
				Team_B.add("Suri");
				Team_B.add("Bhuvan");
				Team_B.add("Balu");
				Team_B.add("Rolex");
				Team_B.add("Kisshor");
				System.out.println("Employees from team B are : " + Team_B);
				for(String i : Team_A) {
					for(String j : Team_B) {
						if(i.equals(j)) {
								Team_Common.add(i);
						}}}
				System.out.println("Common employees"
						+ " from both the teams are :" + Team_Common);
				Team_Unique.addAll(Team_B);
				Team_Unique.addAll(Team_A);
				Team_Unique.removeAll(Team_Common);
				System.out.println("Unique employees "
						+ "from both the teams are :" + Team_Unique);
				
				
			}

		

	}


