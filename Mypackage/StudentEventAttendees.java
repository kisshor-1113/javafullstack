package Mypackage;
		import java.util.*;

		public class StudentEventAttendees {
		    public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);
		        Map<String, Set<String>> common = new HashMap<>();
		        System.out.print("Enter number of students in Dance Event : ");
		        int n1 = sc.nextInt();
		        Set<String> event1 = new HashSet<>();
		        System.out.println("Enter students for Dance :");
		        for (int i = 0; i < n1; i++) {
		            event1.add(sc.next());
		        }
		        common.put("event1", event1);
		        System.out.print("Enter number of students in Singing Event : ");
		        int n2 = sc.nextInt();
		        Set<String> event2 = new HashSet<>();
		        System.out.println("Enter students for Singing :");
		        for (int i = 0; i < n2; i++) {
		            event2.add(sc.next());
		        }
		        common.put("event2", event2);
		        System.out.print("Enter number of students in Boxing Event : ");
		        int n3 = sc.nextInt();
		        Set<String> event3 = new HashSet<>();
		        System.out.println("Enter students for Boxing :");
		        for (int i = 0; i < n3; i++) {
		            event3.add(sc.next());
		        }
		        common.put("event3", event3);
		        Set<String> commonStudents = new HashSet<>(event1);
		        commonStudents.retainAll(event2);
		        commonStudents.retainAll(event3);

		        System.out.println(commonStudents);
		    sc.close();
		    }
		}

	


