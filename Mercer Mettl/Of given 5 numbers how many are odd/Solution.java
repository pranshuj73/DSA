import java.io.*;
import java.util.*;

// Read only region start
class UserMainCode
{
    public int Solution(int input1) {
        // Read only region end
        // Write code here...
        int oddCount = 0;

        int arr[] = {input1, input2, input3, input4, input5};

        for (int i = 0; i < 5; i++) {
            if (arr[i] % 2 != 0) {
                oddCount++;
            }
        }

        return oddCount;
        // throw new UnsupportedOperationException("IsEven(int input1)");
    }
}