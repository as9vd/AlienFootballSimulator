package FootballerAndManager;

public class Footballer {

    private String first;
    private String last;
    private String country;
    private int age;
    private double offence;
    private double defence;
    private double leadership;
    private double price;
    private double intangibles;
    private double consistency;
    private int bookings;

    public Footballer(String first, String last, String country, int age, double offence, double defence, double leadership, double intangibles, double consistency, double price) {
        this.first = first;
        this.last = last;
        this.country = country;
        this.age = age;
        this.offence = offence;
        this.defence = defence;
        this.leadership = leadership;
        this.price = price;
        this.intangibles = intangibles;
        this.consistency = consistency;
        this.bookings = 0;
    }

    public Footballer(String first, String country, int age, double offence, double defence, double leadership, double intangibles, double consistency, double price) {
        this.first = first;
        this.country = country;
        this.age = age;
        this.offence = offence;
        this.defence = defence;
        this.leadership = leadership;
        this.price = price;
        this.intangibles = intangibles;
        this.consistency = consistency;
    }

    @Override
    public String toString() {
        if (!(this.last == null)) {
            return this.first + " " + this.last;
        } else {
            return this.first;
        }

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

    public double getIntangibles() {
        return this.intangibles;
    }

    public double getConsistency() {
        return this.consistency;
    }

    public int getBookings() {
        return this.bookings;
    }

    public void setBookings(int bookings) {
        this.bookings = bookings;
    }

}