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
        return "Count of workers - " + countOfWorkers + "\n" +
                "Name - " + name + "\n" +
                "Phone number - " + phoneNumber + "\n" +
                "Product number - " + productNumber + "\n";
    }

    public void selling() {
        if (getProductNumber() > 0)
            setProductNumber(getProductNumber() - 1);
        else
            System.out.println("Not");
    }

    public int getCountOfWorkers() {
        return countOfWorkers;
    }

    public void setCountOfWorkers(int countOfWorkers) {
        if (countOfWorkers >= 2 && countOfWorkers <= 50)
            this.countOfWorkers = countOfWorkers;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() >= 3)
            this.name = name;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        if (String.valueOf(phoneNumber).length() == 8)
            this.phoneNumber = phoneNumber;
    }

    public int getProductNumber() {
        return productNumber;
    }

    public void setProductNumber(int productNumber) {
        this.productNumber = productNumber;
    }
}
