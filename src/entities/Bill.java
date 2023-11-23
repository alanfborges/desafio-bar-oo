package entities;

public class Bill {

    private char gender;
    private int beer;
    private int barbecue;
    private int softDrink;

    public Bill() {
    }

    public Bill(char gender, int beer, int barbecue, int softDrink) {
        this.gender = gender;
        this.beer = beer;
        this.barbecue = barbecue;
        this.softDrink = softDrink;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getBeer() {
        return beer;
    }

    public void setBeer(int beer) {
        this.beer = beer;
    }

    public int getBarbecue() {
        return barbecue;
    }

    public void setBarbecue(int barbecue) {
        this.barbecue = barbecue;
    }

    public int getSoftDrink() {
        return softDrink;
    }

    public void setSoftDrink(int softDrink) {
        this.softDrink = softDrink;
    }

    public double cover() {
        if (this.feeding() > 30.0) {
            return 0.0;
        }
        return 4.0;
    }

    public double feeding() {
        double beerPrice = 5.0;
        double softDrinkPrice = 3.0;
        double barbecuePrice = 7.0;
        double totalFeeding = beerPrice * this.beer +
                softDrinkPrice * this.softDrink + barbecuePrice * this.barbecue;
        return totalFeeding;
    }

    public double ticket() {
        if (this.gender == 'M') {
            return 10.0;
        }
        return 8.0;
    }

    public double total() {
        return this.cover() + this.feeding() + this.ticket();
    }

    @Override
    public String toString() {
        return "Valor a pagar = R$"
                + String.format("%.2f", this.total());
    }
}
