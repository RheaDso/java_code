class Teacher {
    String name;
    Teacher(){
    }

    Teacher(String n) {
        name = n;
    }

    void display() {
        System.out.println(name);
    }
}
class Professor extends Teacher {
    String P_Name;
    Professor(String P_N)
    {
        P_Name = P_N;
    }

    void display(){
        System.out.println(P_Name);
    }
}
class Associate_Professor extends Teacher {
    String Ac_Name;
    Associate_Professor(String Ac_N){
        Ac_Name = Ac_N;
    }

    void display(){
        System.out.println(Ac_Name);
    }
}
class Assistant_Professor extends Teacher {
    String A_Name;
    Assistant_Professor(String A_N){
       A_Name = A_N;
    }

    void display(){
        System.out.println(A_Name);
    }
}

public class Q3 {
    public static void main(String[] args) {
        Teacher T1 = new Teacher("Arohi");
//        T1.display();
        Professor P1 = new Professor("Vinanti");
        P1.display();
        Associate_Professor AP1 = new Associate_Professor("Varun");
        AP1.display();
        Assistant_Professor A1 = new Assistant_Professor("Alankrit");
        A1.display();
    }
}