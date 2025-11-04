package org.ruchiraLakshan;
import java.util.Scanner;

interface Button{
    void paint();
}

interface CheckBox{
    void check();
}

// create Product LightButton
class LightButton implements Button{

    @Override
    public void paint() {
        System.out.println("Light Button");
    }
}
// create Product DarkButton
class  DarkButton implements Button{

    @Override
    public void paint(){
        System.out.println("Dark Button");
    }
}

//Create Product LightCheckBox
class LightCheckBox implements CheckBox{
    @Override
    public void check(){
        System.out.println("Light CheckBox");
    }
}

//Create Product DarkCheckbox
class  DarkCheckBox implements CheckBox{
    @Override
    public void check(){
        System.out.println("Dark CheckBox");
    }
}
//create Abstract Factory
interface UI{
    Button createButton();
    CheckBox createCheckBox();
}

//Create Factory LightThemeFactory
class LightThemeFactory implements UI{
    public Button createButton(){
        return new LightButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new LightCheckBox();
    }
}

//Create Factory DarkThemeFactory
class DarkThemeFactory implements UI{
    public Button createButton(){
        return new DarkButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new DarkCheckBox();
    }
}


public class AbstractFactoryDemo {
  public static void main(String[] args){

      //calling User input to select the theme
      Scanner input = new Scanner(System.in);
      System.out.println("Enter a theme (light/dark): ");
      String theme = input.nextLine();

      //Light Button and Checkbox
      UI factory ;
      if(theme.equals("light")){
          factory = new LightThemeFactory();
      }else {
          factory = new DarkThemeFactory();
      }

      Button btn = factory.createButton();
      CheckBox cb = factory.createCheckBox();

      btn.paint();
      cb.check();

  }
}

