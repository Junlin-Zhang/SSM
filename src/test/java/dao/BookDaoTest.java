package dao;

import com.tridium.dao.BookDao;
import com.tridium.model.Book;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class BookDaoTest {

    @Resource
    BookDao bookDao;
    @Test
    public void list(){
        List<Book> bookList = bookDao.list();
        System.out.println(bookList);
    }
}
