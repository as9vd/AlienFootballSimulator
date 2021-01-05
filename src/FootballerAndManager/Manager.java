package FootballerAndManager;

public class Manager {

    private String first;
    private String last;
    private String country;
    private int age;
    private double offence;
    private double defence;
    private double leadership;
    private double price;
    private double creativity;
    private double versatility;

    public Manager(String first, String last, String country, int age, double offence, double defence, double leadership, double creativity, double versatility, double price) {
        this.first = first;
        this.last = last;
        this.country = country;
        this.age = age;
        this.offence = offence;
        this.defence = defence;
        this.leadership = leadership;
        this.creativity = creativity;
        this.versatility = versatility;
        this.price = price;
    }

    public String getFirst() {
        return this.first;
    }

    public String getLast() {
        return this.last;
    }

    public String getCountry() {
        return this.country;
    }

    public int getAge() {
        return this.age;
    }

    public double getOffence() {
        return this.offence;
    }

    public double getDefence() {
        return this.defence;
    }

    public double getLeadership() {
        return this.leadership;
    }

    public double getPrice() {
        return this.price;
    }

    @Override
    public String toString() {
        if (!(this.last == null)) {
            return this.first + " " + this.last;
        } else {
            return this.first;
        }

    }

}