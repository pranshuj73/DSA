import java.io.*;
import java.util.*;

// Read only region start
class UserMainCode
{
    public int Solution(int input1) {
        // Read only region end
        // Write code here...
        if (input1 ==0 || input2 == 0) {
            return 3;
        }
        if (input2 != 0 && input1 % input2 == 0) {
            return 2;
        }

        return 1;

        // throw new UnsupportedOperationException("IsEven(int input1)");
    }
}