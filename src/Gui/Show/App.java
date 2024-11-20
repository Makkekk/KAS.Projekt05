package Gui.Show;

import application.controller.Controller;
import javafx.application.Application;
import storage.Storage;
import java.time.LocalDate;

public class App {
    public static void main(String[] args) {
        Application.launch(MainWindow.class);
        //initializeStorage();
        //testPrint();
    }

        public static void testPrint() {
            Storage.getDeltagere().forEach(deltager -> System.out.println(deltager));
            Storage.getFirma().forEach(firma -> System.out.println(firma));
            Storage.getHoteller().forEach(hotel -> System.out.println(hotel));
            Storage.getKonferencer().forEach(konference -> System.out.println(konference));
            Storage.getLedsagere().forEach(ledsager -> System.out.println(ledsager));
            Storage.getUdflugter().forEach(udflugt -> System.out.println(udflugt));
        }


        private static void initializeStorage() {
            Controller.createDeltager("Bent betjent","Jordbærvænget 6","112");
            Controller.createDeltager("Grisse ghitte","På gården","911");
            Controller.createFirma("Big Corp","321321");
            Controller.createHotel("Fint hotel","Slængetvænget 52",200,10,5,10);
            Controller.createKonference("Vi ser på fugle","bøv stranden",LocalDate.of(2025,4,7),LocalDate.of(2026,5,2));
            Controller.createLedsager("Jens",Controller.createDeltager("jonna","københavn","202020"));
            Controller.createUdflugt("Fulgeudsigt","Strawberryfields",LocalDate.of(2024,12,11),100);





        }
    }

