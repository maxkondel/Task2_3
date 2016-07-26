package task;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;

@XmlRootElement(name = "results")
public class Results {
    private ArrayList<Rate> rates;

    @XmlElement(name = "rate")
    public ArrayList<Rate> getRates() {
        return rates;
    }

    public void setRates(ArrayList<Rate> rates) {
        this.rates = rates;
    }

    public void add(Rate rate) {
        rates.add(rate);
    }

    public Results() {
    }

    public Results(ArrayList<Rate> rates) {
        this.rates = rates;
    }
}
