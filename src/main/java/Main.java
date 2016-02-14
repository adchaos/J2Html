import com.hp.gagawa.java.elements.A;
import com.hp.gagawa.java.elements.Div;
import com.hp.gagawa.java.elements.Img;
import j2html.tags.Tag;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.TestListenerAdapter;
import org.testng.TestNG;

import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import j2html.*;
import static j2html.TagCreator.*;


import static j2html.TagCreator.button;

/**
 * Created by alex on 1/2/2016.
 */class Program extends  MainView {


    public static void main(String[] args ) throws IOException {
        //hmtl();
        loadHtmlTemplate();


        /*ArrayList list = new ArrayList();
        list.add("Alex");
        list.add("Baki");
        list.add("Tolumbaki");
        list.add("Riboche");
        System.out.println(MainView.createEmployeeList(list));*/
        //System.out.print(submitButton("next"));
        //submitButton("next");
        /*System.out.println( MainView.render(
                "Signup page",
                h1("Please sign up"),
                form().withMethod("post").with(
                        Program.submitButton("next"))));*/

    }
}



















/*
        ArrayList<String> suitesList = new ArrayList<String>();
        TestListenerAdapter listener = new TestListenerAdapter();
        TestNG testng = new TestNG();
        testng.setOutputDirectory("outputDirectory");
        suitesList.add("testng.xml");
        testng.setTestSuites(suitesList);
        testng.addListener(listener);
        testng.run();*/
