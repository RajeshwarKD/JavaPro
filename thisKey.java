class thisKey {
    int x;

    // Constructor with a parameter
    thisKey(int x) {
        this.x = x;
    }

    // Call the constructor
    public static void main(String[] args) {
        thisKey obj = new thisKey(5);
        System.out.println("Value of x = " + obj.x);
    }
}
