package dataSource;

import database.ConnectToSqlDB;
import utility.DataReader;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DataSource {
    public static ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();
    public static DataReader excelReader = new DataReader();


    public static List<String> getSearchValueList() {
        List<String> searchValueList = new ArrayList<String>();
        searchValueList.add("Recent News");
        searchValueList.add("World Politics");
        searchValueList.add("Gadgets");
        searchValueList.add("International");
        searchValueList.add("News");

        return searchValueList;

    }

    public static List<String> getItemsListFromDB() throws Exception {
        List<String> list = getSearchValueList();
        list = connectToSqlDB.readDataBase("searchList", "topics");
        return list;

    }



    public static String[] getDataFromExcelFileForFeaturesChoice() throws IOException {
        String path = "/CNN/src/Data/Cnn.xlsx";
        String [] data = DataReader.fileReader2(path,0);
        return data;
    }


}
