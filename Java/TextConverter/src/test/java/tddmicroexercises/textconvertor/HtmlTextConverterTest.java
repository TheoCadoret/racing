package tddmicroexercises.textconvertor;

import static org.junit.Assert.*;

import org.junit.Test;

public class HtmlTextConverterTest {
    @Test
    public void should_set_the_filename_correctly() {
        HtmlTextConverter converter = new HtmlTextConverter("foo");
        assertEquals("fixme", converter.getFilename());
    }

    @Test
    public void should_transform_peculiar_signs_into_html(){

    }
}
