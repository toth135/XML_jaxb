package jaxb_beadando;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.util.List;
import java.util.Scanner;

public class KonzolProgram {
    public static void main(String[] args) throws JAXBException {

        String XML_PATH = "src/xml/autok.xml";
        JAXBContext jaxbContext = JAXBContext.newInstance(Autok.class);
        Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
        Autok autok = (Autok) jaxbUnmarshaller.unmarshal(new File(XML_PATH));

        boolean run = true;
        while (run) {
            System.out.println("\n(1) Beolvasás és listázás");
            System.out.println("(2) Lekérdezés");
            System.out.println("(3) Módosítás");;
            System.out.println("(4) Mentés");
            System.out.println("(0) Kilépés\n");
            System.out.println("\nVálasszon a fenti lehetőségek közül!");
            Scanner sc = new Scanner(System.in);
            int consoleNumber = sc.nextInt();
            switch (consoleNumber) {
                case 1:
                    for (Auto auto : autok.getAutok()) {
                        System.out.println("\nId: " + auto.getId());
                        System.out.println("Márka: " + auto.getAutomarka());
                        System.out.println("Típus: " + auto.getAutotipus());
                        System.out.println("Évjárat: " + auto.getEvjarat());
                        System.out.println("Hengerűrtartalom: " + auto.getHengerurtartalom() + "\n");
                    }
                    break;
                case 2:
                    System.out.println("\nKérem írja be a keresett évjáratot!");
                    boolean bool = false;
                    Scanner sc2 = new Scanner(System.in);
                    int year = sc2.nextInt();
                    for (Auto auto : autok.getAutok()) {
                        if(year == auto.getEvjarat()) {
                            bool = true;
                            break;
                        }
                        else bool = false;
                    }
                    if(bool) System.out.println("\nLétezik ilyen évjáratú autó.\n");
                    else System.out.println("\nNem létezik ilyen évjáratú autó.");
                    break;
                case 3:
                    System.out.println("\nKérem adja meg a módosítani kívánt hengerűrtartalom értéket!");
                    Scanner sc3 = new Scanner(System.in);
                    int engineCapacity = sc3.nextInt();
                    for (Auto auto : autok.getAutok()) {
                        auto.setHengerurtartalom(engineCapacity);
                    }
                    System.out.println("\nA módosítás megtörtént!");
                    break;
                case 4:
                    jaxbContext = JAXBContext.newInstance(Autok.class);
                    Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
                    jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
                    jaxbMarshaller.marshal(autok, new File(XML_PATH));
                    System.out.println("\nA mentés megtörtént!");
                    break;
                case 0:
                    run = false;
                default:
                    System.out.println("\nNem megfelelő számot adott meg!");
            }
        }
    }
}