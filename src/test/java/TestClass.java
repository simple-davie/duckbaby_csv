import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.SeekableByteChannel;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

/**
 * @author Davie
 */
public class TestClass {

    public static final String DATA_PATH = "test_data/test_lineIterator";

    @Test
    public void test() throws IOException {
        SeekableByteChannel byteChannel = Files.newByteChannel(Paths.get(DATA_PATH));
        ByteBuffer byteBuffer = ByteBuffer.allocate(1024);
        int read = byteChannel.read(byteBuffer);
        System.out.println("read = " + read);
        System.out.println(Arrays.toString(byteBuffer.array()));
    }
}
