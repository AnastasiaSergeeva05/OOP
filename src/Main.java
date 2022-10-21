public class Main {
    public static void main(String[] args) {

        Human[] humans = new Human[4];
        humans[0] = new Human("Максим", 35, "Минск", "бренд-менеджером");
        humans[1] = new Human("Аня", 29, "Москва", "методистом образовательных программ");
        humans[2] = new Human("Катя", 28, "Москва", "продакт-менеджером");
        humans[3] = new Human("Артем", 27, "Москва", "директором по развитию бизнеса");
        int a = 2022;

        System.out.println("Привет! Меня зовут " + humans[0].getName() +
                ". Я из города: " + humans[0].getTown() +
                ". Я родился в " + (a - humans[0].getYearOfBirth()) +
                " году. Я работаю на должности: " + humans[0].getJob() + ". Будем знакомы!");

        System.out.println("Привет! Меня зовут " + humans[1].getName() +
                ". Я из города: " + humans[1].getTown() +
                ". Я родился в " + (a - humans[1].getYearOfBirth()) +
                " году. Я работаю на должности: " + humans[1].getJob() + ". Будем знакомы!");

        System.out.println("Привет! Меня зовут " + humans[2].getName() +
                ". Я из города: " + humans[2].getTown() +
                ". Я родился в " + (a - humans[2].getYearOfBirth()) +
                " году. Я работаю на должности: " + humans[2].getJob() + ". Будем знакомы!");

        System.out.println("Привет! Меня зовут " + humans[3].getName() +
                ". Я из города: " + humans[3].getTown() +
                ". Я родился в " + (a - humans[3].getYearOfBirth()) +
                " году. Я работаю на должности: " + humans[3].getJob() + ". Будем знакомы!");

    }
}