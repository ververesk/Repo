package udemy.generics.game;

public class Test {
    public static void main(String[] args) {
        Schoolar schoolar1=new Schoolar("Ivan",13);
        Schoolar schoolar2=new Schoolar("Maria",14);
        Schoolar schoolar3=new Schoolar("Oleg",14);
        Schoolar schoolar4=new Schoolar("Alex",14);

        Student st1=new Student("Igor",18);
        Student st2=new Student("Ivanna",19);

        Employee employee1=new Employee("Zaur",35);
        Employee employee2=new Employee("Alex",40);

        Team <Schoolar> schoolarTeam1=new Team("schoolarTeamFirst");
        Team <Schoolar> schoolarTeam2=new Team("schoolarTeamSecond");
        Team <Student> studentTeam=new Team("studentTeam");
        Team <Employee> employeeTeam=new Team("employeeTeam");

        schoolarTeam1.addNewParticipant(schoolar1);
        schoolarTeam1.addNewParticipant(schoolar2);

        schoolarTeam2.addNewParticipant(schoolar3);
        schoolarTeam2.addNewParticipant(schoolar4);

        studentTeam.addNewParticipant(st1);
        studentTeam.addNewParticipant(st2);

        employeeTeam.addNewParticipant(employee1);
        employeeTeam.addNewParticipant(employee2);


        schoolarTeam1.playWith(schoolarTeam2);

    }
}
