package org.ioopm.calculator;

import static org.junit.Assert.assertTrue;

import java.io.StreamTokenizer;
import java.lang.reflect.Field;

import org.ioopm.calculator.parser.Parser;
import org.junit.Test;

public class ParserDriverTest  {
    @Test
    public void checkFieldsAreInitalized() throws NoSuchFieldException, IllegalAccessException {
        Parser p = new Parser();
        // Field is private so need to use reflection!
        Field streamTokenizerField = Parser.class.getDeclaredField("st");
        streamTokenizerField.setAccessible(true);
        assertTrue((StreamTokenizer)streamTokenizerField.get(p) != null);
    }
}
