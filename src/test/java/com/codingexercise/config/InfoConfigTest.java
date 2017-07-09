package com.codingexercise.config;

import org.junit.Test;
import org.mockito.Mock;

import static org.junit.Assert.*;

/**
 * Created by jenksy on 7/9/17.
 */
public class InfoConfigTest {
    @Mock
    InfoConfig infoConfig;
    @Test
    public void contribute() throws Exception {
        infoConfig = new InfoConfig();
        assertNotNull(infoConfig);
    }

}