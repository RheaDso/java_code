class student{
    String name;
    int age;
    String program;
    student(String name,int age,String program){
        this.name = name;
        this.age = age;
        this.program = program;
    }
    String display_student_info(){
        String d = (name+" "+age+ " "+program);
        return d;
    }
}
class graduate extends  student{
    double percentage;
    String stream;

    graduate(String name,int age,String program,double percentage,String stream){
        super(name,age,program);
        this.percentage = percentage;
        this.stream = stream;
    }

    String display_student_info(){
        String s = (name+" "+age+ " "+program+" "+percentage+" "+stream);
        return s;
    }
    String update(String u){
        String s;
        {s=u;}
        return u;
    }
}
class research extends student{
    int years_exp;
    String specialization;
    research(String name,int age,String program,String specialization,int years_exp){
        super(name,age,program);
        this.specialization=specialization;
        this.years_exp=years_exp;

    }

    String display_student_info(){
        String s = (name+" "+age+ " "+program+" "+specialization+" "+years_exp);
        return s;
    }
    String update(String u){
        String s;
        {s=u;}
        return u;
    }
}
public class Q5 {
    public static void main(String[] args) {
        student s = new student("Mehak",19,"SY");
        System.out.println("Student:");
        System.out.println(s.display_student_info());
        System.out.println("----------------------------------");
        System.out.println("Graduate Student:");
        graduate g = new graduate("Swasti ",18,"SY",33,"Science");
        System.out.println(g.display_student_info());
        System.out.println("Updating Graduate student:");
        System.out.println(g.update("Aarti 19 FY 56 Commerce"));
        System.out.println("----------------------------------");

        System.out.println("Research Student:");
        research r = new research("Pradnya",19,"HK","Micro-biology",3);
        System.out.println(r.display_student_info());
        System.out.println(r.update("Mayuri 18 DF Physiotherapy 2"));
        System.out.println("----------------------------------");


    }
}
