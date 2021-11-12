class sportsperson
{
    String name;
    sportsperson() {
    }
    sportsperson(String n) {
        name = n;
    }
    void display_all_info() {
        System.out.println();
    }
}
class hockey extends sportsperson
{
    int score;
    hockey(String n, int scr)
    {
        super(n);
        score = scr;
    }
    void display_all_info()
    {
        System.out.println(name + " " + score);
    }
}
class athlete extends sportsperson
{
    String event;
    athlete(String n, String eve)
    {
        super(n);
        event = eve;
    }
    void display_all_info()
    {
        System.out.println(name + " " + event);
    }
}
public class Q7
{
    public static void main(String[] args)
    {
        hockey h = new hockey("SPORT", 10);
        h.display_all_info();

        athlete a = new athlete("RHEA", "FOOTBALL");
        a.display_all_info();
    }
}
