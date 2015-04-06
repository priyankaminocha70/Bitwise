package test.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.forum.entities.Tags;
import com.forum.service.TagsService;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring.xml")
public class TestTagService {
	
	@Autowired
	TagsService service;
	@Test
	public void test() {

		Tags tag= new Tags();
		tag.setTagName("javascript");
		service.addTagsService(tag);
	}

}