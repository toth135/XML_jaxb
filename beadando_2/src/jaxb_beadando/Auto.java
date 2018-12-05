package jaxb_beadando;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "auto")
public class Auto {

    private int id;
    private String automarka;
    private String autotipus;
    private int evjarat;
    private int hengerurtartalom;

    public Auto(int id, String automarka, String autotipus, int evjarat, int hengerurtartalom) {
        this.id = id;
        this.automarka = automarka;
        this.autotipus = autotipus;
        this.evjarat = evjarat;
        this.hengerurtartalom = hengerurtartalom;
    }

    public Auto() {
    }

    public int getId() {
        return id;
    }

    @XmlAttribute(name = "id")
    public void setId(int id) {
        this.id = id;
    }

    public String getAutomarka() {
        return automarka;
    }

    @XmlElement(name = "automarka")
    public void setAutomarka(String automarka) {
        this.automarka = automarka;
    }

    public String getAutotipus() {
        return autotipus;
    }

    @XmlElement(name = "autotipus")
    public void setAutotipus(String autotipus) {
        this.autotipus = autotipus;
    }

    public int getEvjarat() {
        return evjarat;
    }

    @XmlElement(name = "evjarat")
    public void setEvjarat(int evjarat) {
        this.evjarat = evjarat;
    }

    public int getHengerurtartalom() {
        return hengerurtartalom;
    }

    @XmlElement(name = "hengerurtartalom")
    public void setHengerurtartalom(int hengerurtartalom) {
        this.hengerurtartalom = hengerurtartalom;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "id=" + id +
                ", automarka='" + automarka + '\'' +
                ", autotipus='" + autotipus + '\'' +
                ", evjarat=" + evjarat +
                ", hengerurtartalom=" + hengerurtartalom +
                '}';
    }
}
