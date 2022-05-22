package java11;

public class Main {

    public static void main(String[] args) {
       Course c = new Course(new String[]{"Run", "Swim"});
       Team team = new Team("Viktoria", new String[]{"Oleg", "Nik", "Liza", "Kate"});
       c.doIt(team);
       team.showStatus();
    }
}
