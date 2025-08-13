package com.example.demo;

import com.example.demo.controllers.homeController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

@WebMvcTest(homeController.class)
public class homeControllerTest {
    @Autowired
    private MockMvc mockMvc;
    @Test
    public void testHomePage() throws Exception{
        mockMvc.perform(get("/home"))
                .andExpect(status().isOk())
                .andExpect(view().name("home"))
                .andExpect(content().string(containString("Домашняя страница.")));
    }
}
