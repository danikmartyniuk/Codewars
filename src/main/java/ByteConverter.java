import java.util.Arrays;

/**
 * A stream of data is received and needs to be reversed.
 *
 * Each segment is 8 bits long, meaning the order of these segments needs to be reversed, for example:
 *
 * 11111111  00000000  00001111  10101010
 *  (byte1)   (byte2)   (byte3)   (byte4)
 * should become:
 *
 * 10101010  00001111  00000000  11111111
 *  (byte4)   (byte3)   (byte2)   (byte1)
 * The total number of bits will always be a multiple of 8.
 */

public class ByteConverter {

    public static void main(String[] args) {
        int[] data1= {0,0,1,1,0,1,1,0,0,0,1,0,1,0,0,1};
        System.out.println(Arrays.toString(DataReverse(data1)));
    }

    public static int[] DataReverse(int[] data) {
        int[] bytes = new int[data.length/8 + 1];
        for (int i = 0; i < data.length; i += 8) {
            for (int f = 0; f < data.length; f++) {
                int[] arrOfBytes = Arrays.copyOfRange(data, i, i + 8);
                String res = Arrays.toString(arrOfBytes).replaceAll("\\[|\\]|,|\\s", "");
                bytes[f] = Byte.parseByte(res, 2);
            }
        }
        return bytes;
    }
}
