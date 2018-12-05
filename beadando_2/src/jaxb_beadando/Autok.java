package jaxb_beadando;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name = "autok")
@XmlAccessorType(XmlAccessType.FIELD)
public class Autok {

    @XmlElement(name = "auto")
    private List<Auto> autok = null;

    public List<Auto> getAutok() {
        return autok;
    }

    public void setAutok(List<Auto> autok) {
        this.autok = autok;
    }

}
