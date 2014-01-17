package work.testing.controller;

import java.util.*;

/**
 * Created with IntelliJ IDEA.
 * User: Ксения
 * Date: 17.01.14
 * Time: 12:47
 * To change this template use File | Settings | File Templates.
 */
public class Test1 {

    public static void main(String[] args) {

        List<Employer> employers = new ArrayList<>();

        Employer emp = new Employer();
        emp.name = " Kseniya";
        emp.employer_count = 12;
        Employer emp1 = new Employer();
        emp1.name = " Rinat";
        emp1.employer_count = 10;
        Employer emp2 = new Employer();
        emp2.name = " Masha";
        emp2.employer_count = 5;
        employers.add(emp);
        employers.add(emp1);
        employers.add(emp2);
        for (int j = 0; j < employers.size(); j++) {
            for (int i = j + 1; i < employers.size(); i++) {
                if (employers.get(i).name.compareTo(employers.get(j).name) < 0) {
                    Employer temp = employers.get(j);
                    employers.set(j, employers.get(i));
                    employers.set(i, temp);


                }
            }
        }
        System.out.println(employers);
        for (int j = 0; j < employers.size(); j++) {
            for (int i = j + 1; i < employers.size(); i++) {
                if (employers.get(i).employer_count < employers.get(j).employer_count) {
                    Employer temp = employers.get(j);
                    employers.set(j, employers.get(i));
                    employers.set(i, temp);


                }
            }
        }
        System.out.println(employers);

    }
}
