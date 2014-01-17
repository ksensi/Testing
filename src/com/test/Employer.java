package work.testing.controller;

/**
 * Created with IntelliJ IDEA.
 * User: Ксения
 * Date: 17.01.14
 * Time: 12:55
 * To change this template use File | Settings | File Templates.
 */
public class Employer {
    public String name;
    public String company_name;
    public int employer_count;

    @Override
    public String toString() {
        return "Employer{" +
                "name='" + name + '\'' +
                ", company_name='" + company_name + '\'' +
                ", employer_count=" + employer_count +
                '}';
    }
}
