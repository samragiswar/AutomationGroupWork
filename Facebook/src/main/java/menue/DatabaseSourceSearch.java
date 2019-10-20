package menue;

import Database.SqlDatabase;
import common.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DatabaseSourceSearch extends CommonAPI {
    public void signIn() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("samragigrandonswar@gmail.com");
        driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("123456789#");
        driver.findElement(By.xpath("//input[@id='u_0_2']")).click();
    }

    static SqlDatabase connectToSqlDB = new SqlDatabase();

    public List<String> getItemsListFromDB () throws Exception, IOException, SQLException, ClassNotFoundException {

        List<String> itemsList = new ArrayList<String>();

        itemsList.add("Sam");
        itemsList.add("Gyve");
        itemsList.add("Nayana");
        itemsList.add("Bibek");
        itemsList.add("Sikha");

        connectToSqlDB = new SqlDatabase();
        connectToSqlDB.insertStringDataFromArrayListToSqlTable(itemsList, "SearchFriends", "list");

        List<String> list = new ArrayList<>();
        list = connectToSqlDB.readDataBase("SearchFriends", "list");
        System.out.println("Read Data From Database: ");
        for (String st : list) {
            System.out.println(st); }
        return list;
    }

    public void searchFriends () {
        try {
            List<String> list = new ArrayList<>();
            list = getItemsListFromDB();

            for (String st : list) {
                driver.findElement(By.xpath("//div[@id='u_4_2']//input[@placeholder='Search']")).sendKeys(st, Keys.ENTER);
                navigateBack();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }



    }
}
