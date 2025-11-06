package org.ruchiraLakshan;

public class BuilderDemo {

    // Variables
    private String CPU;
    private int RAM;
    private int storage;
    private String graphicsCard;

    // Getters and Setters
    public String getCPU() {
        return CPU;
    }

    public void setCPU(String CPU) {
        this.CPU = CPU;
    }

    public int getRAM() {
        return RAM;
    }

    public void setRAM(int RAM) {
        this.RAM = RAM;
    }

    public int getStorage() {
        return storage;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }

    public String getGraphicsCard() {
        return graphicsCard;
    }

    public void setGraphicsCard(String graphicsCard) {
        this.graphicsCard = graphicsCard;
    }

    // Static inner Builder class
    public static class ComputerBuilder {
        private String CPU;
        private int RAM;
        private int storage;
        private String graphicsCard;

        // Builder methods for step-by-step construction
        public ComputerBuilder withCPU(String CPU) {
            this.CPU = CPU;
            return this;
        }

        public ComputerBuilder withRAM(int RAM) {
            this.RAM = RAM;
            return this;
        }

        public ComputerBuilder withStorage(int storage) {
            this.storage = storage;
            return this;
        }

        public ComputerBuilder withGraphicsCard(String graphicsCard) {
            this.graphicsCard = graphicsCard;
            return this;
        }

        // Build method
        public BuilderDemo build() {
            BuilderDemo computer = new BuilderDemo();
            computer.setCPU(this.CPU);
            computer.setRAM(this.RAM);
            computer.setStorage(this.storage);
            computer.setGraphicsCard(this.graphicsCard);
            return computer;
        }
    }

    // Main method to test
    public static void main(String[] args) {
        // Build with only CPU and RAM
        BuilderDemo customBuild = new BuilderDemo.ComputerBuilder()
                .withCPU("i9")
                .withRAM(32)
                .build();

        // Build a full configuration
        BuilderDemo fullBuild = new BuilderDemo.ComputerBuilder()
                .withCPU("i7")
                .withRAM(16)
                .withStorage(1000)
                .withGraphicsCard("RTX3080")
                .build();

        System.out.println("Custom Build: CPU = " + customBuild.getCPU() + ", RAM = " + customBuild.getRAM());
        System.out.println("Full Build: CPU = " + fullBuild.getCPU() + ", RAM = " + fullBuild.getRAM() +
                ", Storage = " + fullBuild.getStorage() + ", GPU = " + fullBuild.getGraphicsCard());
    }
}
