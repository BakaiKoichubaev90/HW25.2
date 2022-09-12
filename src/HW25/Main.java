package HW25;

import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        City city1 = new City(996, "Tashkent");
        City city2 = new City(777, "Astana");
        City city3 = new City(312, "Bishkek");
        City city4 = new City(342, "Talas");
        City city5 = new City(355, "Kabul");
        City city6 = new City(328, "Dubai");
        City [] cities = {city1,city2,city3,city4,city5,city6};
        TreeSet<City> treeSet = new TreeSet();
        for (City i: cities){
            if(i.getCode()%2!=0){
                treeSet.add(i);
            }
        }

        for(City i: treeSet){
            System.out.println(i);
        }


        }

        }
