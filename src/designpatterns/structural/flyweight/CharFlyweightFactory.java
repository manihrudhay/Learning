package designpatterns.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

// Flyweight Factory (CharFlyweightFactory)
class CharFlyweightFactory {
    private Map<Character, CharFlyweight> flyweights = new HashMap<>();

    public CharFlyweight getCharFlyweight(char character) {
        if (!flyweights.containsKey(character)) {
            flyweights.put(character, new CharFlyweightImpl(character));
        }
        return flyweights.get(character);
    }
}
