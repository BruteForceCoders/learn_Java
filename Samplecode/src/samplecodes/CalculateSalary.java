package samplecodes;

import java.lang.Math;
import java.util.Scanner;
public class CalculateSalary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int basic = sc.nextInt();
        char grade = sc.next().charAt(0);
        double total = 0.0;
		double hra = basic*0.2;
        double da = basic*0.5;
        double pf = basic*0.11;
        double allow = 0.0;
        if(grade == 'A')
            allow = 1700.0;
        else if(grade == 'B')
            allow = 1500.0;
        else
            allow = 1300.0;
        
        System.out.println("Basic = "+basic+", hra = "+hra+", da = "+da+", allow = "+allow+", pf = "+pf);
        double net = ((basic+hra+da+allow)-pf);
        System.out.println(net);
        total = Math.round(net);
        System.out.println((int)total);

	}

}