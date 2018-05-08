package bigOne;

public class TestBox {
    public static void main(String[] args) {
        OrangeBox orangeBox = new OrangeBox();
        orangeBox.add(new Orange("Orange 1"));
        orangeBox.add(new Orange("Orange 2"));
        orangeBox.add(new Orange("Orange 3"));
        orangeBox.add(new Orange("Orange 4"));

        AppleBox appleBox = new AppleBox();
        appleBox.add(new Apple("Apple 1"));
        appleBox.add(new Apple("Apple 2"));
        appleBox.add(new Apple("Apple 3"));
        appleBox.add(new Apple("Apple 4"));

    }
}
