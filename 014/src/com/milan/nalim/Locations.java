package com.milan.nalim;

import java.io.*;
import java.util.*;

public class Locations implements Map<Integer, Location> {

    private static Map<Integer, Location> locations = new LinkedHashMap<>();

    public static void main(String[] args) throws IOException {

        try (ObjectOutputStream locFile = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream("locations.ser")))) {
            for (Location location : locations.values()) {
                locFile.writeObject(location);
            }
        }

//        try (DataOutputStream locFile = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("locations.dat")))) {
//            for (Location location : locations.values()) {
//                locFile.writeInt(location.getLocationID());
//                locFile.writeUTF(location.getDescription());
//                System.out.println("Writing location " + location.getLocationID() + " : " + location.getDescription());
//                System.out.println("Writing " + (location.getExits().size() - 1) + "exits.");
//                locFile.writeInt(location.getExits().size() - 1);
//                for (String direction : location.getExits().keySet()) {
//                    if (!direction.equalsIgnoreCase("Q")) {
//                        System.out.println("\t\t" + direction + "," + location.getExits().get(direction));
//                        locFile.writeUTF(direction);
//                        locFile.writeInt(location.getExits().get(direction));
//                    }
//                }
//            }
//        }
    }

    static {
        try (ObjectInputStream locFile = new ObjectInputStream(new BufferedInputStream(new FileInputStream("locations.ser")))) {
            boolean isEof = false;
            while (!isEof) {
                try {
                    Location location = (Location) locFile.readObject();
                    locations.put(location.getLocationID(), location);
                } catch (EOFException eofe) {
                    isEof = true;
                }
            }
        } catch (IOException ioe) {
            System.out.println("IOException");
        } catch (ClassNotFoundException cnfe) {
            System.out.println("ClassNotFoundException");
        }

//        try (DataInputStream locFile = new DataInputStream(new BufferedInputStream(new FileInputStream("locations.dat")))) {
//            boolean isEof = false;
//            while (!isEof) {
//                try {
//                    int locationId = locFile.readInt();
//                    String description = locFile.readUTF();
//                    Location location = new Location(locationId, description, new LinkedHashMap<>());
//                    int numOfExits = locFile.readInt();
//                    for (int i = 0; i < numOfExits; i++) {
//                        location.addExit(locFile.readUTF(), locFile.readInt());
//                    }
//                    locations.put(locationId, location);
//                } catch (EOFException eofe) {
//                    isEof = true;
//                }
//            }
//        } catch (IOException ioe) {
//            System.out.println(ioe.getMessage());
//        }

//        try (BufferedReader locFile = new BufferedReader(new FileReader("locations_big.txt"))){
//            String line;
//            while((line = locFile.readLine()) != null) {
//                String[] data = line.split(",");
//                int locationId = Integer.parseInt(data[0]);
//                String description = data[1];
//                Map<String, Integer> exits = new HashMap<>();
//                Location location = new Location(locationId, description, exits);
//                locations.put(locationId, location);
//            }
//        } catch (IOException ioe) {
//            System.out.println("IOException " + ioe.getMessage());
//        }
//
//        try (BufferedReader dirFile = new BufferedReader(new FileReader("directions_big.txt"))) {
//            String line;
//            while ((line = dirFile.readLine()) != null) {
//                String[] dataArr = line.split(",");
//                int locationId = Integer.parseInt(dataArr[0]);
//                String direction = dataArr[1];
//                int destination = Integer.parseInt(dataArr[2]);
//                Location location = locations.get(locationId);
//                location.addExit(direction, destination);
//            }
//        } catch (IOException ioe) {
//            System.out.println("IOException: " + ioe.getMessage());
//        }
    }

    @Override
    public int size() {
        return locations.size();
    }

    @Override
    public boolean isEmpty() {
        return locations.isEmpty();
    }

    @Override
    public boolean containsKey(Object o) {
        return locations.containsKey(o);
    }

    @Override
    public boolean containsValue(Object o) {
        return locations.containsValue(o);
    }

    @Override
    public Location get(Object o) {
        return locations.get(o);
    }

    @Override
    public Location put(Integer integer, Location location) {
        return locations.put(integer, location);
    }

    @Override
    public Location remove(Object o) {
        return locations.remove(o);
    }

    @Override
    public void putAll(Map<? extends Integer, ? extends Location> map) {

    }

    @Override
    public void clear() {
        locations.clear();
    }

    @Override
    public Set<Integer> keySet() {
        return locations.keySet();
    }

    @Override
    public Collection<Location> values() {
        return locations.values();
    }

    @Override
    public Set<Entry<Integer, Location>> entrySet() {
        return locations.entrySet();
    }
}
