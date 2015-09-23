
import com.tutorial.entity.BlogEntry;
import com.tutorial.mvc.BlogEntryController;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.junit.Assert.*;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

/**
 * Created by sampath on 9/22/2015.
 */

public class BlogEntryControllerTest {

    @InjectMocks
    private BlogEntryController cont;

    private MockMvc mockMvc;

    @Before
    public void setup(){
        MockitoAnnotations.initMocks(this);
        mockMvc = MockMvcBuilders.standaloneSetup(cont).build();
    }

    @Test
    public void doTest() throws Exception{
        mockMvc.perform(get("/test")).andDo(MockMvcResultHandlers.print());
    }

}

