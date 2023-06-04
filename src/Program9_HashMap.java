/**
 * Write a programme that tells you which line passes through particular stations.
 * Just use Zone 1 stations name.
 */

import java.util.HashMap;
import java.util.Map;

public class Program9_HashMap {

        public static void main(String[] args) {
            Map<Integer,String> carMap = new HashMap();
            carMap.put(1,"BMW");
            carMap.put(6,"Audi");
            carMap.put(4,"Honda");

            for( Map.Entry<Integer,String> car  : carMap.entrySet()){
                System.out.println(car.getKey()+ " "+car.getKey());
            }

        }

}



