package com.company;

public class Store {

    private int countOfWorkers;
    private String name;
    private int phoneNumber;
    private int productNumber;


    public Store(int countOfWorkers, String name, int phoneNumber, int productNumber) {
        setCountOfWorkers(countOfWorkers);
        setName(name);
        setPhoneNumber(phoneNumber);
        setProductNumber(productNumber);
    }

    @Override
    public String toString() {
        return "Count of workers - " + getCountOfWorkers() + "\n" +
                "Name - " + getName() + "\n" +
                "Phone number - " + getPhoneNumber() + "\n" +
                "Product number - " + getProductNumber() + "\n";
    }

    public void selling() {
        if (getProductNumber() > 0)
            setProductNumber(getProductNumber() - 1);
        else
            System.out.println("Product is over");
    }

    public int getCountOfWorkers() {
        return countOfWorkers;
    }

    public void setCountOfWorkers(int countOfWorkers) {
        if (countOfWorkers >= 2 && countOfWorkers <= 50)
            this.countOfWorkers = countOfWorkers;
        System.out.println("Incorrect number of workers");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() >= 3)
            this.name = name;
        else
            System.out.println("Incorrect name");
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        if (String.valueOf(phoneNumber).length() == 8)
            this.phoneNumber = phoneNumber;
        else
            System.out.println("Incorrect phone number");
    }

    public int getProductNumber() {
        return productNumber;
    }

    public void setProductNumber(int productNumber) {
        this.productNumber = productNumber;
    }
}
