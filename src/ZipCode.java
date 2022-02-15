// Nathan Parker
// Lab 10 - Searching An Arraylist
// 11/30/21

public class ZipCode {

    // Class attributes.
    private String fiveDigit;
    private String plus4;

    public ZipCode() {
        setFiveDigit("00000");
        setPlus4("");
    }

    public ZipCode(String fiveInput) {
        setFiveDigit(fiveInput);
        setPlus4("");
    }

    public ZipCode(String fiveInput, String fourInput) {
        setFiveDigit(fiveInput);
        setPlus4(fourInput);
    }

    @Override
    public String toString() {

        // Check if fiveDigit is empty.
        if (!this.fiveDigit.equals("")) {
            //Check if plus4 is empty.
            if (!this.plus4.equals("")) {
                // Return both vars -- if not empty.
                return this.fiveDigit + "-" + this.plus4;
            } else {
                // Return fiveDigit -- plus4 is empty.
                return this.fiveDigit;
            }
        } else {
            // Return nothing if both vars are empty.
            return "";
        }

    }

    public void display() {
        // Display contents using the toString() method.
        System.out.println(toString());
    }

    public void display(int p) {

        if (!this.fiveDigit.equals("")) {
            if (p == 1) {
                System.out.println("Prefix: " + this.fiveDigit.substring(0, 3));
            } else if (p == 2) {
                System.out.println("Area: " + this.fiveDigit.substring(3, 5));
            }
        }
    }

    public void setFiveDigit(String setFive) {
        fiveDigit = setFive;
    }

    public String getFiveDigit() {
        return fiveDigit;
    }

    public void setPlus4(String setFour) {
        plus4 = setFour;
    }

    public String getPlus4() {
        return plus4;
    }
}
