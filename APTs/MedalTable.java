import java.util.*;

import static java.util.Comparator.*;

public class MedalTable {
    public String[] generate(String[] results) {
        Map<String, MedalCountry> map = new HashMap<>();
        for (String data : results) { // Data Parsed
            String[] countries = data.split(" ");
            for (String c : countries) {
                if (!map.containsKey(c)) {
                    map.put(c, new MedalCountry(c));
                }
            }
            map.get(countries[0]).incMyGold();
            map.get(countries[1]).incMySilver();
            map.get(countries[2]).incMyBronze();
            }
        // Compare the Gold, then Silver, then Bronze
        ArrayList<MedalCountry> copyList = new ArrayList<>(map.values());
        Comparator<MedalCountry> copyG = Comparator.comparing(MedalCountry::getMyGold).reversed();
        Comparator<MedalCountry> copyS = Comparator.comparing(MedalCountry::getMySilver).reversed();
        Comparator<MedalCountry> copyB = Comparator.comparing(MedalCountry::getMyBronze).reversed();
        Comparator<MedalCountry> copyC = Comparator.comparing(MedalCountry::getMyCountry);
        Comparator<MedalCountry> copy = copyG.thenComparing(copyS).thenComparing(copyB).thenComparing(copyC);
        Collections.sort(copyList,copy);

        String[] ret = new String[copyList.size()];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = copyList.get(i).toString();
        }
        return ret;
    }
    private class MedalCountry{
        String myCountry;
        int myGold;
        int mySilver;
        int myBronze;

        MedalCountry(String country) {
            myCountry = country;
        }
        public void incMyGold() {
            myGold += 1;
        }
        public void incMySilver() {
            mySilver += 1;
        }
        public void incMyBronze() {
            myBronze +=1;
        }
        public int getMyGold() {
            return myGold;
        }
        public int getMySilver() {
            return mySilver;
        }
        public int getMyBronze() {
            return myBronze;
        }
        public String getMyCountry() {
            return myCountry;
        }
        @Override
        public String toString() {
            return String.format("%s %d %d %d", myCountry,myGold,mySilver,myBronze);
        }
    }
}