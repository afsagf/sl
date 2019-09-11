package ggy;

import com.sy.config.SpringConfig;
import com.sy.service.ggy.Au_functionService;
import com.sy.service.ggy.Au_userService;
import com.sy.service.ggy.GInfo_annexesService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
@SpringBootTest(classes = SpringConfig.class)
@RunWith(SpringJUnit4ClassRunner.class)
public class test {
    @Autowired
    GInfo_annexesService infoAnnexesService;
    @Autowired
    Au_userService au_userService;
    @Autowired
    Au_functionService au_functionService;
    @Test
    public void test() throws Exception {
        System.out.println(au_userService.findAll("",1,3));
    }
}
