package com.develogical;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class QueryProcessorTest {

    QueryProcessor queryProcessor = new QueryProcessor();

    @Test
    public void returnsEmptyStringIfCannotProcessQuery() throws Exception {
        assertThat(queryProcessor.process("test"), is(""));
    }

    @Test
    public void knowsAboutShakespeare() throws Exception {
        assertThat(queryProcessor.process("Shakespeare"), containsString("playwright"));
    }

    @Test
    public void isNotCaseSensitive() throws Exception {
        assertThat(queryProcessor.process("shakespeare"), containsString("playwright"));
    }

    @Test
    public void knowsTeamName() throws Exception {
        assertThat(queryProcessor.process("what is your name"), containsString("grass"));
    }

    @Test
    public void recognizesWeebs() throws Exception {
        assertThat(queryProcessor.process("I'm a weeb, UwU"), containsString("HELLO, FELLOW WEEB!! 0W0"));
    }

    @Test
    public void canAdd() throws Exception {
        assertThat(queryProcessor.process("What is 1 plus 2"), containsString("3"));
    }

    @Test
    public void canFindLargest() throws Exception {
        assertThat(queryProcessor.process("Which of the following numbers is the largest: 1, 3, 2"), containsString("3"));
    }

    @Test
    public void canFindSquareCube() throws Exception {
        assertThat(queryProcessor.process("Which of the following numbers is both a square and a cube: 1, 4, 2"), containsString("1"));
    }

    @Test
    public void canFindSquareCube2() throws Exception {
        assertThat(queryProcessor.process("Which of the following numbers is both a square and a cube: 3, 64, 2"), containsString("64"));
    }

    @Test
    public void canMult() throws Exception {
        assertThat(queryProcessor.process("What is 1 multiplied by 2"), containsString("2"));
    }

}
