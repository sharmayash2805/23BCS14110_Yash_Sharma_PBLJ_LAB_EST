import java.util.HashMap;
import java.util.Map;
public class map {
    public static void main(String[] args) {
        HashMap<Integer, String> employeeMap = new HashMap<>();
        employeeMap.put(101, "Hten");
        employeeMap.put(102, "Shivam");
        employeeMap.put(103, "Rahul");
        employeeMap.put(104, "Yash");
        System.out.println("Employee Details: " + employeeMap);
        System.out.println("\nIterating using keySet():");
        for (Integer id : employeeMap.keySet()) {
            System.out.println("ID: " + id + ", Name: " + employeeMap.get(id));
        }
        System.out.println("\nIterating using entrySet():");
        for (Map.Entry<Integer, String> entry : employeeMap.entrySet()) {
            System.out.println("ID: " + entry.getKey() + ", Name: " + entry.getValue());
        }
    }
}
