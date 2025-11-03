package org.ruchiraLakshan;

 public class BuilderDemo {

     // Variables
     private String CPU;
     private int RAM;

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

     private int storage;
     private String graphicsCard;

     //static inner class
     public static class ComputerBuilder{
         private String CPU;
         private int RAM;
         private int storage;
         private String graphicsCard;

         public ComputerBuilder(String CPU, int RAM, int storage, String graphicsCard) {
             this.CPU = CPU;
             this.RAM = RAM;
             this.storage = storage;
             this.graphicsCard = graphicsCard;
         }

         //build method
         public BuilderDemo build(){
             return new BuilderDemo();
         }
     }


    public static void main(String[] args){
         BuilderDemo oldBuild = new BuilderDemo.ComputerBuilder("i3",8,512,"RTX1050").build();
         BuilderDemo newBuild = new BuilderDemo.ComputerBuilder("i9",32,1000,"RTX4080").build();


    }

 }

