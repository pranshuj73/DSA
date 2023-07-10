    import java.io.*;
    import java.util.*;
    import java.lang.*;

    // Read only region start
    class UserMainCode
    {
        public int IsEven(int input1) {
            // Read only region end
            // Write code here...
            int lastTwoDigits = Math.abs(input1 / 10);
            int lastDigit = Math.abs(lastTwoDigits % 10);

            if (lastDigit < 1) {
                return -1;
            }
            return lastDigit

            // throw new UnsupportedOperationException("IsEven(int input1)");
        }
    }