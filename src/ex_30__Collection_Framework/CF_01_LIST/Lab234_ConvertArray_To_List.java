package ex_30__Collection_Framework.CF_01_LIST;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lab234_ConvertArray_To_List {
    static void main(String[] args) {

        String arr[] = {"Java", "Python" ,"c#"};
        List<String> list = Arrays.asList(arr);
        System.out.println(list);

    }
}
