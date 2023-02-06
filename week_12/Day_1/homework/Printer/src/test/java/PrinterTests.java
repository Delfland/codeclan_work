import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PrinterTests {

    Printer printer;

    @Before
    public void setup() {
        printer = new Printer(100, 20);
    }

    @Test
    public void printerHasANumberOfSheetsOfPaper() {
        assertEquals(100, printer.getPaperTotal());
    }

    @Test
    public void printerHasTonerVolume() {
        assertEquals(20, printer.getTonerTotal());
    }

    @Test
    public void printerCanPrint() {
        printer.print(2, 5);
        assertEquals(90, printer.getPaperTotal());
        assertEquals(18, printer.getTonerTotal());
    }

    @Test
    public void printerCannotPrintWhenNotEnoughPaper() {
        printer.print(30, 5);
        assertEquals(100, printer.getPaperTotal());
    }

//    @Test
//    public void printCannotPrintWhenNotEnoughToner() {
//        printer.print(22, 1);
//        assertEquals(20, printer.getTonerTotal());
//        assertEquals(100, printer.getPaperTotal());
//    }
}
