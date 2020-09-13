package com.vimcar.server.rest.routes;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static com.vimcar.server.utils.Constants.PROFILE_TEST;

@SpringBootTest
@ActiveProfiles(PROFILE_TEST)
@AutoConfigureMockMvc
@Tag("integration-test")
class MessageControllerIntegrationTest {

    @Autowired
    private MockMvc controller;


    @Test
    public void shouldProcessMessageSucceessfully() throws Exception {
        controller.perform(
                MockMvcRequestBuilders
                        .post("/message")
                        .content("Hello")
                        .contentType(MediaType.TEXT_PLAIN)
        ).andExpect(MockMvcResultMatchers
                .status()
                .isOk());
    }


}
