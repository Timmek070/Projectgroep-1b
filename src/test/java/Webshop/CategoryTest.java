package Webshop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CategoryTest {

    Category testCategory = new Category("woodworking");


    @Test
    public void InitCategoryTest () {
        assertEquals("woodworking", testCategory.getName());
    }

}