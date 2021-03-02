package ru.job4j.ex;

public class FindEl {

    public static int indexOf(String[] value, String key) throws ElementNotFoundException{
        for (int i = 0; i < value.length; i++) {
            if (value[i].equals(key)) {
                return i;
            }
        }
        throw new ElementNotFoundException("the key element was not found");
    }

    public static void main(String[] args) {
        try {
            String[] car = new String[]{"renault", "kia", "bmw"};
            indexOf(car, "lada");
        } catch (ElementNotFoundException e) {
            e.printStackTrace();
        }
    }
}
