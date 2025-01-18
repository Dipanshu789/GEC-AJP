import java.io.BufferedReader;

import java.io.InputStreamReader;

class client{
 public static void main(String[] args) {
    System.out.println("Enter the name of employee to connect");
    InputStreamReader i = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(i);
    String str = br.readLine();
    System.out.println("Enter age");
    String str1 = br.readLine();
    int age = Integer.parseInt(str);
    System.err.println("gender M/F");
    char gen =br.readLine().charAt();
  System.out.println("name of line employee"+str);
System.out.println("age"+age);
System.out.println("gender"+gen);
 }}
