package io.julian.impl.basics.strings;


import io.julian.core.Algorithm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * created by julian
 */
public class IndexOfStateTransition implements Algorithm {


    @Override
    public void execute() {

    }


}


class SearchString {


    private String query;


    private List<Character> alphabet = new ArrayList<>();


    private List<Map<Character, Integer>> transitions = new ArrayList<>();


    public SearchString(String query) {
        this.query = query;
        buildSearchTable();
    }


    private void buildSearchTable() {
        int state = 0;
        for (char q : query.toCharArray()) {
            if (!alphabet.contains(q)) {
                alphabet.add(q);
            }

            Map<Character, Integer> transitionMap = new HashMap<>();
            transitionMap.put(q, state+1);

//            transitions.add(q, );

            ++state;
        }
    }


}


