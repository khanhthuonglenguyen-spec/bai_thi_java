public class Computer {
    private int id;
    private String manufacturer;
    private int year;
    private double price;
 
    public Computer() {
        this.id = 0;
        this.manufacturer = "Unknown";
        this.year = 2000;
        this.price = 0.0;
    }
 
    public int getId() {
        return id;
    }
 
    public void setId(int id) {
        if (id > 0) {
            this.id = id;
        } else {
            System.out.println("ID must be greater than 0!");
        }
    }
 
    public String getManufacturer() {
        return manufacturer;
    }
 
    public void setManufacturer(String manufacturer) {
        if (!manufacturer.isEmpty()) {
            this.manufacturer = manufacturer;
        } else {
            System.out.println("Manufacturer can not be empty!");
        }
    }
 
    public int getYear() {
        return year;
    }
 
    public void setYear(int year) {
        if (year > 0) {
            this.year = year;
        } else {
            System.out.println("Year can not be negative or 0!");
        }
    }
 
    public double getPrice() {
        return price;
    }
 
    public void setPrice(double price) {
        if (price >= 0) {
            this.price = price;
        } else {
            System.out.println("Price can not be negative!");
        }
    }
 
    public void displayInfo() {
        System.out.println("ID: " + id + " | Manufacturer: " + manufacturer
                + " | Year: " + year + " | Price: " + price);
    }
}
