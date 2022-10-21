
public class Human {

    String name;
    int yearOfBirth;
    String town;
    String job;

    public String getName() {
        return name;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public String getTown() {
        return town;
    }

    public String getJob() {
        return job;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", yearOfBirth=" + yearOfBirth +
                ", town='" + town + '\'' +
                ", job='" + job + '\'' +
                '}';
    }

    public Human(String name, int yearOfBirth, String town, String job) {
        if (yearOfBirth < 0) {
            this.yearOfBirth = 0;
        } else {
            this.yearOfBirth = yearOfBirth;
        }

        if (name == null) {
            this.name = "Информация не найдена";
        } else {
            this.name = name;
        }

        if (town == null) {
            this.town = "Информация не найдена";
        } else {
            this.town = town;
        }
        if (job == null) {
            this.job = "Информация не найдена";
        } else {
            this.job = job;
        }
    }

}








