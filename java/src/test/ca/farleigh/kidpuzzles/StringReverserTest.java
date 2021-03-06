package ca.farleigh.kidpuzzles;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class StringReverserTest {

    private StringReverser reverser;

    @Before
    public void setup() {
        this.reverser = new StringReverser();
    }

    @Test
    public void testReverseEmptyString() {
        Assert.assertEquals("", reverser.reverse(""));
    }

    @Test
    public void testReverseSmallString() {
        Assert.assertEquals("cba", reverser.reverse("abc"));
    }

    @Test
    public void testReverseWord() {
        Assert.assertEquals("Chicken", reverser.reverse("Nekcihc"));
    }

    @Test
    public void testReverseSentence() {
        Assert.assertEquals("Emag oediv a si tfarcenim.", reverser.reverse("Minecraft is a video game."));
    }
}
