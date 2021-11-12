class College
{
    College(String S, String T){
        this(5);
        System.out.println(S +"\n "+ T);
    }
    College(int ID) {
        this("50000");
        System.out.println(ID);
    }
    College(String Salary) {
        System.out.println(Salary);
    }
}

public class Q2 {

    public static void main(String[] args) {
        College c1 = new College("RHEA", "DSOUZA");
    }
}
