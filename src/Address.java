// Nathan Parker
// Lab 09 - ArrayList
// 11/11/21

public class Address {

    // Class attributes.
    private int number, pobox;
    private String name, type, state;
    private ZipCode zip;

    public Address() {
        setNumber(0);
        setName("N/A");
        setType("Unknown");
        setZip(new ZipCode());
        setState("  ");
        setPobox(0);
    }

    public Address(int numberIn, String nameIn, String typeIn, ZipCode zipCodeIn, String stateIn, int poboxIn) {
        setNumber(numberIn);
        setName(nameIn);
        setType(typeIn);
        setZip(zipCodeIn);
        setState(stateIn);
        setPobox(poboxIn);
    }

    public Address(ZipCode zipCodeIn, int poboxIn) {
        setNumber(0);
        setName("N/A");
        setType("Unknown");
        setZip(zipCodeIn);
        setState("  ");
        setPobox(poboxIn);
    }

    @Override
    public String toString() {
        String concat = "";

        concat = "Address{" + "number=" + getNumber() + ", name=" + getName() + ", type="
                + getType() + ", zip=" + zip.toString() + ", state="
                + getState() + ", pobox=" + getPobox() + "}";

        return concat;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {

        String spaceCheck = "";

        // If name string is not empty and is not "N/A", capitalize each word.
        if (!name.isEmpty() && !name.equals("N/A")) {
            // Removing possible whitespace from both ends of the string.
            name = name.trim();

            // Converting the first letter of the string to uppercase.
            // The remaining characters are converted to lowercase.
            name = name.substring(0, 1).toUpperCase()
                    + name.substring(1, name.length()).toLowerCase();

            // Iterate through each character of the string to find spaces.
            // toUpperCase() the following character if a space is found.
            for (int i = 0; i < name.length(); ++i) {
                spaceCheck = name.substring(i, i + 1);
                if (spaceCheck.equals(" ")) {
                    name = name.substring(0, i)
                            + name.substring(i, i + 2).toUpperCase()
                            + name.substring(i + 2, name.length());
                }
            }
        }

        // Set name after conversion.
        this.name = name;
    }

    public String getType() {
        String typeConverted = "";

        // Convert type before return.
        if (type.equalsIgnoreCase("drive")) {
            typeConverted = "Dr.";
        } else if (type.equalsIgnoreCase("avenue")) {
            typeConverted = "Ave.";
        } else if (type.equalsIgnoreCase("street")) {
            typeConverted = "St.";
        } else {
            typeConverted = type;
        }

        return typeConverted;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ZipCode getZip() {
        return this.zip;
    }

    public void setZip(ZipCode zip) {
        this.zip = zip;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getPobox() {
        return pobox;
    }

    public void setPobox(int pobox) {
        this.pobox = pobox;
    }
}
