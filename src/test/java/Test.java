import com.davie.reader.LineIterator;
import org.junit.jupiter.api.Assertions;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Test {

    public static final String  LINE_ITERATOR_PATH = "test_data/test_lineIterator";

    @org.junit.jupiter.api.Test
    public void testFormat(){
        CsvFormat format = new CsvFormat();
    }

    @org.junit.jupiter.api.Test
    public void testLineIterator(){
        try {
            LineIterator iterator = new LineIterator(LINE_ITERATOR_PATH);
            ArrayList<String> list = new ArrayList<>();
            while (iterator.hasNext()){
                list.add(iterator.next());
            }
            Assertions.assertEquals(2,list.size());
            Assertions.assertEquals("hello",list.get(0));
            Assertions.assertEquals("welcome to duckbaby csv!",list.get(1));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}






































