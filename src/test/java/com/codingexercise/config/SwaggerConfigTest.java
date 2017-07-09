package com.codingexercise.config;

import org.junit.Test;
import org.mockito.Mock;

import static org.junit.Assert.*;

/**
 * Created by jenksy on 7/9/17.
 */
public class SwaggerConfigTest {

    @Mock
    SwaggerConfig swaggerConfig;
    @Test
    public void api() throws Exception {
        swaggerConfig = new SwaggerConfig();
        assertNotNull(swaggerConfig);
    }

}