package edu.wctc.unit1project;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * Testing the hashmap...
 */
public class TranslateTest {
    @Test
    public void testTranslate(){
        Map<String, String> map = new HashMap<>();
        map.put("j", "Java");
        map.put("c", "C#");
        map.put("s", "SQL");
        map.put("js", "JavaScript");

        Map<String, String> expected = new HashMap<>();
        expected.put("js", "JavaScript");
        expected.put("s", "SQL");
        expected.put("c", "C#");
        expected.put("j", "Java");

        assertThat(map, is(expected));
    }


}