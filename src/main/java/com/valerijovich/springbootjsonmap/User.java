package com.valerijovich.springbootjsonmap;

import com.fasterxml.jackson.annotation.JsonAnyGetter;

import java.util.Map;
import java.util.TreeMap;

/**
 * The User class is a class that contains some information about the user.
 * If we do not know in advance the number and types of fields, we can add them all into one map, the keys of which,
 * during serialization, will be converted into the names of the entity fields, and the map values - into the values
 * of this entity. The @JsonAnyGetter annotation will help us with this, which is not hung on the map itself,
 * but on its get-method. Here we are using a TreeMap, whose keys are sorted alphabetically, since
 * the @JsonPropertyOrder annotation does not work in this case. The values are typed by the Object class so
 * that objects of any type (both strings and numbers) can be added to the map.
 * In general, if the set of parameters is fixed and known in advance, it is better not to use this approach.
 */
public class User {

    private Map<String, Object> params = new TreeMap<>();

    @JsonAnyGetter
    public Map<String, Object> getParams() {
        return params;
    }
}
