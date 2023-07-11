import java.io.*;
import java.util.*;

// Read only region start
class UserMainCode
{
    public int Solution(int input1, int input2, int input3, int input4, int input5, String input6) {
        // Read only region end
        // Write code here...
        int count = 0;

        int arr[] = {input1, input2, input3, input4, input5};

        for (int i = 0; i < 5; i++) {
            if (arr[i] % 2 == 0) {
                count++;
            }
        }

        if (input6.equals("even")) {
            return count;
        }
        return (5 - count);

        // throw new UnsupportedOperationException("IsEven(int input1)");
    }
}