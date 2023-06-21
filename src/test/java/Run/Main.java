package Run;

import UI.UserInterface;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.RunWith;

import java.sql.SQLException;

public class Main {

    public static void main(String[] args){

        new UserInterface();

    }


}
