import java.io.*;
import java.util.*;
import java.lang.*;

// Read only region start
class UserMainCode
{
    public int Solution(int input1, int input2) {
        // Read only region end
        // Write code here...
        int i1Last = Math.abs(input1 % 10);
        int i2Last = Math.abs(input2 % 10);

        return (i1Last + i2Last);
        // throw new UnsupportedOperationException("IsEven(int input1)");
    }
}