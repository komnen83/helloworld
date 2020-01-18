package tech.kuba.sda.other;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Mapy {

    public static void main(String[] args) {
        Map<String, Integer> mapa = new HashMap<>();
        mapa.put("Adam", 34);
        Integer wartoscAdam = mapa.get("Adam");
        System.out.println(wartoscAdam);
        Integer wartoscBorys = mapa.get("Borys");
        System.out.println(wartoscBorys);
        Integer wartoscBorys2 = mapa.getOrDefault("Borys", 0);
        System.out.println(wartoscBorys2);

//        mapa.put("Adam", 40);
////        mapa.putIfAbsent("Adam", 40);
////        mapa.replace("Adam", 40);
////
////        System.out.println(mapa.get("Adam"));
////        mapa.remove("Adam");
////        System.out.println(mapa.containsKey("Adam"));
////
////        Map<String, List<Integer>> mapa2 = new HashMap<>();
////        Map<String, Map<String, Integer>> mapa3 = new HashMap<>();
        mapa.put("Stach", 27);

        Set<Map.Entry<String, Integer>> entries = mapa.entrySet();
        System.out.println(entries);

        for(Map.Entry<String, Integer> wpis : entries) {
            System.out.printf("Moj kolega/kolezanka %s ma %d lat%n", wpis.getKey(), wpis.getValue());
        }

        Set<String> klucze = mapa.keySet();
        System.out.println(klucze);



    }
}
